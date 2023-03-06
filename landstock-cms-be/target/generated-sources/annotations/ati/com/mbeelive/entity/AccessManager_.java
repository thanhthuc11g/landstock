package ati.com.mbeelive.entity;

import ati.com.mbeelive.enums.AccessManagerType;
import ati.com.mbeelive.enums.CommonStatus;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(AccessManager.class)
public abstract class AccessManager_ extends ati.com.mbeelive.entity.base.BaseEntity_ {

	public static volatile SingularAttribute<AccessManager, Long> id;
	public static volatile SingularAttribute<AccessManager, Integer> position;
	public static volatile SingularAttribute<AccessManager, String> title;
	public static volatile SingularAttribute<AccessManager, AccessManagerType> type;
	public static volatile SingularAttribute<AccessManager, String> url;
	public static volatile SingularAttribute<AccessManager, CommonStatus> status;

	public static final String ID = "id";
	public static final String POSITION = "position";
	public static final String TITLE = "title";
	public static final String TYPE = "type";
	public static final String URL = "url";
	public static final String STATUS = "status";

}

