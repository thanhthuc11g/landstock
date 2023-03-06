package ati.com.mbeelive.entity;

import ati.com.mbeelive.enums.CommonStatus;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Street.class)
public abstract class Street_ {

	public static volatile SingularAttribute<Street, String> code;
	public static volatile SingularAttribute<Street, String> districtCode;
	public static volatile SingularAttribute<Street, String> name;
	public static volatile SingularAttribute<Street, Long> id;
	public static volatile SingularAttribute<Street, String> wardCode;
	public static volatile SingularAttribute<Street, CommonStatus> status;

	public static final String CODE = "code";
	public static final String DISTRICT_CODE = "districtCode";
	public static final String NAME = "name";
	public static final String ID = "id";
	public static final String WARD_CODE = "wardCode";
	public static final String STATUS = "status";

}

