/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author HP
 */
@Entity
@Table(name = "product_master")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ProductMaster.findAll", query = "SELECT p FROM ProductMaster p"),
    @NamedQuery(name = "ProductMaster.findByProductId", query = "SELECT p FROM ProductMaster p WHERE p.productId = :productId"),
    @NamedQuery(name = "ProductMaster.findByProductName", query = "SELECT p FROM ProductMaster p WHERE p.productName = :productName"),
    @NamedQuery(name = "ProductMaster.findByPrice", query = "SELECT p FROM ProductMaster p WHERE p.price = :price"),
    @NamedQuery(name = "ProductMaster.findByUnit", query = "SELECT p FROM ProductMaster p WHERE p.unit = :unit"),
    @NamedQuery(name = "ProductMaster.findByDiscount", query = "SELECT p FROM ProductMaster p WHERE p.discount = :discount"),
    @NamedQuery(name = "ProductMaster.findByImage", query = "SELECT p FROM ProductMaster p WHERE p.image = :image"),
    @NamedQuery(name = "ProductMaster.findByStock", query = "SELECT p FROM ProductMaster p WHERE p.stock = :stock")})
public class ProductMaster implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "product_id")
    private Integer productId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "product_name")
    private String productName;
    @Basic(optional = false)
    @NotNull
    @Column(name = "price")
    private int price;
    @Basic(optional = false)
    @NotNull
    @Column(name = "unit")
    private int unit;
    @Basic(optional = false)
    @NotNull
    @Column(name = "discount")
    private int discount;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "image")
    private String image;
    @Basic(optional = false)
    @NotNull
    @Column(name = "stock")
    private int stock;
    @JoinColumn(name = "category_id", referencedColumnName = "category_id")
    @ManyToOne(optional = false)
    private CategoryMaster categoryId;

    public ProductMaster() {
    }

    public ProductMaster(Integer productId) {
        this.productId = productId;
    }

    public ProductMaster(Integer productId, String productName, int price, int unit, int discount, String image, int stock) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.unit = unit;
        this.discount = discount;
        this.image = image;
        this.stock = stock;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getUnit() {
        return unit;
    }

    public void setUnit(int unit) {
        this.unit = unit;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public CategoryMaster getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(CategoryMaster categoryId) {
        this.categoryId = categoryId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (productId != null ? productId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProductMaster)) {
            return false;
        }
        ProductMaster other = (ProductMaster) object;
        if ((this.productId == null && other.productId != null) || (this.productId != null && !this.productId.equals(other.productId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.ProductMaster[ productId=" + productId + " ]";
    }
    
}
