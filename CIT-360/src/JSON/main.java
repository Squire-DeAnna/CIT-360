/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JSON;
import org.json.simple.*;
import org.json.simple.parser.*;



/**
 *
 * @author deannasquire
 */
public class main {
    public static void main(String[] args) {
      JSONObject object1 = new JSONObject();

      object1.put("name", "DeAnna Squire");
      object1.put("birth year", new Integer(1991));
      object1.put("is_a_student", new Boolean(true));
      object1.put("college", "Brigham Young University - Idaho");

      
      System.out.print(object1);
      
      JSONParser parser = new JSONParser();
      String s = "[\"bananas\",\"apples\", \"oranges\", \"milk\",\"bread\"]";
		
      try{
         Object obj = parser.parse(s);
         JSONArray array = (JSONArray)obj;
	
         System.out.println();
         System.out.println();
         System.out.println("The 2nd item in the list");
         System.out.println(array.get(1));
         System.out.println();
         System.out.println("The 3rd item in the array");
         System.out.println(array.get(3));   
         System.out.println();

        System.out.println("Here is the whole list");
        System.out.println(array);
        
         s = "[5,,10, 8,11 ,9]";
         obj = parser.parse(s);
         
         System.out.println(obj);
        
        
      }catch(ParseException pe){
		
         System.out.println("position: " + pe.getPosition());
         System.out.println(pe);
      }
   }
    

    
}
