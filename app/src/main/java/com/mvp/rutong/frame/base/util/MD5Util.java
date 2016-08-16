package com.mvp.rutong.frame.base.util;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class MD5Util {
    private static final char[] DIGITS = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

    public MD5Util() {
    }

    public static String encode(String string) {
        try {
            MessageDigest e = MessageDigest.getInstance("MD5");
            return bytesToHexString(e.digest(string.getBytes()));
        } catch (NoSuchAlgorithmException var2) {
            var2.printStackTrace();
            return null;
        }
    }

    private static String bytesToHexString(byte[] bytes) {
        char[] buf = new char[bytes.length * 2];
        int c = 0;
        int i = 0;

        for (int z = bytes.length; i < z; ++i) {
            byte b = bytes[i];
            buf[c++] = DIGITS[b >> 4 & 15];
            buf[c++] = DIGITS[b & 15];
        }

        return new String(buf);
    }
}
