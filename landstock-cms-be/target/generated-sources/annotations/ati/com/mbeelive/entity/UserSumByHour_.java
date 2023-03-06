package ati.com.mbeelive.entity;

import java.time.LocalDateTime;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(UserSumByHour.class)
public abstract class UserSumByHour_ {

	public static volatile SingularAttribute<UserSumByHour, LocalDateTime> createdAt;
	public static volatile SingularAttribute<UserSumByHour, Integer> ccu;
	public static volatile SingularAttribute<UserSumByHour, Long> id;

	public static final String CREATED_AT = "createdAt";
	public static final String CCU = "ccu";
	public static final String ID = "id";

}

