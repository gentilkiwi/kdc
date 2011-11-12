package org.kiwi.dictao.clients.d2s;

import org.kiwi.dictao.webservices.d2s.*;
import org.kiwi.dictao.clients.StandardWebService;
import org.kiwi.dictao.responses.d2s.signatureEx.Resultat;

import org.kiwi.utils.DataTypes;
import org.kohsuke.args4j.*;

import java.io.File;
import javax.xml.namespace.QName;
import javax.xml.ws.BindingProvider;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.UnknownHostException;

public class signatureEx extends StandardWebService {
    public enum FormatSignature {
        XMLDSIG, XADES,
        PKCS7, CMS, SMIME,
        PDF,
        PKCS1
    };

    public enum TypeSignature {
        ENVELOPING, ENVELOPING_CO, ENVELOPING_COUNT,
        ENVELOPED, ENVELOPED_COUNT,
        DETACHED, DETACHED_CO, DETACHED_COUNT,
        SHA1RSA, SHA256RSA, SHA384RSA, SHA512RSA,
        MD5RSA
    };
    
    @Option(name = "--dataToSign", required = true, usage = "Données à signer")
    private File dataToSign = null;
    @Option(name = "--signatureFormat", required = true, usage = "Format de signature demandé")
    private FormatSignature signatureFormat = null;
    @Option(name = "--signatureType", required = true, usage = "Type de signature demandé")
    private TypeSignature signatureType = null;
    @Option(name = "--signatureParameter", required = false, usage = "(optionel) Paramètres de signature")
    private String signatureParameter = null;

    @Option(name = "--signedFile", required = false, usage = "(optionel) Fichie signés en sortie")
    private File signedFile = null;


    /* A faire */
    @Option(name = "--detachedSignature", required = false, usage = "(optionel) Signature détachée")
    private File detachedSignature = null;
    @Option(name = "--signatureContext", required = false, usage = "(optionel) Contexte de signature (clés)")
    private String signatureContext = null;

    @Override
    public void parseAndRun(String[] arguments) {
        CmdLineParser monParseur = new CmdLineParser(this);

        try {
            super.parseAndRun(arguments);
            monParseur.parseArgument(arguments);

            if(wsdlUri == null) {
                wsdlUri = getClass().getResource("D2SInterfaceFrontEnd.wsdl");
            }
            
            System.out.println("dataToSign         : " + dataToSign.getPath());
            System.out.println("detachedSignature  : " + detachedSignature);
            System.out.println("signatureFormat    : " + signatureFormat);
            System.out.println("signatureType      : " + signatureType);
            System.out.println("signatureParameter : " + signatureParameter);
            System.out.println("signatureContext   : " + signatureContext);
            System.out.println();
            
            DataType maSignature = new DataType();
            
            if(isPlaintext) {
                DataString maStringData = new DataString();
                maStringData.setDataFormat(null);
                
                if(charset != null) {
                    maStringData.setValue(DataTypes.osStringFromFile(dataToSign, charset));
                } else {
                    maStringData.setValue(DataTypes.osStringFromFile(dataToSign));
                }
                
                maSignature.setValue(maStringData);
                
            } else {
                DataBinary maBinaryData = new DataBinary();
                maBinaryData.setDataFormat(null);
                maBinaryData.setValue(DataTypes.osArrayFromFile(dataToSign).toByteArray());
            
                maSignature.setBinaryValue(maBinaryData);
            }
            
            DataType maDetached = new DataType();
            ContextType monContext = new ContextType();

            ArrayOfPluginParameterStruct mesParamsPlugins = new ArrayOfPluginParameterStruct();

            D2S monD2S = new D2S(wsdlUri, new QName("http://www.dictao.com/D2S/Interface", "D2S"));
            D2SSoap monPort = monD2S.getD2SSoap();
            beginCall((BindingProvider) monPort);
            D2SResponseEx maReponse = monPort.signatureEx(requestId, transactionId, tag, maSignature, maDetached, signatureFormat.toString(), signatureType.toString(), signatureParameter, monContext, mesParamsPlugins);
            endCall();

            System.out.println(new Resultat(maReponse));

            if(signedFile != null) {
                System.out.println("Sortie dans : " + signedFile.getPath());
                FileOutputStream monStream = new FileOutputStream(signedFile);
                monStream.write(maReponse.getD2SSignature().getBinaryValue().getValue());
            } else {
                System.out.println("Taille de la réponse signée : " + maReponse.getD2SSignature().getBinaryValue().getValue().length);
            }

        } catch (CmdLineException ex) {
            System.err.println("Erreur : " + ex.getMessage());
            monParseur.printUsage(System.err);
        } catch (UnknownHostException ex) {
            System.err.println("Erreur de résolution du nom de machine : " + ex.getMessage());
        } catch (FileNotFoundException ex) {
            System.err.println("Erreur de lecture du fichier : " + ex.getMessage());
        } catch (IOException ex) {
            System.err.println("Erreur d\'E/S : " + ex.getMessage());
        }
    }

    public static void main(String[] args) {
        signatureEx monAppel = new signatureEx();
        monAppel.parseAndRun(args);
    }
}
