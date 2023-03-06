package ati.com.mbeelive.entity;

import ati.com.mbeelive.enums.CommonStatus;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Province.class)
public abstract class Province_ {

	public static volatile SingularAttribute<Province, String> code;
	public static volatile SingularAttribute<Province, String> domain;
	public static volatile SingularAttribute<Province, String> name;
	public static volatile SingularAttribute<Province, Long> id;
	public static volatile SingularAttribute<Province, CommonStatus> status;

	public static final String CODE = "code";
	public static final String DOMAIN = "domain";
	public static final String NAME = "name";
	public static final String ID = "id";
	public static final String STATUS = "status";

}

