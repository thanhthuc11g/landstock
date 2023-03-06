package ati.com.mbeelive.entity;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(UserFavProject.class)
public abstract class UserFavProject_ {

	public static volatile SingularAttribute<UserFavProject, Date> createdAt;
	public static volatile SingularAttribute<UserFavProject, Long> id;
	public static volatile SingularAttribute<UserFavProject, Long> userId;
	public static volatile SingularAttribute<UserFavProject, Long> projectId;

	public static final String CREATED_AT = "createdAt";
	public static final String ID = "id";
	public static final String USER_ID = "userId";
	public static final String PROJECT_ID = "projectId";

}

