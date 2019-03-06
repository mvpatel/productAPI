/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package productAPI.dao;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Random;


/**
 *
 * @author mp18aad
 */
public class DBConnection {
    
    
    
    
    
    public static void main(String[] args) throws ClassNotFoundException, SQLException 
    {
    
        Class.forName("org.sqlite.JDBC");
       Connection con;
        con=DriverManager.getConnection("jdbc:sqlite:product_api.db");
        	//String databse="create database product_api";
            Statement st=con.createStatement();
        //st.execute(databse);
        
        String table="create table if not exists login(id int,name varchar(220),password varchar(220))";
        st.execute(table);
                                        
        String insert="insert into login(id,name,password)values(1,'sajid','s')";
                                        
      st.execute(insert);
      
      String display="select * from login";
        ResultSet rs=st.executeQuery(display);
        while(rs.next())
        {
           int   id=rs.getInt("id");
           String name=rs.getString("name");
               
        System.out.println(id);
            
        System.out.println(name);
            
        }
        
      
      
    }
        
    
}
