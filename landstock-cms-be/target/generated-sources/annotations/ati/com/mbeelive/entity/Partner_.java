package ati.com.mbeelive.entity;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Partner.class)
public abstract class Partner_ {

	public static volatile SingularAttribute<Partner, Date> createdAt;
	public static volatile SingularAttribute<Partner, String> code;
	public static volatile SingularAttribute<Partner, Boolean> deleted;
	public static volatile SingularAttribute<Partner, String> name;
	public static volatile SingularAttribute<Partner, String> description;
	public static volatile SingularAttribute<Partner, String> logo;
	public static volatile SingularAttribute<Partner, Long> id;
	public static volatile SingularAttribute<Partner, Date> updatedAt;

	public static final String CREATED_AT = "createdAt";
	public static final String CODE = "code";
	public static final String DELETED = "deleted";
	public static final String NAME = "name";
	public static final String DESCRIPTION = "description";
	public static final String LOGO = "logo";
	public static final String ID = "id";
	public static final String UPDATED_AT = "updatedAt";

}

