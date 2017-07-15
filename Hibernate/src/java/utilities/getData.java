/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilities;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import org.hibernate.Session;

/**
 *
 * @author deannasquire
 */
@ManagedBean
@SessionScoped

public class getData {
    private people p;
    private HibernateUtil helper;
    private Session session;
    
    public void addPeople(){
        p = new people("DeAnna");
        session = helper.getSessionFactory().openSession();
        session.beginTransaction();
        session.save(p);
        session.getTransaction().commit();
        session.close();
        
    }
}
