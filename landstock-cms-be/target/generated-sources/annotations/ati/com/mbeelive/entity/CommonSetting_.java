package ati.com.mbeelive.entity;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(CommonSetting.class)
public abstract class CommonSetting_ {

	public static volatile SingularAttribute<CommonSetting, Date> createdAt;
	public static volatile SingularAttribute<CommonSetting, Long> createdBy;
	public static volatile SingularAttribute<CommonSetting, String> name;
	public static volatile SingularAttribute<CommonSetting, Long> id;
	public static volatile SingularAttribute<CommonSetting, String> value;
	public static volatile SingularAttribute<CommonSetting, Date> updatedAt;

	public static final String CREATED_AT = "createdAt";
	public static final String CREATED_BY = "createdBy";
	public static final String NAME = "name";
	public static final String ID = "id";
	public static final String VALUE = "value";
	public static final String UPDATED_AT = "updatedAt";

}

