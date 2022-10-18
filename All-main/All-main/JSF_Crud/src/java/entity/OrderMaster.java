/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author HP
 */
@Entity
@Table(name = "order_master")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "OrderMaster.findAll", query = "SELECT o FROM OrderMaster o"),
    @NamedQuery(name = "OrderMaster.findByOrderId", query = "SELECT o FROM OrderMaster o WHERE o.orderId = :orderId"),
    @NamedQuery(name = "OrderMaster.findByOrderDatetime", query = "SELECT o FROM OrderMaster o WHERE o.orderDatetime = :orderDatetime"),
    @NamedQuery(name = "OrderMaster.findBySessionId", query = "SELECT o FROM OrderMaster o WHERE o.sessionId = :sessionId"),
    @NamedQuery(name = "OrderMaster.findByPaymentMode", query = "SELECT o FROM OrderMaster o WHERE o.paymentMode = :paymentMode"),
    @NamedQuery(name = "OrderMaster.findByTax", query = "SELECT o FROM OrderMaster o WHERE o.tax = :tax"),
    @NamedQuery(name = "OrderMaster.findByTotalAmount", query = "SELECT o FROM OrderMaster o WHERE o.totalAmount = :totalAmount"),
    @NamedQuery(name = "OrderMaster.findByOrderStatus", query = "SELECT o FROM OrderMaster o WHERE o.orderStatus = :orderStatus")})
public class OrderMaster implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "order_id")
    private Integer orderId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "order_datetime")
    private String orderDatetime;
    @Basic(optional = false)
    @NotNull
    @Column(name = "session_id")
    private int sessionId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "payment_mode")
    private String paymentMode;
    @Basic(optional = false)
    @NotNull
    @Column(name = "tax")
    private int tax;
    @Basic(optional = false)
    @NotNull
    @Column(name = "total_amount")
    private int totalAmount;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "order_status")
    private String orderStatus;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "orderId")
    private List<OrderDetail> orderDetailList;

    public OrderMaster() {
    }

    public OrderMaster(Integer orderId) {
        this.orderId = orderId;
    }

    public OrderMaster(Integer orderId, String orderDatetime, int sessionId, String paymentMode, int tax, int totalAmount, String orderStatus) {
        this.orderId = orderId;
        this.orderDatetime = orderDatetime;
        this.sessionId = sessionId;
        this.paymentMode = paymentMode;
        this.tax = tax;
        this.totalAmount = totalAmount;
        this.orderStatus = orderStatus;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public String getOrderDatetime() {
        return orderDatetime;
    }

    public void setOrderDatetime(String orderDatetime) {
        this.orderDatetime = orderDatetime;
    }

    public int getSessionId() {
        return sessionId;
    }

    public void setSessionId(int sessionId) {
        this.sessionId = sessionId;
    }

    public String getPaymentMode() {
        return paymentMode;
    }

    public void setPaymentMode(String paymentMode) {
        this.paymentMode = paymentMode;
    }

    public int getTax() {
        return tax;
    }

    public void setTax(int tax) {
        this.tax = tax;
    }

    public int getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(int totalAmount) {
        this.totalAmount = totalAmount;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    @XmlTransient
    public List<OrderDetail> getOrderDetailList() {
        return orderDetailList;
    }

    public void setOrderDetailList(List<OrderDetail> orderDetailList) {
        this.orderDetailList = orderDetailList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (orderId != null ? orderId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OrderMaster)) {
            return false;
        }
        OrderMaster other = (OrderMaster) object;
        if ((this.orderId == null && other.orderId != null) || (this.orderId != null && !this.orderId.equals(other.orderId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.OrderMaster[ orderId=" + orderId + " ]";
    }
    
}
