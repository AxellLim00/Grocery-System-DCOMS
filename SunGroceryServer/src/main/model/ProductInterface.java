package main.model;


import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.Vector;


public interface ProductInterface extends Remote{
    public String getName() throws RemoteException;
    
    public int getStock() throws RemoteException;
    
    public double getPrice() throws RemoteException;
    
    public String getCategory() throws RemoteException;
    
    /* 0 means safely registered, 1 means Name is taken, 2 means Other Errors (Check Error Log) */
    public int register(String name, String category, int stock, double price) throws RemoteException;
    
    public boolean remove(String name) throws RemoteException;
    
    public boolean find(String name) throws RemoteException;
    
    public Vector<String> findAll() throws RemoteException;
}
