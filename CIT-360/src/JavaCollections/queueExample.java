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
public class queueExample {
    public static void main(String[] args)
  {
    Queue<String> queueList = new LinkedList<>();
 
     queueList.add("Frozen");
     queueList.add("Tangled");
     queueList.add("Moana");
     queueList.add("Big Hero 6");
 
    System.out.println("Queue Example: \n"+ queueList);
    
    int sizeOfList = queueList.size();
    System.out.println("\n Size of queue: " + sizeOfList);
 
    String first = queueList.peek();
    System.out.println("\n First film on the list: " + first);

    String removeFilm = queueList.remove();
    System.out.println("\nFilm that was removed: " + removeFilm);
 
    System.out.println(queueList);
  }
}
    

