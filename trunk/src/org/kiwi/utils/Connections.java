package org.kiwi.utils;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class Connections {

    public static InputStream getMyResponse(URL monURL, byte[] maRequete, String contentType, String acceptType) throws IOException {

        HttpURLConnection con = (HttpURLConnection) monURL.openConnection();
        con.setRequestProperty("Content-Type", contentType);
        con.setRequestProperty("Accept", acceptType);
        con.setDoOutput(true);
        OutputStream out = con.getOutputStream();
        DataOutputStream dataOut = new DataOutputStream(new BufferedOutputStream(out));
        dataOut.write(maRequete);
        dataOut.flush();
        dataOut.close();

        System.out.println("Code retour HTTP : " + con.getResponseCode() + " " + con.getResponseMessage());
        return (InputStream) con.getContent();
    }
}
