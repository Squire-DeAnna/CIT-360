/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaCollections;
import java.util.*;
/**
 *
 * @author deannasquire
 */
public class mapExample {
    public static void main(String args[]){  
    //HashMaps allow for you to select the items by key or by value
    HashMap<String,Integer> films=new HashMap<String,Integer>(); 
    films.put("Cars",2006);
    films.put("Wall-E",2008);
    films.put("Toy Story 3",2010);
    films.put("Tangled",2010);  
    films.put("Frozen",2012);  
    films.put("Moana",2016); 
        System.out.println("HashMap Example:");
        for(Map.Entry output:films.entrySet()){  
        System.out.println(output.getKey()+" "+output.getValue());    
        }
        
        
        System.out.println("");
    //TreeMaps make sure to order the items by the key.
    TreeMap<Integer,String> disneyFilms=new TreeMap<Integer,String>(); 
    disneyFilms.put(04,"Tangled");  
    disneyFilms.put(05,"Frozen"); 
    disneyFilms.put(02,"Wall-E");
    disneyFilms.put(03,"Toy Story 3");
    disneyFilms.put(06,"Moana"); 
    disneyFilms.put(01,"Cars");
        System.out.println("TreeMap Example:"); 
        for(Map.Entry output:disneyFilms.entrySet()){  
        System.out.println(output.getKey()+" "+output.getValue());    
        }
    }
}
