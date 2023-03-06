package ati.com.mbeelive.entity;

import ati.com.mbeelive.enums.userbanned.UserBannedType;
import java.time.LocalDateTime;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(UserBanned.class)
public abstract class UserBanned_ extends ati.com.mbeelive.entity.base.BaseEntity_ {

	public static volatile SingularAttribute<UserBanned, LocalDateTime> expiredAt;
	public static volatile SingularAttribute<UserBanned, String> reason;
	public static volatile SingularAttribute<UserBanned, Boolean> isPermanent;
	public static volatile SingularAttribute<UserBanned, Integer> times;
	public static volatile SingularAttribute<UserBanned, Long> id;
	public static volatile SingularAttribute<UserBanned, UserBannedType> type;
	public static volatile SingularAttribute<UserBanned, Long> userId;

	public static final String EXPIRED_AT = "expiredAt";
	public static final String REASON = "reason";
	public static final String IS_PERMANENT = "isPermanent";
	public static final String TIMES = "times";
	public static final String ID = "id";
	public static final String TYPE = "type";
	public static final String USER_ID = "userId";

}

