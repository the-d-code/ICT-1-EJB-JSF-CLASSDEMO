package entity;

import entity.OrderDetail;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2022-10-17T18:57:54", comments="EclipseLink-2.7.9.v20210604-rNA")
@StaticMetamodel(OrderMaster.class)
public class OrderMaster_ { 

    public static volatile SingularAttribute<OrderMaster, String> orderDatetime;
    public static volatile SingularAttribute<OrderMaster, Integer> totalAmount;
    public static volatile ListAttribute<OrderMaster, OrderDetail> orderDetailList;
    public static volatile SingularAttribute<OrderMaster, Integer> orderId;
    public static volatile SingularAttribute<OrderMaster, String> paymentMode;
    public static volatile SingularAttribute<OrderMaster, String> orderStatus;
    public static volatile SingularAttribute<OrderMaster, Integer> tax;
    public static volatile SingularAttribute<OrderMaster, Integer> sessionId;

}