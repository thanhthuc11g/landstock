package ati.com.mbeelive.entity;

import ati.com.mbeelive.enums.CommonStatus;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Avatar.class)
public abstract class Avatar_ extends ati.com.mbeelive.entity.base.BaseEntity_ {

	public static volatile SingularAttribute<Avatar, Long> id;
	public static volatile SingularAttribute<Avatar, String> url;
	public static volatile SingularAttribute<Avatar, Long> categoryId;
	public static volatile SingularAttribute<Avatar, CommonStatus> status;

	public static final String ID = "id";
	public static final String URL = "url";
	public static final String CATEGORY_ID = "categoryId";
	public static final String STATUS = "status";

}

