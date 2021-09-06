package main;

import main.model.AdminInterface;
import main.model.ProductInterface;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Enumeration;
import java.util.Vector;
import main.model.SalesExecInterface;

public class ClientDCOMS {

    public static void main(String[] args) throws RemoteException, NotBoundException{
      
        //Every Client must have these 2 lines of code to communicate with the server    
        Registry registry = LocateRegistry.getRegistry("localhost",1099);
        
        //Afterwards, create an instance of an obejct from the interface's name and do a lookup to the server
        AdminInterface admin = (AdminInterface)registry.lookup("Admin");

        //Ths part is for actually calling the server to call its functions
        
        admin.register("admin", "Addy", "Ming", "admin");
        admin.find("admin");
        System.out.println(admin.getFirstName());
        
        //Repeat the process for different sections
        
//        ProductInterface product = (ProductInterface)registry.lookup("Product");
//        product.register("Milk Bag", "Dairy", 500, 5.8);
//        product.find("Milk Bag");
//        System.out.println(product.getPrice());
        

        
    }

}
