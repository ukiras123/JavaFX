package com.kiran.services;

import com.kiran.Model.Entity.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;
import java.util.Set;

/**
 * Created by Kiran on 5/28/17.
 */
public class Database {

    private SessionFactory factory;

    public void createUser(User tempUser) {
        Session session = generateSession();
        try {
            System.out.println("Creating new user object...");
            session.beginTransaction();
            System.out.println("Saving the user...");
            session.save(tempUser);
            session.getTransaction().commit();
            System.out.println("Done!");
        } finally {
            factory.close();
        }
    }

    public List<User> readUser(String userName, String password) {
        Session session = generateSession();
        List<User> users;
        try {
            // start a transaction
            session.beginTransaction();
            users = session.createQuery(
                    "FROM User u where u.userName= :userName AND u.password= :password")
                    .setParameter("userName", userName)
                    .setParameter("password", password)
                    .getResultList();
            displayUsers(users);
            session.getTransaction().commit();
            System.out.println("Done!");

        }
        finally {
            factory.close();
        }
        return users;
    }


    public List<User> getAllUsers() {
        Session session = generateSession();
        List<User> users;
        try {
            // start a transaction
            session.beginTransaction();
            users = session.createQuery(
                    "FROM User").getResultList();
            displayUsers(users);
            session.getTransaction().commit();
            System.out.println("Done!");

        }
        finally {
            factory.close();
        }
        return users;
    }



    private  Session generateSession() {
        factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(User.class)
                .buildSessionFactory();
        return factory.getCurrentSession();
    }

    private void displayUsers(List<User> users) {
        for (User tempStudent : users) {
            System.out.println(tempStudent);
        }
    }
}


