package main.model;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Objects;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import jdk.nashorn.internal.ir.Assignment;
import main.model.Product;
import main.model.RecordsInterface;

public class Records extends UnicastRemoteObject implements RecordsInterface{
    private Long id;
    private String productName, type, userID;
    private int quantity;
    private Connection con = null;
    private Statement statement = null;

    public Records() throws RemoteException{
    }

    @Override
    public String getProductName() throws RemoteException{
        return productName;
    }

    @Override
    public String getType() throws RemoteException{
        return type;
    }

    @Override
    public int getQuantity() throws RemoteException{
        return quantity;
    }

    @Override
    public boolean recordSales(String productName, int quantity, String userID) throws RemoteException {
        this.type = "sales";
        boolean successFlag = false;
        try{
            con = DriverManager.getConnection("jdbc:derby://localhost:1527/sunDB", "app", "app");
            statement = con.createStatement();
            checkTableExistance();
            
            String sql = "INSERT INTO Records(ProductName, Type, Quantity, UserID) VALUES " 
                    + "('" + productName + "'," 
                    + " '" + this.type + "', " 
                    + " " + String.valueOf(quantity) + ", " 
                    + " '" + userID + "')";
            Product tempProduct = new Product();
            tempProduct.find(productName);
            if(tempProduct.getStock() - quantity >= 0){
                tempProduct.setStock(quantity * -1);
                statement.executeUpdate(sql);
                successFlag = true;
            }else{
                successFlag = false;
                System.out.println("Sales exceeded Stock");
            }
        }catch(SQLException e){
            Logger.getLogger(Assignment.class.getName()).log(Level.SEVERE, null, e);
            successFlag = false; // indicates other errors
        }finally{
            try{con.close();}
            catch(SQLException ex){}
        }
        return successFlag;
    }

    @Override
    public boolean recordRestock(String productName, int quantity, String userID) throws RemoteException{
        this.type = "restock";
        boolean successFlag = false;
        try{
            con = DriverManager.getConnection("jdbc:derby://localhost:1527/sample", "app", "app");
            statement = con.createStatement();
            checkTableExistance();
            
            String sql = "INSERT INTO Records(ProductName, Type, Quantity, UserID) VALUES " 
                    + "('" + productName + "'," 
                    + " '" + this.type + "', " 
                    + " " + String.valueOf(quantity) + ", " 
                    + " '" + userID + "')";
            Product tempProduct = new Product();
            tempProduct.find(productName);
            tempProduct.setStock(quantity);
            statement.executeUpdate(sql);
            successFlag = true;
        }catch(SQLException e){
            Logger.getLogger(Assignment.class.getName()).log(Level.SEVERE, null, e);
            successFlag = false; // indicates other errors
        }finally{
            try{con.close();}
            catch(SQLException ex){}
        }
        return successFlag;
    }
    
    @Override
    public boolean remove(Long id) throws RemoteException {
        boolean successFlag = false;
        find(id);
        try{
            con = DriverManager.getConnection("jdbc:derby://localhost:1527/sample", "app", "app");
            statement = con.createStatement();
            checkTableExistance();
            
            String sql = "DELETE FROM Records WHERE ID = " + id;
            Product tempProduct = new Product();
            tempProduct.find(this.productName);
            if(this.type.equals("sales"))
                tempProduct.setStock(this.quantity);
            else if(this.type.equals("restock"))
                tempProduct.setStock(this.quantity * -1);
            System.out.println(sql);
            statement.executeUpdate(sql); 
            
            successFlag = true;
        }catch(SQLException e){
            Logger.getLogger(Assignment.class.getName()).log(Level.SEVERE, null, e);
            successFlag = false;
        }catch(NullPointerException e){
            Logger.getLogger(Assignment.class.getName()).log(Level.SEVERE, null, e);
            successFlag = false;
        }finally{
            try{con.close();}
            catch(SQLException ex){}
        }
        return successFlag;
    }

    @Override
    public boolean find(Long id) throws RemoteException {
        boolean foundProduct = false;
        try{
            con = DriverManager.getConnection("jdbc:derby://localhost:1527/sample", "app", "app");
            statement = con.createStatement();
            checkTableExistance();
            
            String sql = "Select ID, ProductName, Type, Quantity, UserID FROM Records";
            ResultSet rs = statement.executeQuery(sql); 
            while(rs.next()){
                Long tempID = rs.getLong("ID");
                if(Objects.equals(tempID, id)){
                    foundProduct = true;
                    this.id = tempID;
                    this.productName = rs.getString("ProductName");
                    this.type = rs.getString("Type");
                    this.quantity = rs.getInt("Quantity");
                    this.userID = rs.getString("UserID");
                    break;
                }
            }
        }catch(SQLException e){
            Logger.getLogger(Assignment.class.getName()).log(Level.SEVERE, null, e);
        }finally{
            try{con.close();}
            catch(SQLException ex){}
        }
        return foundProduct;
    }

    @Override
    public Vector<String> findAll() throws RemoteException {
        Vector<String> recordList = new Vector<>();
        try{
            con = DriverManager.getConnection("jdbc:derby://localhost:1527/sample", "app", "app");
            statement = con.createStatement();
            checkTableExistance();
            
            String sql = "Select ID, ProductName, Type, Quantity, UserID FROM Records";
            ResultSet rs = statement.executeQuery(sql); 
            while(rs.next()){
                Long tempID = rs.getLong("ID");
                String tempName = rs.getString("ProductName");
                String tempType = rs.getString("Type");
                int tempQuantity = rs.getInt("Quantity");
                String tempUserID = rs.getString("UserID");
                
                recordList.add(String.valueOf(tempID));
                recordList.add(tempName);
                recordList.add(tempType);
                recordList.add(String.valueOf(tempQuantity));
                recordList.add(tempUserID);
            }
        }catch(SQLException e){
            Logger.getLogger(Assignment.class.getName()).log(Level.SEVERE, null, e);
        }finally{
            try{con.close();}
            catch(SQLException ex){}
        }
        return recordList;
    }
    
    @Override
    public Vector<String> findAll_User_Record(String salesExecID) throws RemoteException{
        Vector<String> recordList = new Vector<>();
        try{
            con = DriverManager.getConnection("jdbc:derby://localhost:1527/sample", "app", "app");
            statement = con.createStatement();
            checkTableExistance();
            
            String sql = "Select ID, ProductName, Type, Quantity, UserID FROM Records";
            ResultSet rs = statement.executeQuery(sql); 
            while(rs.next()){
                Long tempID = rs.getLong("ID");
                String tempName = rs.getString("ProductName");
                String tempType = rs.getString("Type");
                int tempQuantity = rs.getInt("Quantity");
                String tempUserID = rs.getString("UserID");
                
                if(tempUserID.equalsIgnoreCase(salesExecID)){
                    recordList.add(String.valueOf(tempID));
                    recordList.add(tempName);
                    recordList.add(tempType);
                    recordList.add(String.valueOf(tempQuantity));
                    recordList.add(tempUserID);
                }
            }
        }catch(SQLException e){
            Logger.getLogger(Assignment.class.getName()).log(Level.SEVERE, null, e);
        }finally{
            try{con.close();}
            catch(SQLException ex){}
        }
        return recordList;
    }
    
    /* create table when table is not in database */
    private void checkTableExistance(){
        try{
            String sql = "CREATE TABLE Records " 
                    + "(ID BIGINT not NULL GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1), "
                    + " ProductName VARCHAR(255), " 
                    + " Type VARCHAR(255), " 
                    + " Quantity INT, " 
                    + " UserID VARCHAR(255), " 
                    + " PRIMARY KEY ( ID ))";
            statement.executeUpdate(sql);
        }catch (SQLException e){}
    } 
}
