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

public class Admin implements AdminInterface{
    private String id, firstName, lastName, password;
    private Connection con = null;
    private Statement statement = null;

    public Admin() throws RemoteException {
        UnicastRemoteObject.exportObject(this,0);
    }

    @Override
    public String getFirstName() throws RemoteException{
        return firstName;
    }

    @Override
    public String getLastName() throws RemoteException{
        return lastName;
    }

    public void setLastName(String lastName) throws RemoteException{
        this.lastName = lastName;
    }

    @Override
    public boolean login(String username, String password) throws RemoteException {
        boolean foundUser = false;
        try{
            con = DriverManager.getConnection("jdbc:derby://localhost:1527/SunDB", "app", "app");
            statement = con.createStatement();
            checkTableExistance();
            
            String sql = "Select ID, Password, FirstName, LastName FROM Administrator";
            ResultSet rs = statement.executeQuery(sql); 
            while(rs.next()){
                String tempUserName = rs.getString("ID");
                String tempPassWord = rs.getString("Password");
                if(tempUserName.equalsIgnoreCase(username) && tempPassWord.equals(password)){
                    foundUser = true;
                    this.firstName = rs.getString("FirstName");
                    this.lastName = rs.getString("LastName");
                    break;
                }
            }
        }catch(SQLException e){
            Logger.getLogger(RunServer.class.getName()).log(Level.SEVERE, null, e);
        }finally{
            try{con.close();}
            catch(SQLException ex){}
        }
        return foundUser;
    }

    @Override
    public int register(String id, String firstName, String lastName, String password) throws RemoteException {
        int indicator;
        try{
            con = DriverManager.getConnection("jdbc:derby://localhost:1527/SunDB", "app", "app");
            statement = con.createStatement();
            checkTableExistance();
            
            String sql = "INSERT INTO Administrator VALUES " 
                    + "('" + id + "',"
                    + " '" + password + "', " 
                    + " '" + firstName + "', " 
                    + " '" + lastName + "')";
            statement.executeUpdate(sql);
            indicator = 0;
        }catch(SQLIntegrityConstraintViolationException e){
            indicator = 1; // indicates ID is taken
        }catch(SQLException e){
            Logger.getLogger(RunServer.class.getName()).log(Level.SEVERE, null, e);
            indicator = 2; // indicates other errors
        }finally{
            try{con.close();}
            catch(SQLException ex){}
        }
        return indicator;
    }

    @Override
    public boolean find(String id) throws RemoteException {
        boolean foundUser = false;
        try{
            con = DriverManager.getConnection("jdbc:derby://localhost:1527/SunDB", "app", "app");
            statement = con.createStatement();
            checkTableExistance();
            
            String sql = "Select ID, Password, FirstName, LastName FROM Administrator";
            ResultSet rs = statement.executeQuery(sql); 
            while(rs.next()){
                String tempUserName = rs.getString("ID");
                if(tempUserName.equalsIgnoreCase(id)){
                    foundUser = true;
                    this.id = tempUserName;
                    this.password = rs.getString("Password");
                    this.firstName = rs.getString("FirstName");
                    this.lastName = rs.getString("LastName");
                    break;
                }
            }
        }catch(SQLException e){
            Logger.getLogger(RunServer.class.getName()).log(Level.SEVERE, null, e);
        }finally{
            try{con.close();}
            catch(Exception ex){}
        }
        return foundUser;
    }

    @Override
    public Vector<String> findAll() throws RemoteException {
        Vector<String> AdminList = new Vector<>();
        try{
            con = DriverManager.getConnection("jdbc:derby://localhost:1527/SunDB", "app", "app");
            statement = con.createStatement();
            checkTableExistance();
            
            String sql = "Select ID, Password, FirstName, LastName FROM Administrator";
            ResultSet rs = statement.executeQuery(sql); 
            while(rs.next()){
                String tempID = rs.getString("ID");
                //String tempPassword = rs.getString("Password");
                String tempFirstName = rs.getString("FirstName");
                String tempLastName = rs.getString("LastName");
                
                AdminList.add(tempID);
                //salesExecList.add(tempPassword);
                AdminList.add(tempFirstName);
                AdminList.add(tempLastName);
            }
        }catch(SQLException e){
            Logger.getLogger(RunServer.class.getName()).log(Level.SEVERE, null, e);
        }finally{
            try{con.close();}
            catch(SQLException ex){}
        }
        return AdminList;
    }
    
        /* create table when table is not in database */
    private void checkTableExistance(){
        try{
            String sql = "CREATE TABLE Administrator " 
                    + "(ID VARCHAR(255) not NULL, "
                    + " Password VARCHAR(255), " 
                    + " FirstName VARCHAR(255), " 
                    + " LastName VARCHAR(255), "
                    + " PRIMARY KEY ( id ))";
            statement.executeUpdate(sql);
        }catch (SQLException e){}
    } 

}
