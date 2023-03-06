package ati.com.mbeelive.entity;

import ati.com.mbeelive.enums.fengshui.TargetFs;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Prayer.class)
public abstract class Prayer_ {

	public static volatile SingularAttribute<Prayer, Date> createdAt;
	public static volatile SingularAttribute<Prayer, String> item;
	public static volatile SingularAttribute<Prayer, Long> createdBy;
	public static volatile SingularAttribute<Prayer, String> conent;
	public static volatile SingularAttribute<Prayer, String> name;
	public static volatile SingularAttribute<Prayer, Long> id;
	public static volatile SingularAttribute<Prayer, TargetFs> target;
	public static volatile SingularAttribute<Prayer, Date> updatedAt;

	public static final String CREATED_AT = "createdAt";
	public static final String ITEM = "item";
	public static final String CREATED_BY = "createdBy";
	public static final String CONENT = "conent";
	public static final String NAME = "name";
	public static final String ID = "id";
	public static final String TARGET = "target";
	public static final String UPDATED_AT = "updatedAt";

}

