package entity;

import entity.OrderMaster;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2022-10-17T18:57:54", comments="EclipseLink-2.7.9.v20210604-rNA")
@StaticMetamodel(OrderDetail.class)
public class OrderDetail_ { 

    public static volatile SingularAttribute<OrderDetail, Integer> productId;
    public static volatile SingularAttribute<OrderDetail, OrderMaster> orderId;
    public static volatile SingularAttribute<OrderDetail, Integer> discount;
    public static volatile SingularAttribute<OrderDetail, Integer> orderDetailId;
    public static volatile SingularAttribute<OrderDetail, Integer> productPrice;

}