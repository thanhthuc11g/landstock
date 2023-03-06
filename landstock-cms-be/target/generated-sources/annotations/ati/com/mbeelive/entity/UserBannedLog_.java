package ati.com.mbeelive.entity;

import ati.com.mbeelive.enums.userbanned.UserBannedAction;
import ati.com.mbeelive.enums.userbanned.UserBannedType;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(UserBannedLog.class)
public abstract class UserBannedLog_ extends ati.com.mbeelive.entity.base.BaseEntity_ {

	public static volatile SingularAttribute<UserBannedLog, UserBannedAction> actionType;
	public static volatile SingularAttribute<UserBannedLog, Integer> times;
	public static volatile SingularAttribute<UserBannedLog, Long> userBannedId;
	public static volatile SingularAttribute<UserBannedLog, Long> id;
	public static volatile SingularAttribute<UserBannedLog, UserBannedType> type;
	public static volatile SingularAttribute<UserBannedLog, Long> userId;

	public static final String ACTION_TYPE = "actionType";
	public static final String TIMES = "times";
	public static final String USER_BANNED_ID = "userBannedId";
	public static final String ID = "id";
	public static final String TYPE = "type";
	public static final String USER_ID = "userId";

}

