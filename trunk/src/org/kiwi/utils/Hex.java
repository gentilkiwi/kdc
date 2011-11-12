package org.kiwi.utils;

public class Hex {

    public static String toHex(byte[] digest) {
        StringBuilder sb = new StringBuilder();
        for (byte b : digest) {
            sb.append(String.format("%1$02X", b));
        }
        return sb.toString();
    }
}
