/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MVC;

import javax.swing.*;

/**
 *
 * @author deannasquire
 */
public class Model {
    
    
    
    
     
 
        String[] columns = {"Film Title",
                                "Production Company",
                                "Year Made"};
 
        Object[][] filmInfo = {
        {"Cars", "Pixar", 2006},
        {"Wall-E", "Pixar", 2008},
        {"Bolt", "Disney", 2008},
        {"Toy Story 3", "Pixar", 2010},
        {"Tangled", "Disney", 2010},
        {"Brave", "Pixar", 2012},
        {"Frozen", "Disney", 2013},
        {"Moana", "Disney", 2016}
        };
        
        final JTable films = new JTable(filmInfo, columns);
        
}