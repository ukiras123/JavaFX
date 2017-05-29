package com.kiran.services;

/**
 * Created by Kiran on 5/29/17.
 */
public class Util {

    public static boolean containsWhitespace(String str) {
        if (!hasLength(str)) {
            return false;
        }
        int strLen = str.length();
        for (int i = 0; i < strLen; i++) {
            if (Character.isWhitespace(str.charAt(i))) {
                return true;
            }
        }
        return false;
    }

    public static boolean hasLength(String str) {
        return (str != null && str.length() > 0);
    }

    public static String convertToFirstCapital(String string) {
        return Character.toUpperCase(string.charAt(0)) + string.substring(1);
    }
}
