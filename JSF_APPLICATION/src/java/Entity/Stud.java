/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author Hi
 */
@Entity
@Table(name = "stud")
@NamedQueries({
    @NamedQuery(name = "Stud.findAll", query = "SELECT s FROM Stud s"),
    @NamedQuery(name = "Stud.findByStudId", query = "SELECT s FROM Stud s WHERE s.studId = :studId"),
    @NamedQuery(name = "Stud.findByStudName", query = "SELECT s FROM Stud s WHERE s.studName = :studName")})
public class Stud implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "stud_Id")
    private Integer studId;
    @Basic(optional = false)
    @Column(name = "stud_Name")
    private String studName;

    public Stud() {
    }

    public Stud(Integer studId) {
        this.studId = studId;
    }

    public Stud(Integer studId, String studName) {
        this.studId = studId;
        this.studName = studName;
    }

    public Integer getStudId() {
        return studId;
    }

    public void setStudId(Integer studId) {
        this.studId = studId;
    }

    public String getStudName() {
        return studName;
    }

    public void setStudName(String studName) {
        this.studName = studName;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (studId != null ? studId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Stud)) {
            return false;
        }
        Stud other = (Stud) object;
        if ((this.studId == null && other.studId != null) || (this.studId != null && !this.studId.equals(other.studId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entity.Stud[ studId=" + studId + " ]";
    }
    
}
