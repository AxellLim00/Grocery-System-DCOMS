package main.model;


import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.Vector;

public interface AdminInterface extends Remote{

    public String getFirstName() throws RemoteException;

    public String getLastName() throws RemoteException;
    
    public boolean login(String username, String password) throws RemoteException;
    
    /* 0 means safely registered, 1 means ID is taken, 2 means Other Errors (Check Error Log) */
    public int register(String id, String firstName, String lastName, String password) throws RemoteException;
    
    public boolean find(String id) throws RemoteException;
    
    public Vector<String> findAll() throws RemoteException;
}
