package com.mycompany.clientsystem.implementation;

import com.mycompany.clientsystem.entities.RowEntity;
import com.mycompany.clientsystem.implementation.integration.UserCrud;
import com.mycompany.clientsystem.entities.User;
import com.mycompany.clientsystem.intefaces.LogServiceInterface;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author shibo
 */
public class LogServiceImplementation extends UnicastRemoteObject implements LogServiceInterface {

 

    public LogServiceImplementation() throws RemoteException {
        super();
    }

    @Override
    public User login(String username, String password) throws RemoteException {
        try {
            return new UserCrud().loginUser(username, password);
        } catch (Exception ex) {
            return null;
        }

    }

    @Override
    public void LogRow(RowEntity rowEntity) throws RemoteException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
