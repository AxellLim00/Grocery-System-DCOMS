package main;


import main.model.Records;
import main.model.Admin;
import main.model.Product;
import main.model.SalesExec;
import java.rmi.AlreadyBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class RunServer {

    public static void main(String [] args) throws RemoteException, AlreadyBoundException {
        
        //To run the server, it will initialize a registry and bind names for each class for a client to locate 
        
        Registry registry =  LocateRegistry.createRegistry(1099);
        registry.bind("Product", new Product());
        registry.bind("Admin", new Admin());
        registry.bind("SalesExec", new SalesExec());
        registry.bind("Records", new Records());
        System.out.println("Server started");

    }
}
