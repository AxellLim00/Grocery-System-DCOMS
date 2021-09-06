package main.model;


import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.sql.Statement;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import main.RunServer;

public class Product extends UnicastRemoteObject implements ProductInterface{
    private String name, category;
    private int stock;
    private double price;
    private Connection con = null;
    private Statement statement = null;

    public Product() throws RemoteException{
    }

    @Override
    public int getStock() throws RemoteException{
        return stock;
    }

    @Override
    public double getPrice() throws RemoteException{
        return price;
    }

    @Override
    public String getName() throws RemoteException {
        return name;
    }
    
    @Override
    public String getCategory() throws RemoteException {
        return category;
    }

    @Override
    public int register(String name, String category, int stock, double price) throws RemoteException {
        int indicator;
        try{
            con = DriverManager.getConnection("jdbc:derby://localhost:1527/SunDB", "app", "app");
            statement = con.createStatement();
            checkTableExistance();
            
            String sql = "INSERT INTO Product VALUES " 
                    + "('" + name + "',"
                    + " '" + category + "', " 
                    + " " + String.valueOf(stock) + ", " 
                    + " " + String.valueOf(price) + ")";
            statement.executeUpdate(sql);
            indicator = 0;
        }catch(SQLIntegrityConstraintViolationException e){
            indicator = 1; // indicates Name is taken
        }catch(SQLException e){
            Logger.getLogger(RunServer.class.getName()).log(Level.SEVERE, null, e);
            indicator = 2; // indicates other errors
        }finally{
            try{con.close();}
            catch(Exception ex){}
        }
        return indicator;
    }

    @Override
    public boolean remove(String name) throws RemoteException{
        boolean successFlag = false;
        try{
            con = DriverManager.getConnection("jdbc:derby://localhost:1527/SunDB", "app", "app");
            statement = con.createStatement();
            checkTableExistance();
            
            String sql = "DELETE FROM Product WHERE Name = '" + name + "'";
            statement.executeUpdate(sql); 
            
            sql = "DELETE FROM Records WHERE ProductName = '" + name + "'";
            statement.executeUpdate(sql); 
            
            successFlag = true;
        }catch(SQLException e){
            Logger.getLogger(RunServer.class.getName()).log(Level.SEVERE, null, e);
            successFlag = false;
        }finally{
            try{con.close();}
            catch(SQLException ex){}
        }
        return successFlag;
    }
    
    @Override
    public boolean find(String name) throws RemoteException {
        boolean foundProduct = false;
        try{
            con = DriverManager.getConnection("jdbc:derby://localhost:1527/SunDB", "app", "app");
            statement = con.createStatement();
            checkTableExistance();
            
            String sql = "Select Name, Category, Stock, Price FROM Product";
            ResultSet rs = statement.executeQuery(sql); 
            while(rs.next()){
                String tempName = rs.getString("Name");
                if(tempName.equalsIgnoreCase(name)){
                    foundProduct = true;
                    this.name = tempName;
                    this.category = rs.getString("Category");
                    this.stock = rs.getInt("Stock");
                    this.price = rs.getDouble("Price");
                    break;
                }
            }
        }catch(SQLException e){
            Logger.getLogger(RunServer.class.getName()).log(Level.SEVERE, null, e);
        }finally{
            try{con.close();}
            catch(Exception ex){}
        }
        return foundProduct;
    }

    @Override
    public Vector<String> findAll() throws RemoteException {
        Vector<String> productList = new Vector<>();
        try{
            con = DriverManager.getConnection("jdbc:derby://localhost:1527/SunDB", "app", "app");
            statement = con.createStatement();
            checkTableExistance();
            
            String sql = "Select Name, Category, Stock, Price FROM Product";
            ResultSet rs = statement.executeQuery(sql); 
            while(rs.next()){
                String tempName = rs.getString("Name");
                String tempCategory = rs.getString("Category");
                int tempStock = rs.getInt("Stock");
                double tempPrice = rs.getDouble("Price");
                
                productList.add(tempName);
                productList.add(tempCategory);
                productList.add(String.valueOf(tempStock));
                productList.add(String.valueOf(tempPrice));
            }
        }catch(SQLException e){
            Logger.getLogger(RunServer.class.getName()).log(Level.SEVERE, null, e);
        }finally{
            try{con.close();}
            catch(SQLException ex){}
        }
        return productList;
    }
    
    /* create table when table is not in database */
    private void checkTableExistance(){
        try{
            String sql = "CREATE TABLE Product " 
                    + "(Name VARCHAR(255) not NULL, "
                    + " Category VARCHAR(255), " 
                    + " Stock INT, " 
                    + " Price DOUBLE, "
                    + " PRIMARY KEY ( Name ))";
            statement.executeUpdate(sql);
        }catch (SQLException e){}
    } 
    
    public void setStock(int quantity){
        this.stock = this.stock + quantity;
        try{
            con = DriverManager.getConnection("jdbc:derby://localhost:1527/SunDB", "app", "app");
            statement = con.createStatement();
            checkTableExistance();
            
            String sql = "UPDATE Product SET Stock = " + String.valueOf(this.stock) + " WHERE Name = '" + this.name + "'";
            statement.executeUpdate(sql); 
            
        }catch(SQLException e){
            Logger.getLogger(RunServer.class.getName()).log(Level.SEVERE, null, e);
        }finally{
            try{con.close();}
            catch(SQLException ex){}
        }
    }

}
