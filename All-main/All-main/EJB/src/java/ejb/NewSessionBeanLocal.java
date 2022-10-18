/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB30/SessionLocal.java to edit this template
 */
package ejb;

import entity.User;
import java.util.Collection;
import javax.ejb.Local;

/**
 *
 * @author HP
 */
@Local
public interface NewSessionBeanLocal {
    Collection<User> getalluser();
    void addnewuser(String name,String email,String password);
    void remove(int id);
    void updateuser(int id,String name,String email,String password);
}
