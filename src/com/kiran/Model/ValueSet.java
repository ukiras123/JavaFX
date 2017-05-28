package com.kiran.Model;

import java.util.EnumSet;
import java.util.Set;

/**
 * Created by Kiran on 5/28/17.
 */
public class ValueSet {
    public enum API_NAME{
        PRODUCT(EnumSet.of(API_METHOD.READ, API_METHOD.CREATE));

        private Set<API_METHOD> allowedMethods;
        private API_NAME(EnumSet<API_METHOD> allowedMethods) {
            this.allowedMethods = allowedMethods;
        }
    }
    public enum API_METHOD{
        READ,
        CREATE;
    }

    public static API_NAME valueFor(String str) {
        try {
            return API_NAME.valueOf(str.toUpperCase());
        } catch (Exception e) {
            throw new IllegalArgumentException(str + " is an invalid value.");
        }
    }

}
