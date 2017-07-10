/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ApplicationController;

import java.util.Scanner;

/**
 *
 * @author deannasquire
 */
public class AppControl {
   public static void main(String[] args) {
       String command;
       Scanner input = new Scanner(System.in);
       
       System.out.println("Welcome to the Application Controller. " + "\n"
               + "To test it out, please type in the name of a " + "\n"
               + "film listed below that you want to know more about." + "\n"  + "\n"
               + "Tangled" + "\n"
               + "Frozen" + "\n"
               + "Moana");
       command = input.nextLine();
       if (command.equals("Tangled") || command.equals("Frozen") || command.equals("Moana") ){
            controller.handle(command); 
        } else {
            System.out.println("Please capitalize the first letter and remove all spaces");
        }
        
   }
   
}
