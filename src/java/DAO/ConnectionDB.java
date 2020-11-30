/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

/**
 *
 * @author ASUS
 */
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


/**
 *
 * @author ASUS
 */
public class ConnectionDB {
    private static ConnectionDB instance;
    private Connection connection;
    private String driverClassName = "com.mysql.jdbc.Driver";
    private String url = "jdbc:mysql://localhost:3306/dbthuongmaidientu";
    private String user = "root";
    private String password = "kunpro2000@@";
    
    private ConnectionDB() {
        try {
                Class.forName("com.mysql.jdbc.Driver").newInstance();
                this.connection = DriverManager.getConnection(url, user , password);
        }        
        catch ( ClassNotFoundException ex) 
        {
            System.out.println("Database Connection Creation Failed : " + ex.getMessage());
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
    public Connection getConnection(){
        return connection;
    }
    public static ConnectionDB getInstance() throws SQLException{
        if (instance == null){
            instance = new ConnectionDB();
        }
        else if (instance.getConnection().isClosed()){
            instance = new ConnectionDB();
        }
        return instance;
    }
      
}