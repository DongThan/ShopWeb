/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;
import Entity.*;


import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author ASUS
 */
public class ProductDAO {
    private Connection getConnection() throws ClassNotFoundException  
    {
        Connection conn;
        ConnectionDB db=ConnectionDB.getInstance();
        conn = db.getConnection();
        return conn;
    }
    public ArrayList<Product> getAllproduct() throws ClassNotFoundException
    {
        ArrayList<Product> prd = new ArrayList<>();
        
        try{
            System.out.println("Load all product");
            ResultSet rs = null;
            Connection con=getConnection();
            PreparedStatement prestatement = null;
            prestatement = con.prepareStatement("SELECT * FROM product");
            rs= prestatement.executeQuery();
            while (rs.next())
            {   
                int id=rs.getInt("ProductID");
                String name=rs.getString("ProductName");
                String des=rs.getString("ProductDescription");
                int price=rs.getInt("Price");
                int quantity=rs.getInt("Quantity");
                int category=rs.getInt("CategoryID");
                String picture=rs.getString("Picture");
                String date=rs.getString("DateAdded");
                Product A = new Product(id,name,des,price,quantity,category,picture,date);
                System.out.println(A.toString());
                prd.add(A);
            }
            System.out.println(prd.size());
            System.out.println(getProductByID(11).toString());
            System.out.println("Load success");
        }
        catch( SQLException e){
            e.printStackTrace();
        }
        return prd;
    }
    public Product getProductByID(int id) throws ClassNotFoundException{
        
        Product prd = new Product();
        
        try{
            ResultSet rs = null;
            Connection con=getConnection();
            PreparedStatement prestatement = null;
            prestatement = connection.prepareStatement("SELECT * FROM product WHERE ProductID=?");
            prestatement.setString(1,id);
            rs= prestatement.executeQuery();
            while (rs.next())
            {   
                int id=rs.getInt("ProductID");
                String name=rs.getString("ProductName");
                String des=rs.getString("ProductDescription");
                int price=rs.getInt("Price");
                int quantity=rs.getInt("Quantity");
                int category=rs.getInt("CategoryID");
                String picture=rs.getString("Picture");
                String date=rs.getString("DateAdded");
                Product A = new Product(id,name,des,price,quantity,category,picture,date);
                prd = A;
                System.out.println(A.toString());
                break;
            }
            
        }
        catch( SQLException e){
            e.printStackTrace();
        }
        return prd;
    }
    public int getCountProduct() throws ClassNotFoundException{
        Connection con=getConnection();
        int count=0;
        try{
            PreparedStatement prestatement = null;
            prestatement = con.prepareStatement("SELECT count(ProductID) FROM product");
            ResultSet rs= prestatement.executeQuery();
            while (rs.next())
            {
                count=rs.getInt(1);
            }
            
        }
        catch (SQLException e){
            e.printStackTrace();
        }
        return count;
    }
}
