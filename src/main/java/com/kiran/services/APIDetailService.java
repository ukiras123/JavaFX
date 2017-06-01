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

        if (apiName.equalsIgnoreCase("PRODUCT")) {
            return Constants.ReadConstant.productRead;
        } else if (apiName.equalsIgnoreCase("PRICE_CATEGORY")) {
            return Constants.ReadConstant.priceCategoryRead;
        } else if (apiName.equalsIgnoreCase("FULFILLMENT_ITEM")) {
            return Constants.ReadConstant.fulfillmentRead;
        } else if (apiName.equalsIgnoreCase("SINGLE")) {
            return Constants.ReadConstant.singleRead;
        } else if (apiName.equalsIgnoreCase("FIXED_BUNDLE")) {
            return Constants.ReadConstant.fixedBundleRead;
        } else if (apiName.equalsIgnoreCase("CHOICE_BUNDLE")) {
            return Constants.ReadConstant.choiceBundleRead;
        } else if (apiName.equalsIgnoreCase("SUBSCRIPTION")) {
            return Constants.ReadConstant.scheduleRead;
        } else if (apiName.equalsIgnoreCase("PRICE_MODEL")) {
            return Constants.ReadConstant.priceModelRead;
        } else if (apiName.equalsIgnoreCase("TIERED_SHIPPING_RATE")) {
            return Constants.ReadConstant.tieredShippingRateRead;
        } else if (apiName.equalsIgnoreCase("INSTALLMENT_PLAN")) {
            return Constants.ReadConstant.installmentPlanRead;
        } else if (apiName.equalsIgnoreCase("SCHEDULE")) {
            return Constants.ReadConstant.scheduleRead;
        } else if (apiName.equalsIgnoreCase("CONTINUITY_PLAN")) {
            return Constants.ReadConstant.continuityPlanRead;
        } else if (apiName.equalsIgnoreCase("MARKETING_PROGRAM")) {
            return Constants.ReadConstant.marketingProgramRead;
        } else {
            return "Check back soon.";
        }
    }

    private String getCreateResponse(String apiName) {
        if (apiName.equalsIgnoreCase("PRODUCT")) {
            return Constants.CreateConstant.productCreate;
        } else if (apiName.equalsIgnoreCase("PRICE_CATEGORY")) {
            return Constants.CreateConstant.priceCategoryCreate;
        } else if (apiName.equalsIgnoreCase("FULFILLMENT_ITEM")) {
            return Constants.CreateConstant.fulfillmentCreate;
        } else if (apiName.equalsIgnoreCase("SINGLE")) {
            return Constants.CreateConstant.singleCreate;
        } else if (apiName.equalsIgnoreCase("FIXED_BUNDLE")) {
            return Constants.CreateConstant.fixedBundleCreate;
        } else if (apiName.equalsIgnoreCase("CHOICE_BUNDLE")) {
            return Constants.CreateConstant.choiceBundleCreate;
        } else if (apiName.equalsIgnoreCase("SUBSCRIPTION")) {
            return Constants.CreateConstant.scheduleCreate;
        } else if (apiName.equalsIgnoreCase("PRICE_MODEL")) {
            return Constants.CreateConstant.priceModelCreate;
        } else if (apiName.equalsIgnoreCase("TIERED_SHIPPING_RATE")) {
            return Constants.CreateConstant.tieredShippingRateCreate;
        } else if (apiName.equalsIgnoreCase("INSTALLMENT_PLAN")) {
            return Constants.CreateConstant.installmentPlanCreate;
        } else if (apiName.equalsIgnoreCase("SCHEDULE")) {
            return Constants.CreateConstant.scheduleCreate;
        } else if (apiName.equalsIgnoreCase("CONTINUITY_PLAN")) {
            return Constants.CreateConstant.continuityPlanCreate;
        } else if (apiName.equalsIgnoreCase("MARKETING_PROGRAM")) {
            return Constants.CreateConstant.marketingProgramCreate;
        } else {
            return "Check back soon.";
        }
    }


}
