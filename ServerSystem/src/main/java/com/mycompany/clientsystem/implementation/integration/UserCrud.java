package com.mycompany.clientsystem.implementation.integration;

import com.mycompany.clientsystem.entities.User;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author shibo
 */
public class UserCrud implements UserCrudInterface{

    private static final List<User> listOfUsers = new ArrayList<>();

    static {
        listOfUsers.add(new User(0, "shibo", "root", "ROLE_USER"));
    }

    @Override
    public  User loginUser(String username, String password) throws Exception {
        User userFound = null;
        for (User user : listOfUsers) {
            if (user.getPassword().equals(password) && user.getUsername().equals(username)) {
                userFound = user;
            }
        }
        return userFound;
    }

}
