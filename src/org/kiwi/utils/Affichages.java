package org.kiwi.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;

public class Affichages {

    public static X509Certificate getAndDisplayCertificate(File monFichier, String description) throws FileNotFoundException, CertificateException, IOException
    {
        CertificateFactory cf = CertificateFactory.getInstance("X.509");
        InputStream inStream = new FileInputStream(monFichier);
        X509Certificate inCertif = (X509Certificate) cf.generateCertificate(inStream);
        inStream.close();

        System.out.println('\n' + description  + '\n' + new String(new char[description.length()]).replace('\0', '='));
        System.out.println("Fichier certificat : " + monFichier);
        System.out.println("DN certificat      : " + inCertif.getSubjectDN());
        System.out.println("Validité           : " + inCertif.getNotBefore() + " -> " + inCertif.getNotAfter());
        System.out.println("Numéro de série    : " + inCertif.getSerialNumber());
        System.out.println("Emetteur           : " + inCertif.getIssuerDN());

        return inCertif;
    }
    
}
