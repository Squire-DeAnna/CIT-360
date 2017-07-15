/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MVC;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author deannasquire
 */
public class View extends JFrame {
    
    //show the table of films
    private JTextField ageInput = new JTextField(10);
    private JLabel calculationLabel = new JLabel("Are you old enough to see Avengers? Please enter your age:");
    private JButton resultButton = new JButton("Check");
    private JTextField calcuSolution = new JTextField(50);
    
    View(){
    
    JPanel checkFilmPanel = new JPanel();
    
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setSize(650, 300);
    
    checkFilmPanel.add(ageInput);
    checkFilmPanel.add(calculationLabel);
    checkFilmPanel.add(resultButton);
    checkFilmPanel.add(calcuSolution);
    this.add(checkFilmPanel);
    
            }
    
    public int getAge(){
        return Integer.parseInt(ageInput.getText());
        
    }
    
    public void setCalcuSolution(boolean solution){
        if (solution){
            calcuSolution.setText("You are old enough to see the Avengers!");
        } else {
            calcuSolution.setText("You must be over 13 years old to see the Avengers!");
        }
    }
    
    void addCalcListener(ActionListener listenForButton){
        resultButton.addActionListener(listenForButton);
    }
    
    void displayError(String errMessage){
        JOptionPane.showMessageDialog(this, errMessage);
        
    }
    
}
