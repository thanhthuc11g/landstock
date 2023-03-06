package ati.com.mbeelive.entity;

import java.time.LocalDateTime;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(UserSumByMonth.class)
public abstract class UserSumByMonth_ {

	public static volatile SingularAttribute<UserSumByMonth, Integer> active4times;
	public static volatile SingularAttribute<UserSumByMonth, LocalDateTime> createdAt;
	public static volatile SingularAttribute<UserSumByMonth, Integer> ccu;
	public static volatile SingularAttribute<UserSumByMonth, Long> id;

	public static final String ACTIVE4TIMES = "active4times";
	public static final String CREATED_AT = "createdAt";
	public static final String CCU = "ccu";
	public static final String ID = "id";

}

