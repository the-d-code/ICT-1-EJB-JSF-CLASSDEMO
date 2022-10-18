/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB30/StatelessEjbClass.java to edit this template
 */
package ejb;

import entity.User;
import java.util.Collection;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author HP
 */
@Stateless
public class NewSessionBean implements NewSessionBeanLocal {
    @EJB NewSessionBeanLocal nsbl;
    @PersistenceContext(unitName = "EJBPU")
    private EntityManager em;
    

    @Override
    public Collection<User> getalluser() {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        
        Collection<User> user = em.createNamedQuery("User.findAll").getResultList();
        return user;
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")

    public void persist(Object object) {
        em.persist(object);
    }

    @Override
    public void addnewuser(String name, String email, String password) {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody

        User user=new User();
        user.setName(name);
        user.setEmail(email);
        user.setPassword(password);
        em.persist(user);
    }

    @Override
    public void remove(int id) {
       User delete = em.find(User.class, id);
       em.remove(delete);
    }

    @Override
    public void updateuser(int id, String name, String email, String password) {
        User update= (User) em.find(User.class, id);
        update.setName(name);
        update.setEmail(email);
        update.setPassword(password);
        
        em.merge(update);
    }
    
}
