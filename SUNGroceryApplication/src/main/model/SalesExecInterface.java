package main.model;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.Vector;

public interface SalesExecInterface extends Remote{
    
    //Each SalesExec has to have the following attributes
    //private String id, firstName, lastName, password;
    
    public String getFirstName() throws RemoteException;

    public String getLastName() throws RemoteException;
    
    public boolean login(String username, String password) throws RemoteException; //Logn method for SalesExec
    
    /* 0 means safely registered, 1 means ID is taken, 2 means Other Errors (Check Error Log) */
    public int register(String id, String firstName, String lastName, String password) throws RemoteException; //Method for registering new SalesExec 
    
    public boolean remove(String id) throws RemoteException; //Used by admin to remove a SalesExec 
    
    public boolean find(String id) throws RemoteException; //Used to find a SalesExec
    
    public Vector<String> findAll() throws RemoteException; //Shows all SalesExec

    public String getFirstName(String lId);
}
