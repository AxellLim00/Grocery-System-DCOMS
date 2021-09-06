package main.model;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.Vector;

public interface RecordsInterface extends Remote{
    
    //Each Object should have these attributes
    //private Long id;
    //private String productName, type, userID;
    //private int quantity;
    
    public String getProductName() throws RemoteException;  

    public String getType() throws RemoteException; 

    public int getQuantity() throws RemoteException;
    
    public boolean recordSales(String productName, int quantity, String userID) throws RemoteException; //record sales for SalesExec
     
    public boolean recordRestock(String productName, int quantity, String userID) throws RemoteException; //record quantity 
    
    public boolean remove(Long id) throws RemoteException; //Used by Admin to delete a record in a database. When a record is deleted, the table also gets updated
    
    public boolean find(Long id) throws RemoteException; //find a whole item from its ID
    
    public Vector<String> findAll() throws RemoteException; //ID is Long-Type Variable, Quantity is Int-Type Variable
    
    public Vector<String> findAll_User_Record(String salesExecID) throws RemoteException; //ID is Long-Type Variable, Quantity is Int-Type Variable
}
