package org.kiwi.dictao.clients.dtss;

import org.kiwi.dictao.webservices.dtss.*;
import org.kiwi.dictao.clients.StandardWebService;
import org.kiwi.dictao.responses.dtss.insertTimeStampEx.Resultat;

import org.kiwi.utils.DataTypes;
import org.kohsuke.args4j.*;

import java.io.File;
import javax.xml.namespace.QName;
import javax.xml.ws.BindingProvider;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.UnknownHostException;

public class insertTimeStampEx extends StandardWebService{
    @Option(name = "--signature", required = true, usage = "Signature à horodater")
    private File dataToSign = null;
    @Option(name = "--signatureParameter", required = false, usage = "Un ou plusieurs paramètres de signature, dépendants du format de signature demandé")
    private String signatureParameter = null;

    @Override
    public void parseAndRun(String[] arguments) {
        CmdLineParser monParseur = new CmdLineParser(this);

        try {
            super.parseAndRun(arguments);
            monParseur.parseArgument(arguments);

            if(wsdlUri == null) {
                wsdlUri = getClass().getResource("DTSSInterfaceFrontEnd.wsdl");
            }
            
            System.out.println("signature          : " + dataToSign.getPath());
            System.out.println("signatureParameter : " + signatureParameter);
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
            
            ArrayOfPluginParameterStruct mesParamsPlugins = new ArrayOfPluginParameterStruct();

            DTSS monDTSS = new DTSS(wsdlUri, new QName("http://www.dictao.com/DTSS/Interface", "DTSS"));
            DTSSSoap monPort = monDTSS.getDTSSSoap();
            beginCall((BindingProvider) monPort);
            DTSSResponseEx maReponse = monPort.insertTimeStampEx(requestId, transactionId, tag, maSignature, signatureParameter, mesParamsPlugins);
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
        insertTimeStampEx monAppel = new insertTimeStampEx();
        monAppel.parseAndRun(args);
    }
}
