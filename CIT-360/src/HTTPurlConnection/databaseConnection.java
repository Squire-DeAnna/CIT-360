/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HTTPurlConnection;
import java.io.*;
import java.net.*;
import java.sql.Connection;
import java.sql.DriverManager;
/**
 *
 * @author deannasquire
 */
public class databaseConnection {
    public static void main(String[] args){
        try{
            String server = "localhost";
            String database = "squirede_books";
            String url = "mysql://" + server + "/" + database;
        
            String username = "squirede_user";
            String password = "pa55word";
            
            Connection conn = DriverManager.getConnection(url, username, password);
            System.out.println(conn.isClosed());
            
        }catch (Exception e) {
            System.out.println("YOU SHALL NOT PASS!! (into the database)");
        }
    }
    
}
