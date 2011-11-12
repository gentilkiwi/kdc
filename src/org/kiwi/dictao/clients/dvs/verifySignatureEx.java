package org.kiwi.dictao.clients.dvs;

import org.kiwi.dictao.webservices.dvs.*;
import org.kiwi.dictao.clients.StandardWebService;
import org.kiwi.dictao.responses.dvs.verifySignatureEx.Resultat;

import org.kiwi.utils.DataTypes;
import org.kohsuke.args4j.*;

import java.io.File;
import javax.xml.namespace.QName;
import javax.xml.ws.BindingProvider;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.UnknownHostException;

public class verifySignatureEx extends StandardWebService{
    @Option(name = "--refreshCRLs", required = false, usage = "(optionnel) Force le serveur à re-télécharger les CRL avant traitement")
    private boolean refreshCRLs = false;

    @Option(name = "--signature", required = true, usage = "Signature à valider")
    private File signature = null;
    /* A faire */
    @Option(name = "--signedData", required = false, usage = "Donnée objet de la signature")
    private File signedData = null;
    @Option(name = "--signedDataHash", required = false, usage = "Empreinte de la donnée signée")
    private String signedDataHash = null;
    @Option(name = "--certificat", required = false, usage = "Certificat du signataire (pour le format PKCS#1)")
    private File certificat = null;
    @Option(name = "--properties", required = false, usage = "Propriétés de la méthode de validationd de signature")
    private String properties = null;

    @Override
    public void parseAndRun(String[] arguments) {
        CmdLineParser monParseur = new CmdLineParser(this);

        try {
            super.parseAndRun(arguments);
            monParseur.parseArgument(arguments);

            if(wsdlUri == null) {
                wsdlUri = getClass().getResource("DVSInterfaceFrontEnd.wsdl");
            }

            System.out.println("refreshCRLs   : " + refreshCRLs);
            System.out.println("signature     : " + signature.getPath());
            System.out.println("signedData    : " + signedData/*.getPath()*/);
            System.out.println("signedDataHash: " + signedDataHash);
            System.out.println("certificat    : " + certificat/*.getPath()*/);
            System.out.println("properties    : " + properties);
            System.out.println();

            DataBinary maBinaryData = new DataBinary();
            maBinaryData.setDataFormat(null);
            maBinaryData.setValue(DataTypes.osArrayFromFile(signature).toByteArray());

            DataType maSignature = new DataType();
            maSignature.setBinaryValue(maBinaryData);

            DataType maSignedData = new DataType();
            String strCertificat = new String();

            ArrayOfPluginParameterStruct mesParamsPlugins = new ArrayOfPluginParameterStruct();
            
            DVS monDVS = new DVS(wsdlUri, new QName("http://www.dictao.com/DVS/Interface", "DVS"));
            DVSSoap monPort = monDVS.getDVSSoap();
            beginCall((BindingProvider) monPort);
            DVSResponseEx maReponse = monPort.verifySignatureEx(requestId, transactionId, (refreshCRLs ? 1 : 0), tag, maSignature, maSignedData, signedDataHash, strCertificat, properties, mesParamsPlugins);
            endCall();

            System.out.println(new Resultat(maReponse));

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
        verifySignatureEx monAppel = new verifySignatureEx();
        monAppel.parseAndRun(args);
    }
}
