package ati.com.mbeelive.entity;

import ati.com.mbeelive.enums.CommonStatus;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(District.class)
public abstract class District_ {

	public static volatile SingularAttribute<District, String> code;
	public static volatile SingularAttribute<District, String> provinceCode;
	public static volatile SingularAttribute<District, String> name;
	public static volatile SingularAttribute<District, Long> id;
	public static volatile SingularAttribute<District, CommonStatus> status;

	public static final String CODE = "code";
	public static final String PROVINCE_CODE = "provinceCode";
	public static final String NAME = "name";
	public static final String ID = "id";
	public static final String STATUS = "status";

}

