/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ThreadsRunnablesExecutors;

/**
 *
 * @author deannasquire
 */
import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class executor {

public static void main(String[] args) throws InterruptedException {
    ExecutorService executorExample = Executors.newFixedThreadPool(3);
    for(int i = 1; i<=10; i++){
    executorExample.execute(new Runnable(){
        
        public void run(){
        try {
                System.out.println("Book 1");
                Thread.currentThread().sleep(500);
                System.out.println("Book 2");
                Thread.currentThread().sleep(500);
        }catch (InterruptedException e){
            System.out.println("Interuppted.");
        } 
        System.out.println("End of List");
    }
    });
    }
}
    
}
