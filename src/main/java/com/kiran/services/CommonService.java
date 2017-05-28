package com.kiran.services;

import com.kiran.Model.ValueSet.USER;

/**
 * Created by Kiran on 5/28/17.
 */
public class CommonService {

    public String getSampleResponse(String parent, String method) {
        String response = "";

        switch (parent) {
            case "PRODUCT":
                return getProductResponse(method);
        }
    return "";
    }

    public String getProductResponse(String method) {

        if (method == "READ") {
            return "{\n" +
                    "  \"productCode\": \"PW2A0319\",\n" +
                    "  \"brandCode\": \"PW\",\n" +
                    "  \"type\": \"FixedBundle\",\n" +
                    "  \"shippingTitle\": \"Premier Wellness Booster Pack 1 Month Supply\",\n" +
                    "  \"customerServiceDescription\": \"Booster Pack 30 Day\",\n" +
                    "  \"size\": null,\n" +
                    "  \"weight\": null,\n" +
                    "  \"supplySize\": \"30 Day\",\n" +
                    "  \"marketRegions\": [\"USA\",\"CAN\"],\n" +
                    "  \"isStockedItem\": true,\n" +
                    "  \"fulfillment\": {\n" +
                    "    \"items\": [\n" +
                    "      {\"itemCode\": \"PW0039\"}\n" +
                    "    ],\n" +
                    "    \"allocationAlgorithm\": null\n" +
                    "  },\n" +
                    "  \"configurationStatus\": \"Valid\",\n" +
                    "  \"operationalMode\": \"Active\",\n" +
                    "  \"activationDate\": \"2017-02-10T00:00:00-05:00\",\n" +
                    "  \"inactivationDate\": null,\n" +
                    "  \"createdDate\": \"2016-12-23T14:47:31-05:00\",\n" +
                    "  \"createdBy\": \"jsmith\",\n" +
                    "  \"lastUpdatedDate\": \"2017-02-08T09:26:03-05:00\",\n" +
                    "  \"lastUpdatedBy\": \"xgarcia\"\n" +
                    "}";
        }
        return null;
    }

    public static boolean isValidUser(String user, String password) {
        for (USER u : USER.values()) {
            if (u.name().equalsIgnoreCase(user) && u.getPassword().equals(password)) {
                return true;
            }
        }
        return false;
    }

}
