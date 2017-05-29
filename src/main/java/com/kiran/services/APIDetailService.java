package com.kiran.services;

/**
 * Created by Kiran on 5/28/17.
 */
public class APIDetailService {


    public String getSampleResponse(String apiName, String method) {
        String response = "";
        switch (apiName) {
            case "PRODUCT":
                return getProductResponse(method);
        }
    return "";
    }

    public String getProductResponse(String method) {
        if (method == "READ") {
            return Constants.productRead;
        }
        return null;
    }



}
