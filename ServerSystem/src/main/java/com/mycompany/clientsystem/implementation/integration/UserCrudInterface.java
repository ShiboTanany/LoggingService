/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.clientsystem.implementation.integration;
import com.mycompany.clientsystem.entities.User;
/**
 *
 * @author shibo
 */
public interface UserCrudInterface {
    public  User loginUser(String username, String password) throws Exception ;
}
