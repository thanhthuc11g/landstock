package ati.com.mbeelive.entity;

import java.time.LocalDateTime;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(UserSumByDay.class)
public abstract class UserSumByDay_ {

	public static volatile SingularAttribute<UserSumByDay, LocalDateTime> createdAt;
	public static volatile SingularAttribute<UserSumByDay, Integer> ccu;
	public static volatile SingularAttribute<UserSumByDay, Long> id;

	public static final String CREATED_AT = "createdAt";
	public static final String CCU = "ccu";
	public static final String ID = "id";

}

