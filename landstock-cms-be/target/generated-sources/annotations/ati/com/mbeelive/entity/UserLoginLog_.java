package ati.com.mbeelive.entity;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(UserLoginLog.class)
public abstract class UserLoginLog_ {

	public static volatile SingularAttribute<UserLoginLog, Date> createdAt;
	public static volatile SingularAttribute<UserLoginLog, String> cif;
	public static volatile SingularAttribute<UserLoginLog, String> address;
	public static volatile SingularAttribute<UserLoginLog, Date> dob;
	public static volatile SingularAttribute<UserLoginLog, String> idCardNo;
	public static volatile SingularAttribute<UserLoginLog, String> context;
	public static volatile SingularAttribute<UserLoginLog, String> mobile;
	public static volatile SingularAttribute<UserLoginLog, Long> id;
	public static volatile SingularAttribute<UserLoginLog, String> fullname;
	public static volatile SingularAttribute<UserLoginLog, Long> userId;
	public static volatile SingularAttribute<UserLoginLog, String> deviceId;
	public static volatile SingularAttribute<UserLoginLog, String> email;

	public static final String CREATED_AT = "createdAt";
	public static final String CIF = "cif";
	public static final String ADDRESS = "address";
	public static final String DOB = "dob";
	public static final String ID_CARD_NO = "idCardNo";
	public static final String CONTEXT = "context";
	public static final String MOBILE = "mobile";
	public static final String ID = "id";
	public static final String FULLNAME = "fullname";
	public static final String USER_ID = "userId";
	public static final String DEVICE_ID = "deviceId";
	public static final String EMAIL = "email";

}

