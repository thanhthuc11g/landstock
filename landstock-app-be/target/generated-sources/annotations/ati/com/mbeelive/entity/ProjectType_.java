package ati.com.mbeelive.entity;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(ProjectType.class)
public abstract class ProjectType_ {

	public static volatile SingularAttribute<ProjectType, Date> createdAt;
	public static volatile SingularAttribute<ProjectType, String> name;
	public static volatile SingularAttribute<ProjectType, Long> id;
	public static volatile SingularAttribute<ProjectType, Date> updatedAt;

	public static final String CREATED_AT = "createdAt";
	public static final String NAME = "name";
	public static final String ID = "id";
	public static final String UPDATED_AT = "updatedAt";

}

