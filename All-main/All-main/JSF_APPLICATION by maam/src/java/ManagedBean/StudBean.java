/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ManagedBean;

import Entity.Stud;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.Resource;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.ws.rs.core.Response;

/**
 *
 * @author Hi
 */
@Named(value = "studBean")
@SessionScoped
public class StudBean implements Serializable {
    int sid;

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }
    String sname;

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    @PersistenceContext(unitName = "Crud_Jsf_JpaPU")
    private EntityManager em;
    @Resource
    private javax.transaction.UserTransaction utx;

    
    /**
     * Creates a new instance of StudBean
     */
    public StudBean() {
        
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
    
    public String insertdata()
    {
        try
        {
            if(sid > 0)
            {
                Stud s=em.find(Stud.class,sid);
                s.setStudName(sname);
                utx.begin();
                em.merge(s);
                utx.commit();
            }
            else
            {
                    
                Stud s= new Stud();
                s.setStudName(sname);          
                utx.begin();
                em.persist(s);
                utx.commit();

            }
        sname="";
        
            return "StudDisplay.xhtml";
        }
        catch(Exception e)
        {
            System.out.println(e);
            return "StudForm.xhtml";
        }
        
        
    }
    public List<Stud> showstud()
    {
        try
        {
        List<Stud> show=em.createNamedQuery("Stud.findAll").getResultList();
        return show;
        }
        catch(Exception e)
        {
             System.out.println(e);
             return null;
        }
    }
    public void studdelete(int studId)
    {
        try
        {
        Stud s=em.find(Stud.class,studId);
        utx.begin();
        Stud s1=em.merge(s);
        em.remove(s1);
        utx.commit();
        }
        catch(Exception e)
        {
            System.err.println(e);
        }
       //return "StudDisplay.xhtml";
    }
    public String search(int id)
    {
        try
        {
        Stud s=em.find(Stud.class,id);
        sid=s.getStudId();
        sname=s.getStudName();
        return "StudForm.xhtml";
        }
        catch(Exception e)
        {
            System.err.println(e);
            return "StudDisplay.xhtml";
        }
       
    }
    List<Stud> s;

    public List<Stud> getS() {
        return s;
    }

    public void setS(List<Stud> s) {
        this.s = s;
    }
    public void getrecord()
    {
        try
        {
          
            s =em.createNamedQuery("Stud.findByStudName").setParameter("studName",sname).getResultList();
            sname="";
           
            
        }
        catch(Exception e)
        {
            System.err.println(e);
           
        }
         
//        return s;
    }
    
}
