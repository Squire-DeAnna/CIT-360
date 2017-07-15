/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MVC;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



/**
 *
 * @author deannasquire
 */
public class mvcController implements ActionListener{

    //connect to the Model and View pages
    private View programView;
    private Model programModel;
    
    public mvcController(View programView, Model programModel){
        
        this.programView = programView;
        
        this.programModel = programModel;
        
        this.programView.addCalcListener(new CalculateListener());
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
    }
    
  class CalculateListener implements ActionListener {
      public void actionPerformed(ActionEvent e) {
            int age;
            
            try{
                age = programView.getAge();
                
                programModel.checkFilmAge(age);
                programView.setCalcuSolution(programModel.getCalcValue());
                
            }catch(NumberFormatException ex){
                System.out.println(ex);
                
                programView.displayError("Please enter a number for the age.");
                
            }

        }
               
        }
    }

    
    

