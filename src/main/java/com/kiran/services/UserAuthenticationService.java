package com.kiran.services;

import com.kiran.Model.Entity.User;
import com.kiran.Model.ValueSet.USER_ERROR;
import org.apache.commons.lang3.StringUtils;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by Kiran on 5/29/17.
 */
public class UserAuthenticationService {

    private static Set<USER_ERROR> errors;
    private DatabaseService databaseService;


    public User isValidUser(String userName, String password) {
        if (password.length() < 6 || StringUtils.isNumeric(userName) || Util.containsWhitespace(userName)) {
            return null;
        } else {
            databaseService = new DatabaseService();
            List<User> user = databaseService.readUser(userName, password);
            if (user.isEmpty()) {
                errors = new HashSet<>();
                errors.add(USER_ERROR.LOGIN);
                return null;
            } else {
                return user.get(0);
            }
        }
    }

    public boolean isValidSignupInput(String firstName, String lastName, String userName, String password) {
        boolean isValid = true;
        errors = new HashSet<>();
        databaseService = new DatabaseService();

        // Check for First Name
        if (StringUtils.isNumeric(firstName) || (firstName.length() > 15) || Util.containsWhitespace(firstName)){
            errors.add(USER_ERROR.FIRST_NAME);
            isValid = false;
        }

        // Check for Last Name
        if (StringUtils.isNumeric(lastName) || (lastName.length() > 15) || Util.containsWhitespace(lastName)) {
            errors.add(USER_ERROR.LAST_NAME);
            isValid = false;
        }

        // Check for User Name
        if (StringUtils.isNumeric(userName) || Util.containsWhitespace(userName)) {
            errors.add(USER_ERROR.USER_NAME);
            isValid = false;
        } else {
            List<User> users = databaseService.getAllUsers();
            for (User user : users) {
                if (user.getUserName().equalsIgnoreCase(userName)) {
                    errors.add(USER_ERROR.USER_NAME);
                    isValid = false;
                }
            }
        }

        // Check for User Name
        if (password.length() < 6) {
            errors.add(USER_ERROR.PASSWORD);
            isValid = false;
        }
        return isValid;
    }

    public static Set<USER_ERROR> getErrors() {
        return errors;
    }
}
