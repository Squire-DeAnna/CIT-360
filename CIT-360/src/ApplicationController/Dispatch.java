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
public class Dispatch {
    
    private TangledInfo tangled;
    private FrozenInfo frozen;
    private MoanaInfo moana;
    private ErrorPage errorName;
    
    public Dispatch() {
        tangled = new TangledInfo();
        frozen = new FrozenInfo();
        moana = new MoanaInfo();
        errorName = new ErrorPage();
    }
    
    public void dispatchPage(String request) throws InterruptedException {
        if(request.equalsIgnoreCase("Tangled")){
            tangled.show();
            
        } else if(request.equalsIgnoreCase("Frozen")){
            frozen.show();
            
        } else if(request.equalsIgnoreCase("Moana")){
            moana.show();
            
        } else{
            errorName.show();
        
        }
    }
    
}
