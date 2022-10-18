package entity;

import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2022-10-17T18:57:54", comments="EclipseLink-2.7.9.v20210604-rNA")
@StaticMetamodel(UserMaster.class)
public class UserMaster_ { 

    public static volatile SingularAttribute<UserMaster, String> password;
    public static volatile SingularAttribute<UserMaster, String> passwordAnswer;
    public static volatile SingularAttribute<UserMaster, String> address;
    public static volatile SingularAttribute<UserMaster, Integer> pin;
    public static volatile SingularAttribute<UserMaster, String> phone;
    public static volatile SingularAttribute<UserMaster, String> city;
    public static volatile SingularAttribute<UserMaster, String> passwordQuestion;
    public static volatile SingularAttribute<UserMaster, String> userName;
    public static volatile SingularAttribute<UserMaster, Integer> userId;
    public static volatile SingularAttribute<UserMaster, String> email;

}