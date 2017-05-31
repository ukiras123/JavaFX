package com.kiran.services;

/**
 * Created by Kiran on 5/28/17.
 */
public class APIDetailService {


    public String getSampleResponse(String apiName, String method) {
        if ( method.equalsIgnoreCase("READ")) {
            return getReadResponse(apiName);
        } else if (method.equalsIgnoreCase("CREATE")) {
            return getCreateResponse(apiName);
        }


        return "";

    }


    private String getReadResponse(String apiName) {
            return Constants.productRead;
    }

    private String getCreateResponse(String apiName) {
            return Constants.productRead;
    }


}
