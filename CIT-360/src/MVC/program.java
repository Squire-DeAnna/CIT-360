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
public class program {
    public static void main (String[] args) {
        View programView = new View();
        Model programModel = new Model();
        mvcController programController = new mvcController(programView, programModel);
        programView.setVisible(true);
        
        
    }
    
}
