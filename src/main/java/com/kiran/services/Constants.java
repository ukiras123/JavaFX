package com.kiran.services;

import com.kiran.Model.ValueSet.PROGRESS_MESSAGE;

/**
 * Created by Kiran on 5/29/17.
 */
public final class Constants {


    class ReadConstant{
        final static String productRead = "{\n" +
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

        final static String fulfillmentRead = "{\n" +
                "  \"itemCode\": \"PW0934\",\n" +
                "  \"brandCode\": \"PW\",\n" +
                "  \"type\": \"DISCRETE_ITEM\",\n" +
                "  \"description\": \"Lux Lotion 6.3 oz. blue label\",\n" +
                "  \"supersededItem\": null,\n" +
                "  \"countryOfManufacture\": \"CAN\",\n" +
                "  \"shippingRestriction\": null,\n" +
                "  \"hasHazardousMaterial\": false,\n" +
                "  \"locations\": [\n" +
                "    {\n" +
                "      \"locationCode\": \"FHR\",\n" +
                "      \"disposalMethod\": \"Trash\",\n" +
                "      \"isActive\": true\n" +
                "    }\n" +
                "  ],\n" +
                "  \"configurationStatus\": \"Valid\",\n" +
                "  \"operationalMode\": \"Active\",\n" +
                "  \"activationDate\": \"2017-02-10T00:00:00-05:00\",\n" +
                "  \"inactivationDate\": null,\n" +
                "  \"createdDate\": \"2016-12-23T14:47:31-05:00\",\n" +
                "  \"createdBy\": \"jsmith\",\n" +
                "  \"lastUpdatedDate\": \"2017-02-08T09:26:03-05:00\",\n" +
                "  \"lastUpdatedBy\": \"xgarcia\"\n" +
                "}";

        final static String singleRead = "{\n" +
                "  \"productCode\": \"PW1A8320\",\n" +
                "  \"brandCode\": \"PW\",\n" +
                "  \"type\": \"Single\",\n" +
                "  \"shippingTitle\": \"Premier Wellness Lux Lotion 2 oz.\",\n" +
                "  \"customerServiceDescription\": \"Lux Lotion 2 OZ\",\n" +
                "  \"size\": \"2 oz.\",\n" +
                "  \"weight\": null,\n" +
                "  \"supplySize\": null,\n" +
                "  \"marketRegions\": [\"USA\"],\n" +
                "  \"isStockedItem\": true,\n" +
                "  \"fulfillment\": {\n" +
                "    \"items\": [\"PW0934\",\"PW0675\"],\n" +
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


        final static String fixedBundleRead = "{\n" +
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
                "    \"items\": [\"PW0039\"],\n" +
                "    \"allocationAlgorithm\": null\n" +
                "  },\n" +
                "  \"components\": [\n" +
                "    {\n" +
                "      \"productCode\": \"PW3A0401\",\n" +
                "      \"quantity\": 1,\n" +
                "      \"isActive\": true\n" +
                "    },\n" +
                "    {\n" +
                "      \"productCode\": \"PW1A0020\",\n" +
                "      \"quantity\": 1,\n" +
                "      \"isActive\": true\n" +
                "    },\n" +
                "    {\n" +
                "      \"productCode\": \"PW1A1582\",\n" +
                "      \"quantity\": 2,\n" +
                "      \"isActive\": true\n" +
                "    }\n" +
                "  ],\n" +
                "  \"configurationStatus\": \"Valid\",\n" +
                "  \"operationalMode\": \"Active\",\n" +
                "  \"activationDate\": \"2017-02-10T00:00:00-05:00\",\n" +
                "  \"inactivationDate\": null,\n" +
                "  \"createdDate\": \"2016-12-23T14:47:31-05:00\",\n" +
                "  \"createdBy\": \"jsmith\",\n" +
                "  \"lastUpdatedDate\": \"2017-02-08T09:26:03-05:00\",\n" +
                "  \"lastUpdatedBy\": \"xgarcia\"\n" +
                "}";


        final static String choiceBundleRead = "{\n" +
                "  \"productCode\": \"PW2A0319\",\n" +
                "  \"brandCode\": \"PW\",\n" +
                "  \"type\": \"ChoiceBundle\",\n" +
                "  \"shippingTitle\": \"Premier Wellness Choice Bundle\",\n" +
                "  \"customerServiceDescription\": \"30 Day Customization\",\n" +
                "  \"size\": null,\n" +
                "  \"weight\": null,\n" +
                "  \"supplySize\": \"30 Day\",\n" +
                "  \"marketRegions\": [\"USA\"],\n" +
                "  \"isStockedItem\": false,\n" +
                "  \"fulfillment\": null,\n" +
                "  \"baseItems\": [\n" +
                "    {\n" +
                "      \"productCode\": \"PW3A0025\",\n" +
                "      \"quantity\": 1,\n" +
                "      \"isActive\": true\n" +
                "    }\n" +
                "  ],\n" +
                "  \"minimumTotalSelectedQuantity\": 2,\n" +
                "  \"maximumTotalSelectedQuantity\": 5,\n" +
                "  \"selectionGroups\": [\n" +
                "    {\n" +
                "      \"selectionGroupIdentifier\": \"A\",\n" +
                "      \"minimumGroupQuantity\": 1,\n" +
                "      \"maximumGroupQuantity\": 2,\n" +
                "      \"selectableItems\": [\n" +
                "        {\n" +
                "          \"productCode\": \"PW1A9087\",\n" +
                "          \"inclusion\": \"Optional\",\n" +
                "          \"defaultIncludedQuantity\": 1,\n" +
                "          \"minimumIncludedQuantity\": 1,\n" +
                "          \"maximumIncludedQuantity\": 2,\n" +
                "          \"isActive\": true\n" +
                "        },\n" +
                "        {\n" +
                "          \"productCode\": \"PW1A7291\",\n" +
                "          \"inclusion\": \"Optional\",\n" +
                "          \"defaultIncludedQuantity\": 0,\n" +
                "          \"minimumIncludedQuantity\": 1,\n" +
                "          \"maximumIncludedQuantity\": 1,\n" +
                "          \"isActive\": true\n" +
                "        }\n" +
                "      ]\n" +
                "    },\n" +
                "    {\n" +
                "      \"selectionGroupIdentifier\": \"B\",\n" +
                "      \"minimumGroupQuantity\": 1,\n" +
                "      \"maximumGroupQuantity\": 3,\n" +
                "      \"selectableItems\": [\n" +
                "        {\n" +
                "          \"productCode\": \"PW1A2843\",\n" +
                "          \"inclusion\": \"Mandatory\",\n" +
                "          \"defaultIncludedQuantity\": 1,\n" +
                "          \"minimumIncludedQuantity\": 1,\n" +
                "          \"maximumIncludedQuantity\": 2,\n" +
                "          \"isActive\": true\n" +
                "        },\n" +
                "        {\n" +
                "          \"productCode\": \"PW1A1726\",\n" +
                "          \"inclusion\": \"Optional\",\n" +
                "          \"defaultIncludedQuantity\": 0,\n" +
                "          \"minimumIncludedQuantity\": 1,\n" +
                "          \"maximumIncludedQuantity\": 2,\n" +
                "          \"isActive\": true\n" +
                "        }\n" +
                "      ]\n" +
                "    }\n" +
                "  ],\n" +
                "  \"configurationStatus\": \"Valid\",\n" +
                "  \"operationalMode\": \"Active\",\n" +
                "  \"activationDate\": \"2017-02-10T00:00:00-05:00\",\n" +
                "  \"inactivationDate\": null,\n" +
                "  \"createdDate\": \"2016-12-23T14:47:31-05:00\",\n" +
                "  \"createdBy\": \"jsmith\",\n" +
                "  \"lastUpdatedDate\": \"2017-02-08T09:26:03-05:00\",\n" +
                "  \"lastUpdatedBy\": \"xgarcia\"\n" +
                "}";


        final static String subscriptionRead = "{\n" +
                "  \"productCode\": \"PW5A9421\",\n" +
                "  \"brandCode\": \"PW\",\n" +
                "  \"type\": \"Subscription\",\n" +
                "  \"shippingTitle\": \"Premier Wellness 4 shipment Annual Subscription\",\n" +
                "  \"customerServiceDescription\": \"Wellness Annual Subscription 90-Day\",\n" +
                "  \"size\": null,\n" +
                "  \"weight\": null,\n" +
                "  \"supplySize\": \"90 Day\",\n" +
                "  \"marketRegions\": [\"USA\"],\n" +
                "  \"isStockedItem\": false,\n" +
                "  \"fulfillment\": null,\n" +
                "  \"shipmentSchedule\": \"45A319\",\n" +
                "  \"shipments\": [\n" +
                "    {\n" +
                "      \"shipmentNumber\": 1,\n" +
                "      \"products\": [\n" +
                "        {\"productCode\": \"PW2A3321\",\n" +
                "         \"quantity\": 1\n" +
                "        },\n" +
                "      \"repeat\": 2\n" +
                "      ]\n" +
                "    },\n" +
                "    {\n" +
                "      \"shipmentNumber\": 4,\n" +
                "      \"products\": [\n" +
                "        {\"productCode\": \"PW2A0782\",\n" +
                "         \"quantity\": 1\n" +
                "        },\n" +
                "      \"repeat\": 0\n" +
                "      ]\n" +
                "    }\n" +
                "  ],\n" +
                "  \"pricedPerShipment\": false,\n" +
                "  \"continuity\" : {\n" +
                "    \"isRequired\": true,\n" +
                "    \"continuityPlans\": [\n" +
                "      {\"planCode\": \"45R073\",\n" +
                "       \"isDefault\": false\n" +
                "      },\n" +
                "      {\"planCode\": \"45R082\",\n" +
                "       \"isDefault\": true\n" +
                "      }\n" +
                "    ]\n" +
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


        final static String priceCategoryRead = "{\n" +
                "  \"categoryCode\": \"23P007\",\n" +
                "  \"brandCode\": \"PW\",\n" +
                "  \"name\": \"retail\",\n" +
                "  \"description\": \"Retail pricing\",\n" +
                "  \"currency\": \"USD\",\n" +
                "  \"productPrices\": [\n" +
                "    {\n" +
                "      \"productCode\": \"PW2A0319\",\n" +
                "      \"price\": 34.98\n" +
                "    },\n" +
                "    {\n" +
                "      \"productCode\": \"PW2A8320\",\n" +
                "      \"price\": 8.59\n" +
                "    }\n" +
                "  ],\n" +
                "  \"configurationStatus\": \"Valid\",\n" +
                "  \"operationalMode\": \"Active\",\n" +
                "  \"activationDate\": \"2017-02-10T00:00:00-05:00\",\n" +
                "  \"inactivationDate\": null,\n" +
                "  \"createdDate\": \"2016-12-23T14:47:31-05:00\",\n" +
                "  \"createdBy\": \"jsmith\",\n" +
                "  \"lastUpdatedDate\": \"2017-02-08T09:26:03-05:00\",\n" +
                "  \"lastUpdatedBy\": \"xgarcia\"\n" +
                "}";


        final static String priceModelRead = "{\n" +
                "  \"modelCode\": \"23F007\",\n" +
                "  \"brandCode\": \"PW\",\n" +
                "  \"description\": \"Price model for non-member choice bundles.\",\n" +
                "  \"currency\": \"USD\",\n" +
                "  \"algorithm\": \"ADJUSTED_TOTAL\",\n" +
                "  \"defaultProductPrice\": 12.95,\n" +
                "  \"productPrices\": [\n" +
                "    {\n" +
                "      \"productCode\": \"PW2A0319\",\n" +
                "      \"price\": 34.98\n" +
                "    },\n" +
                "    {\n" +
                "      \"productCode\": \"PW2A8320\",\n" +
                "      \"price\": 8.59\n" +
                "    }\n" +
                "  ],\n" +
                "  \"baseAmount\": null,\n" +
                "  \"incrementalAmount\": null,\n" +
                "  \"adjustmentAmount\": -5.00,\n" +
                "  \"configurationStatus\": \"Valid\",\n" +
                "  \"operationalMode\": \"Active\",\n" +
                "  \"activationDate\": \"2017-02-10T00:00:00-05:00\",\n" +
                "  \"inactivationDate\": null,\n" +
                "  \"createdDate\": \"2016-12-23T14:47:31-05:00\",\n" +
                "  \"createdBy\": \"jsmith\",\n" +
                "  \"lastUpdatedDate\": \"2017-02-08T09:26:03-05:00\",\n" +
                "  \"lastUpdatedBy\": \"xgarcia\"\n" +
                "}";


        final static String tieredShippingRateRead = "{\n" +
                "  \"tableCode\": \"23T117\",\n" +
                "  \"description\": \"General Catalog Shipping Rates\",\n" +
                "  \"currency\": \"USD\",\n" +
                "  \"basis\": \"TOTAL_AMOUNT\",\n" +
                "  \"tiers\": [\n" +
                "    {\n" +
                "      \"upperBound\": 25.00,\n" +
                "      \"shippingMethodRates\": [\n" +
                "        {\n" +
                "          \"shippingMethod\": \"STD\",\n" +
                "          \"rate\": 5.99\n" +
                "        },\n" +
                "        {\n" +
                "          \"shippingMethod\": \"2DAY\",\n" +
                "          \"rate\": 7.99\n" +
                "        }\n" +
                "      ]\n" +
                "    },\n" +
                "    {\n" +
                "      \"upperBound\": 100.00,\n" +
                "      \"shippingMethodRates\": [\n" +
                "        {\n" +
                "          \"shippingMethod\": \"STD\",\n" +
                "          \"rate\": 0.00\n" +
                "        },\n" +
                "        {\n" +
                "          \"shippingMethod\": \"2DAY\",\n" +
                "          \"rate\": 9.99\n" +
                "        }\n" +
                "      ]\n" +
                "    }\n" +
                "  ],\n" +
                "  \"configurationStatus\": \"Valid\",\n" +
                "  \"operationalMode\": \"Active\",\n" +
                "  \"activationDate\": \"2017-02-10T00:00:00-05:00\",\n" +
                "  \"inactivationDate\": null,\n" +
                "  \"createdDate\": \"2016-12-23T14:47:31-05:00\",\n" +
                "  \"createdBy\": \"jsmith\",\n" +
                "  \"lastUpdatedDate\": \"2017-02-08T09:26:03-05:00\",\n" +
                "  \"lastUpdatedBy\": \"xgarcia\"\n" +
                "}";


        final static String installmentPlanRead = "{\n" +
                "  \"planCode\": \"23N039\",\n" +
                "  \"description\": \"3 payments, every 30 days, 9.95 first payment\",\n" +
                "  \"currency\": \"USD\",\n" +
                "  \"splitShippingCharge\": false,\n" +
                "  \"installments\": [\n" +
                "    {\n" +
                "      \"installmentNumber\": 1,\n" +
                "      \"daysOffset\": 0,\n" +
                "      \"amount\": 9.95,\n" +
                "      \"percentage\": null\n" +
                "    },\n" +
                "    {\n" +
                "      \"installmentNumber\": 2,\n" +
                "      \"daysOffset\": 30,\n" +
                "      \"amount\": null,\n" +
                "      \"percentage\": 60\n" +
                "    },\n" +
                "    {\n" +
                "      \"installmentNumber\": 3,\n" +
                "      \"daysOffset\": 30,\n" +
                "      \"amount\": null,\n" +
                "      \"percentage\": 40\n" +
                "    }\n" +
                "  ],\n" +
                "  \"configurationStatus\": \"Draft\",\n" +
                "  \"operationalMode\": \"Unpublished\",\n" +
                "  \"activationDate\": \"2018-02-10T00:00:00-05:00\",\n" +
                "  \"inactivationDate\": null,\n" +
                "  \"createdDate\": \"2017-12-23T14:47:31-05:00\",\n" +
                "  \"createdBy\": \"jsmith\",\n" +
                "  \"lastUpdatedDate\": \"2017-02-08T09:26:03-05:00\",\n" +
                "  \"lastUpdatedBy\": \"xgarcia\"\n" +
                "}";


        final static String scheduleRead = "{\n" +
                "  \"scheduleCode\": \"45L003\",\n" +
                "  \"description\": \"30-Day to Quarterly Repeat\",\n" +
                "  \"scheduleSegments\": [\n" +
                "    {\n" +
                "      \"segmentNumber\": 1,\n" +
                "      \"timepoint\" : {\n" +
                "        \"form\": \"INTERVAL\",\n" +
                "        \"duration\": 31\n" +
                "      },\n" +
                "      \"jump\": null,\n" +
                "      \"occurrences\": 1\n" +
                "    },\n" +
                "    {\n" +
                "      \"segmentNumber\": 2,\n" +
                "      \"timepoint\" : {\n" +
                "        \"form\": \"INTERVAL\",\n" +
                "        \"duration\": 92\n" +
                "      },\n" +
                "      \"jump\": null,\n" +
                "      \"occurrences\": 1\n" +
                "    }\n" +
                "  ],\n" +
                "  \"extendLastSegmentIndefinitely\": true,\n" +
                "  \"configurationStatus\": \"Valid\",\n" +
                "  \"operationalMode\": \"Active\",\n" +
                "  \"activationDate\": \"2017-02-10T00:00:00-05:00\",\n" +
                "  \"inactivationDate\": null,\n" +
                "  \"createdDate\": \"2016-12-23T14:47:31-05:00\",\n" +
                "  \"createdBy\": \"jsmith\",\n" +
                "  \"lastUpdatedDate\": \"2017-02-08T09:26:03-05:00\",\n" +
                "  \"lastUpdatedBy\": \"xgarcia\"\n" +
                "}";


        final static String continuityPlanRead = "{\n" +
                "  \"planCode\": \"45R8310\",\n" +
                "  \"description\": \"30-Day to Quarterly Repeat\",\n" +
                "  \"marketingProgramOverride\": 45M027\",\n" +
                "  \"renewalSchedule\": \"45A002\",\n" +
                "  \"transitions\": [\n" +
                "    {\n" +
                "      \"partitionNumber\": 1,\n" +
                "      \"renewals\": \"1\",\n" +
                "      \"revisedProduct\": \"PW45897\",\n" +
                "      \"revisedShippingMethod\": \"STD\",\n" +
                "      \"revisedPaymentPlan\": null,\n" +
                "      \"extraProducts\": null,\n" +
                "      \"priceOverride\": null,\n" +
                "      \"shippingChargeOverride\": null\n" +
                "    },\n" +
                "    {\n" +
                "      \"partitionNumber\": 2,\n" +
                "      \"renewals\": \"2,*2\",\n" +
                "      \"revisedProduct\": null,\n" +
                "      \"revisedShippingMethod\": null,\n" +
                "      \"revisedPaymentPlan\": null,\n" +
                "      \"extraProducts\": [\n" +
                "        {\n" +
                "          \"productCode\": \"PW03820\",\n" +
                "          \"quantity\": 1\n" +
                "        }\n" +
                "      ],\n" +
                "      \"priceOverride\": null,\n" +
                "      \"shippingChargeOverride\": null\n" +
                "    }\n" +
                "  ],\n" +
                "  \"disclosureText\": \"One month after initial shipment, you will convert to continuity every 90 days.\",\n" +
                "  \"configurationStatus\": \"Valid\",\n" +
                "  \"operationalMode\": \"Active\",\n" +
                "  \"activationDate\": \"2017-02-10T00:00:00-05:00\",\n" +
                "  \"inactivationDate\": null,\n" +
                "  \"createdDate\": \"2016-12-23T14:47:31-05:00\",\n" +
                "  \"createdBy\": \"jsmith\",\n" +
                "  \"lastUpdatedDate\": \"2017-02-08T09:26:03-05:00\",\n" +
                "  \"lastUpdatedBy\": \"xgarcia\"\n" +
                "}";


        final static String marketingProgramRead = "{\n" +
                "  \"programCode\": \"23M287\",\n" +
                "  \"brandCode\": \"PW\",\n" +
                "  \"description\": \"Member web catalog site for domestic U.S.\",\n" +
                "  \"priceCategoryCode\": \"23P904\",\n" +
                "  \"shippingChargeCategoryCode\": null,\n" +
                "  \"tieredShippingTableCode\": \"23T052\",\n" +
                "  \"refundPeriod\": 60,\n" +
                "  \"isShippingRefunded\": false,\n" +
                "  \"freeReturnShipping\": false,\n" +
                "  \"specialProvisions\": null,\n" +
                "  \"configurationStatus\": \"Draft\",\n" +
                "  \"operationalMode\": \"Unpublished\",\n" +
                "  \"activationDate\": \"2018-02-10T00:00:00-05:00\",\n" +
                "  \"inactivationDate\": null,\n" +
                "  \"createdDate\": \"2017-12-23T14:47:31-05:00\",\n" +
                "  \"createdBy\": \"jsmith\",\n" +
                "  \"lastUpdatedDate\": \"2017-02-08T09:26:03-05:00\",\n" +
                "  \"lastUpdatedBy\": \"xgarcia\"\n" +
                "}";

    }

    static class CreateConstant {
    final static String productCreate = PROGRESS_MESSAGE.CHECK_BACK_SOON.name();

    final static String fulfillmentCreate = PROGRESS_MESSAGE.CHECK_BACK_SOON.getMessage();

    final static String singleCreate = PROGRESS_MESSAGE.CHECK_BACK_SOON.getMessage();


    final static String fixedBundleCreate = PROGRESS_MESSAGE.CHECK_BACK_SOON.getMessage();


    final static String choiceBundleCreate = PROGRESS_MESSAGE.CHECK_BACK_SOON.getMessage();

    final static String subscriptionCreate = PROGRESS_MESSAGE.CHECK_BACK_SOON.getMessage();


    final static String priceCategoryCreate = PROGRESS_MESSAGE.CHECK_BACK_SOON.getMessage();


    final static String priceModelCreate = PROGRESS_MESSAGE.CHECK_BACK_SOON.getMessage();


    final static String tieredShippingRateCreate = PROGRESS_MESSAGE.CHECK_BACK_SOON.getMessage();


    final static String installmentPlanCreate = PROGRESS_MESSAGE.CHECK_BACK_SOON.getMessage();


    final static String scheduleCreate = PROGRESS_MESSAGE.CHECK_BACK_SOON.getMessage();


    final static String continuityPlanCreate = PROGRESS_MESSAGE.CHECK_BACK_SOON.getMessage();


    final static String marketingProgramCreate = PROGRESS_MESSAGE.CHECK_BACK_SOON.getMessage();

}

}
