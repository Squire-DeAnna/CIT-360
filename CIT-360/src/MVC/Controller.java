/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MVC;

/**
 *
 * @author deannasquire
 */
public class Controller {

    //connect to the Model and View pages
    private Model filmTable;
    private View view;
    

    public Controller(Model filmTable, View view){
        this.filmTable = filmTable;
        this.view = view;
        
    //call the films table
    public void callTable(String filmName){
        
    }   
    }
    
    
    
}
