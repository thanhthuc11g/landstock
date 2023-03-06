package ati.com.mbeelive.entity;

import ati.com.mbeelive.enums.CommonStatus;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(AvatarCategory.class)
public abstract class AvatarCategory_ extends ati.com.mbeelive.entity.base.BaseEntity_ {

	public static volatile SingularAttribute<AvatarCategory, String> name;
	public static volatile SingularAttribute<AvatarCategory, Long> id;
	public static volatile SingularAttribute<AvatarCategory, Integer> position;
	public static volatile SingularAttribute<AvatarCategory, CommonStatus> status;

	public static final String NAME = "name";
	public static final String ID = "id";
	public static final String POSITION = "position";
	public static final String STATUS = "status";

}

