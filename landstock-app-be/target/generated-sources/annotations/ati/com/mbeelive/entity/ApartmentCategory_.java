package ati.com.mbeelive.entity;

import ati.com.mbeelive.enums.CommonStatus;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(ApartmentCategory.class)
public abstract class ApartmentCategory_ extends ati.com.mbeelive.entity.base.BaseEntity_ {

	public static volatile SingularAttribute<ApartmentCategory, String> name;
	public static volatile SingularAttribute<ApartmentCategory, Long> id;
	public static volatile SingularAttribute<ApartmentCategory, Long> projectId;
	public static volatile SingularAttribute<ApartmentCategory, CommonStatus> status;

	public static final String NAME = "name";
	public static final String ID = "id";
	public static final String PROJECT_ID = "projectId";
	public static final String STATUS = "status";

}

