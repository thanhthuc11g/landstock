package ati.com.mbeelive.entity;

import ati.com.mbeelive.enums.CommonStatus;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Ward.class)
public abstract class Ward_ {

	public static volatile SingularAttribute<Ward, String> code;
	public static volatile SingularAttribute<Ward, String> districtCode;
	public static volatile SingularAttribute<Ward, String> name;
	public static volatile SingularAttribute<Ward, Long> id;
	public static volatile SingularAttribute<Ward, CommonStatus> status;

	public static final String CODE = "code";
	public static final String DISTRICT_CODE = "districtCode";
	public static final String NAME = "name";
	public static final String ID = "id";
	public static final String STATUS = "status";

}

