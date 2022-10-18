package entity;

import entity.ProductMaster;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2022-10-17T18:57:54", comments="EclipseLink-2.7.9.v20210604-rNA")
@StaticMetamodel(CategoryMaster.class)
public class CategoryMaster_ { 

    public static volatile SingularAttribute<CategoryMaster, Integer> parentCategoryId;
    public static volatile ListAttribute<CategoryMaster, ProductMaster> productMasterList;
    public static volatile SingularAttribute<CategoryMaster, String> categoryName;
    public static volatile SingularAttribute<CategoryMaster, Integer> categoryId;

}