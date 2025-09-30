/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.qaswatech.hislop.database;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author kamra
 */
public class Database {
    private static final String USERNAME="newuser";
    private static final String PASSWORD="@Mubbu9022";
    private static final String DATABASE="hislop_db";
    private static final String DBURL="jdbc:mysql://localhost/"+DATABASE;
    
    public static Connection connectDB(){
        
        // class obj value
        Connection con=null;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver"); // connection string
            con=DriverManager.getConnection(DBURL,USERNAME,PASSWORD);
            System.out.println("Connection successs");
        }catch(Exception e){
            System.out.println("Exception: "+e.getMessage());
        }
        return con;
        
    }
    
    public static void main(String[] args) {
        connectDB();
    }
    
}
