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
public class setExample {
    public static void main(String args[]) {

    HashSet<String> disneySet = new HashSet<String> ();
    disneySet.add("Tangled");
    disneySet.add("Frozen");
    disneySet.add("Moana");
    
    HashSet<String> pixarSet = new HashSet<String>();
    pixarSet.add("Wall-E");
    pixarSet.add("Cars");
    pixarSet.add("Toy Story 3");
    System.out.println("Hash Set Examples:" + disneySet);
    System.out.println("Disney Animation" + disneySet);
    System.out.println("Disney/Pixar Animation" + pixarSet);

    Set<String> treeSet = new TreeSet<String>();
    treeSet.addAll(pixarSet);
    treeSet.addAll(disneySet);
    System.out.println("");
    System.out.println("Tree Set Example:");
    for(String text : treeSet){
        System.out.println(text);
     }
    }
}
