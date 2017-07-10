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

public class listExample { 
    
public static void main(String[] args) { 
    String [] films = {"Tangled","Frozen", "Moana"};
    LinkedList<String> listFilms =new LinkedList<String>();
    System.out.println("Linked list Example:");
        for (int i = 0; i < films.length; i++){
        listFilms.add(i, films[i]);
        System.out.println(films[i] + " is a Disney Film.");
        }
    
    String [] arrayFilms = {"Wall-E","Cars", "Toy Story 3"};
    ArrayList<String> arrayListFilms =new ArrayList<String>();
    System.out.println("");
    System.out.println("Array list Example:");
        for (int i = 0; i < arrayFilms.length; i++){
        arrayListFilms.add(i, arrayFilms[i]);
        System.out.println(arrayFilms[i] + " is a Disney/Pixar Film.");
        }
    }
}

