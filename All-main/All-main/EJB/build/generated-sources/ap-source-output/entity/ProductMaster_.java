package entity;

import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2022-10-17T18:58:36", comments="EclipseLink-2.7.9.v20210604-rNA")
@StaticMetamodel(ProductMaster.class)
public class ProductMaster_ { 

    public static volatile SingularAttribute<ProductMaster, String> image;
    public static volatile SingularAttribute<ProductMaster, Integer> unit;
    public static volatile SingularAttribute<ProductMaster, Integer> productId;
    public static volatile SingularAttribute<ProductMaster, Integer> price;
    public static volatile SingularAttribute<ProductMaster, Integer> discount;
    public static volatile SingularAttribute<ProductMaster, String> productName;

}