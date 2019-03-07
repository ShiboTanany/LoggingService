package com.mycompany.clientsystem.intefaces;

import com.mycompany.clientsystem.entities.RowEntity;
import com.mycompany.clientsystem.entities.User;
import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author shibo
 */
public interface LogServiceInterface extends Remote {

    public User login(String username, String password) throws RemoteException;

    public void LogRow(RowEntity rowEntity) throws RemoteException;

}
