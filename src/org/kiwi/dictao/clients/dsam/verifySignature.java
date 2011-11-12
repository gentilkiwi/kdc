package org.kiwi.dictao.clients.dsam;

import org.kiwi.dictao.webservices.dsam.*;
import org.kiwi.dictao.clients.StandardWebService;
import org.kiwi.dictao.responses.dsam.verifySignature.Resultat;

import org.kiwi.utils.DataTypes;
import org.kohsuke.args4j.*;

import java.io.File;
import javax.xml.namespace.QName;
import javax.xml.ws.BindingProvider;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.UnknownHostException;

public class verifySignature extends StandardWebService{
    @Option(name = "--signature", required = true, usage = "Signature à valider")
    private File signature = null;
    
    @Override
    public void parseAndRun(String[] arguments) {
        CmdLineParser monParseur = new CmdLineParser(this);

        try {
            super.parseAndRun(arguments);
            monParseur.parseArgument(arguments);

            if(wsdlUri == null) {
                wsdlUri = getClass().getResource("DSAMInterfaceFrontEnd.wsdl");
            }

            System.out.println("signature     : " + signature.getPath());
            System.out.println();

            DataBinary maBinaryData = new DataBinary();
            maBinaryData.setDataFormat(null);
            maBinaryData.setValue(DataTypes.osArrayFromFile(signature).toByteArray());

            DataType maSignature = new DataType();
            maSignature.setBinaryValue(maBinaryData);

            DSAM monDSAM = new DSAM(wsdlUri, new QName("http://www.dictao.com/DSAM/Interface", "DSAM"));
            DSAMSoap monPort = monDSAM.getDSAMSoap();
            beginCall((BindingProvider) monPort);
            DSAMResponse maReponse = monPort.dsaMverifySignature(requestId, transactionId, maSignature, tag);
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
        verifySignature monAppel = new verifySignature();
        monAppel.parseAndRun(args);
    }
}
