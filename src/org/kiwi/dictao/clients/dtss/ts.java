package org.kiwi.dictao.clients.dtss;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Security;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.bouncycastle.tsp.*;
import org.kiwi.dictao.clients.HttpsWebServiceClient;
import org.kiwi.dictao.responses.dtss.ts.Resultat;
import org.kiwi.utils.Affichages;
import org.kiwi.utils.Connections;
import org.kiwi.utils.DataTypes;
import org.kiwi.utils.Hex;
import org.kohsuke.args4j.CmdLineException;
import org.kohsuke.args4j.CmdLineParser;
import org.kohsuke.args4j.Option;

public class ts extends HttpsWebServiceClient {

    public enum TypeHash {

        MD5,
        SHA1, SHA224, SHA256, SHA384, SHA512,
        RIPEMD128, RIPEMD160, RIPEMD256,
        GOST3411
    };
    @Option(name = "--va-file", required = false, usage = "(optionnel) Certificat publique de signature TS")
    private File vaFile = null;
    @Option(name = "--hashType", required = false, usage = "(optionnel) Type de hash à effectuer")
    private TypeHash hashType = TypeHash.SHA1;
    
    @Option(name = "--dataToTS", required = true, usage = "Données à signer")
    private File dataToTS = null;
    @Option(name = "--hash", required = false, usage = "(optionnel) Indique que les données à signer sont déjà un hash")
    private Boolean alreadyHash = false;
    
    @Option(name = "--policy", required = false, usage = "(optionnel) Indique la politique de signature")
    private String signPolicy = null;
        
    @Option(name = "--dest-file", required = false, usage = "(optionnel) Fichier de sortie du jeton")
    private File destFile = null;
    

    @Override
    public void parseAndRun(String[] arguments) {
        CmdLineParser monParseur = new CmdLineParser(this);
        Security.addProvider(new BouncyCastleProvider());

        try {
            super.parseAndRun(arguments);
            monParseur.parseArgument(arguments);

            byte monDigest[] = DataTypes.osArrayFromFile(dataToTS).toByteArray();
            if (!alreadyHash) {
                MessageDigest monHasheur = MessageDigest.getInstance(hashType.toString(), "BC");
                monDigest = monHasheur.digest(monDigest);
            }

            System.out.println("Fichier à horodater    : " + dataToTS.getPath());
            System.out.println("Type de hash           : " + hashType.toString());
            System.out.println("Déjà un hash ?         : " + alreadyHash);
            System.out.println("Hash                   : " + Hex.toHex(monDigest));
            
            TimeStampRequestGenerator generator = new TimeStampRequestGenerator();
            BigInteger nonce = BigInteger.valueOf(System.currentTimeMillis());

            if(signPolicy != null)
            {
                System.out.println("Politique de signature : " + signPolicy);
                generator.setReqPolicy(signPolicy);
            }
            
            X509Certificate maMonCertifDeValidation = null;
            if (vaFile != null) {
                maMonCertifDeValidation = Affichages.getAndDisplayCertificate(vaFile, "Certificat de signature TS (validation)");
            }
            
            System.out.println("\nRequête TS\n==========");
            
            
            TimeStampRequest requete = generator.generate(hashToTSPAlgo(hashType), monDigest, nonce);
                        
            beginCall(null);
            TimeStampResponse maReponse = new TimeStampResponse(Connections.getMyResponse(wsUri, requete.getEncoded(), "application/timestamp-query", "application/timestamp-reply"));
            endCall();

            System.out.println(new Resultat(maReponse, requete, maMonCertifDeValidation));

            if(destFile != null && maReponse.getTimeStampToken() != null) {
                System.out.println("Sortie dans : " + destFile.getPath());
                FileOutputStream monStream = new FileOutputStream(destFile);
                monStream.write(maReponse.getTimeStampToken().getEncoded());
            } else {
                System.out.println("Taille du jeton : " + maReponse.getTimeStampToken().getEncoded().length);
            }
            
        } catch (CmdLineException ex) {
            System.err.println("Erreur : " + ex.getMessage());
            monParseur.printUsage(System.err);
        } catch (TSPException ex) {
            System.err.println("Erreur TimeStamp : " + ex.getMessage());
        } catch (NoSuchProviderException ex) {
            System.err.println("Erreur de provider : " + ex.getMessage());
        } catch (NoSuchAlgorithmException ex) {
            System.err.println("Erreur d\'algorithme : " + ex.getMessage());
        } catch (CertificateException ex) {
            System.err.println("Erreur de certificat : " + ex.getMessage());
        } catch (FileNotFoundException ex) {
            System.err.println("Erreur de lecture du fichier : " + ex.getMessage());
        } catch (IOException ex) {
            System.err.println("Erreur d\'E/S : " + ex.getMessage());
        }
    }

    public static String hashToTSPAlgo(TypeHash hashType) {
        switch (hashType) {
            case MD5:
                return TSPAlgorithms.MD5;
            case SHA1:
                return TSPAlgorithms.SHA1;
            case SHA224:
                return TSPAlgorithms.SHA224;
            case SHA256:
                return TSPAlgorithms.SHA256;
            case SHA512:
                return TSPAlgorithms.SHA512;
            case RIPEMD128:
                return TSPAlgorithms.RIPEMD128;
            case RIPEMD160:
                return TSPAlgorithms.RIPEMD160;
            case RIPEMD256:
                return TSPAlgorithms.RIPEMD256;
            case GOST3411:
                return TSPAlgorithms.GOST3411;
            default:
                return null;
        }
    }

    public static void main(String[] args) {
        ts monAppel = new ts();
        monAppel.parseAndRun(args);
    }
}
