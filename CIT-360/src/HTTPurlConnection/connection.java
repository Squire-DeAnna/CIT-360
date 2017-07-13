/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HTTPurlConnection;
import java.io.*;
import java.net.*;
/**
 *
 * @author deannasquire
 */
public class connection {
    public static final void main(String args[]) throws Exception {
       
        
           URL url = new URL ("http://cit336.squire-deanna-student.com/");
            
            HttpURLConnection urlConnection = (HttpURLConnection)url.openConnection();
            
            BufferedReader in = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
            
            String webcode;
            
            while ((webcode = in.readLine()) != null){
                
                if (webcode.isEmpty() != true) {
                    System.out.print(webcode);
                } else {
                    System.out.println("No data was on this site.");
                }
            }
            in.close();
        }
            
}

