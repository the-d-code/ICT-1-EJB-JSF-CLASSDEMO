/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package bean;

import entity.Stud;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.Resource;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author HP
 */
@Named(value = "managedBean")
@SessionScoped
public class ManagedBean implements Serializable {

    @PersistenceContext(unitName = "JSF_CrudPU")
    private EntityManager em;
    @Resource
    private javax.transaction.UserTransaction utx;

    /**
     * Creates a new instance of ManagedBean
     */
    int id;
    String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
   
    
    
    public ManagedBean() {
    }
    
    
    
    

    public void persist(Object object) {
        try {
            utx.begin();
            em.persist(object);
            utx.commit();
        } catch (Exception e) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, "exception caught", e);
            throw new RuntimeException(e);
        }
    }
    
    // Insert And Update Data To Database 
    
    public String insertdata(){
        try
        {
            if(id > 0)
            {
                Stud s=em.find(Stud.class,id);
                s.setName(name);
                utx.begin();
                em.merge(s);
                utx.commit();
            }
            else
            {
                    
                Stud s= new Stud();
                s.setName(name);          
                utx.begin();
                em.persist(s);
                utx.commit();

            }
        name="";
        
            return "display.xhtml";
        }
        catch(Exception e)
        {
            System.out.println(e);
            return "form.xhtml";
        }
    }
     
    // Display Data From Database;
     
    public List<Stud> showStud(){
        try{
            
            List<Stud> display = em.createNamedQuery("Stud.findAll").getResultList();
            return display;
        }catch(Exception e){
            System.out.println(e);
            return null;
        }
        
    }
     
    // Search Data From Database
     
//    public String search(int id){
//         
//        try{
//            Stud s = em.find(Stud.class, id);
//            id = s.getId();
//            name = s.getName();
//             
//            return "form.xhtml";
//        }
//        catch(Exception e){
//            System.out.println(e);
//             
//            return "display.xhtml";
//         }
//     }
//    
    // Fetch Data Which Is Searched
    
//    List<Stud> s;
//
//    public List<Stud> getS() {
//        return s;
//    }
//
//    public void setS(List<Stud> s) {
//        this.s = s;
//    }
//    
//    public void getRecord(){
//        try{
//            s = em.createNamedQuery("Stud.findByName").setParameter("name", name).getResultList();
//            name = "";
//            
//        }
//        catch(Exception e){
//            System.out.println(e);
//        }
//    }
    
    // Delete Data From Database
    
    public void delete(int id){
        try{
            Stud s = em.find(Stud.class, id);
            utx.begin();
            Stud s1 = em.merge(s);
            em.remove(s1);
            utx.commit();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
     
     
    
}
