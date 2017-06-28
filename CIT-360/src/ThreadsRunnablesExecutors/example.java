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
public class example {
    public static void main(String args[]) {
     
        List l1 = new List("List 1");
        l1.start();
        l1.run();
        
        List l2 = new List("List-2");
        l2.start();
    }
    
    
}

class List implements Runnable {
    private Thread thread;
    private String bookName;
    
    List( String name){
        bookName = name;
        System.out.println("This creates " + bookName );
    }
    
    public void run() {
        System.out.println("Running " + bookName);
        try {
            for(int i = 1; i < 4; i++){
                System.out.println(bookName + ", Book " + i);
                Thread.sleep(500);
            }
        }catch (InterruptedException e){
            System.out.println(bookName + " interuppted.");
        } 
        System.out.println("End of List");
    }
 
    public void start ()
    {
        System.out.println("Starting " + bookName);
        if (thread == null){
            thread = new Thread (this, bookName);
            thread.start ();
            
        }
        
    }
    
}
