package com.kiran.controllers;

/**
 * Created by Kiran on 5/29/17.
 */
public class BaseController {

    private static String userName = "";
    private static String firstName = "";
    private static String lastName = "";


    public static String getUserName() {
        return userName;
    }

    public static void setUserName(String userName) {
        BaseController.userName = userName;
    }

    public static String getFirstName() {
        return firstName;
    }

    public static void setFirstName(String firstName) {
        BaseController.firstName = firstName;
    }

    public static String getLastName() {
        return lastName;
    }

    public static void setLastName(String lastName) {
        BaseController.lastName = lastName;
    }
}
