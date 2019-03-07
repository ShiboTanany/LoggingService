package com.mycompany.serversystem;

import com.mycompany.clientsystem.implementation.LogServiceImplementation;
import com.mycompany.clientsystem.intefaces.LogServiceInterface;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 *
 * @author shibo
 */
public class MyServer {

    public static void main(String args[]) {
        try {
            Registry reg;
            LogServiceInterface stub = new LogServiceImplementation();
            reg=LocateRegistry.createRegistry(1200);
            reg.rebind("logService", stub);
            System.out.println("Running");
            
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
