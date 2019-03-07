package com.mycompany.clientsystem.implementation;

import com.mycompany.clientsystem.intefaces.LogServiceInterface;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 *
 * @author shibo
 */
public class SingletonObject {

    private SingletonObject() {
    }

    public static LogServiceInterface getInstance() {
       
           LogServiceInterface stub=null;
        try {

            Registry reg = LocateRegistry.getRegistry("localhost", 1200);
             stub = (LogServiceInterface) reg.lookup("logService");
           
        } catch (Exception e) {
            System.out.println("" + e.getMessage());
        }
        
        return stub;
    }
}
