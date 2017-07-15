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
public class Model {
    
    private boolean calcValue;
    
    public void checkFilmAge(int ageInput){
        int check = 13;
        
        if (ageInput < check){
            calcValue = false;
        } else {
            calcValue = true;
        }
    }
    
    public boolean getCalcValue() {return calcValue;}
        
}