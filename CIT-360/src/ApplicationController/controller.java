/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ApplicationController;
import java.util.HashMap;
/**
 *
 * @author deannasquire
 */
public class controller {
    
    public static HashMap<String,filmHandler> hashMapCommands = new HashMap<String,filmHandler>();
   
    
    public static void handle(String command){
        
        hashMapCommands.put("Frozen", new FrozenInfo());
        hashMapCommands.put("Moana", new MoanaInfo());
        hashMapCommands.put("Tangled", new TangledInfo());
        
        filmHandler handler = hashMapCommands.get(command);
        
        handler.show();
    }
  
}
