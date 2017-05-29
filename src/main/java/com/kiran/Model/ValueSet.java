package com.kiran.Model;

import java.util.EnumSet;
import java.util.Set;

/**
 * Created by Kiran on 5/28/17.
 */
public class ValueSet {

    public enum USER{
        KIRAN("password");

        private String password;

        USER(String password) {
            this.password = password;
        }

        public String getPassword() {
            return password;
        }
    }


    public enum USER_ERROR {
        FIRST_NAME("Invalid String"),
        LAST_NAME("Invalid String"),
        USER_NAME("Invalid String/Already Exists"),
        PASSWORD("Min 6 digits"),
        LOGIN("Invalid user/pass");

        private String errorMessage;
        USER_ERROR(String errorMessage) {
            this.errorMessage = errorMessage;
        }

        public String getErrorMessage() {
            return errorMessage;
        }
    }




    public enum API_NAME{
        PRODUCT(EnumSet.of(API_METHOD.READ, API_METHOD.CREATE)),
        PRICE_CATEGORY(EnumSet.of(API_METHOD.READ, API_METHOD.CREATE));

        private Set<API_METHOD> allowedMethods;

        API_NAME(EnumSet<API_METHOD> allowedMethods) {
            this.allowedMethods = allowedMethods;
        }

        public Set<API_METHOD> getAllowedMethods() {
            return allowedMethods;
        }
    }
    public enum API_METHOD{
        READ,
        CREATE
    }

    public static API_NAME valueFor(String str) {
        try {
            return API_NAME.valueOf(str.toUpperCase());
        } catch (Exception e) {
            throw new IllegalArgumentException(str + " is an invalid value.");
        }
    }

}
