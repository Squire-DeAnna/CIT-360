/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ApplicationController;

/**
 *
 * @author deannasquire
 */
public class controller {
    
    private Dispatch d;
    
    public controller(){
        d = new Dispatch();
    }
    
    private boolean isRequested(){
        return true;
    }
    
    public void request(String request) throws InterruptedException {
      
        if(isRequested()){
            d.dispatchPage(request);
            
        }
    }
    
}
