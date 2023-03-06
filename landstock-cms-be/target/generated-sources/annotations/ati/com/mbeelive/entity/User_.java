package ati.com.mbeelive.entity;

import ati.com.mbeelive.enums.CommonStatus;
import ati.com.mbeelive.enums.Role;
import ati.com.mbeelive.enums.Sex;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(User.class)
public abstract class User_ {

	public static volatile SingularAttribute<User, String> cif;
	public static volatile SingularAttribute<User, Role> role;
	public static volatile SingularAttribute<User, String> idCardNo;
	public static volatile SingularAttribute<User, Sex> sex;
	public static volatile SingularAttribute<User, String> mobile;
	public static volatile SingularAttribute<User, Date> lastTimeLogin;
	public static volatile SingularAttribute<User, String> avatar;
	public static volatile SingularAttribute<User, Date> createdAt;
	public static volatile SingularAttribute<User, String> password;
	public static volatile SingularAttribute<User, Date> dob;
	public static volatile SingularAttribute<User, Long> id;
	public static volatile SingularAttribute<User, String> favoritesStr;
	public static volatile SingularAttribute<User, String> fullname;
	public static volatile SingularAttribute<User, String> email;
	public static volatile SingularAttribute<User, String> username;
	public static volatile SingularAttribute<User, CommonStatus> status;
	public static volatile SingularAttribute<User, String> refreshToken;
	public static volatile SingularAttribute<User, Date> updatedAt;

	public static final String CIF = "cif";
	public static final String ROLE = "role";
	public static final String ID_CARD_NO = "idCardNo";
	public static final String SEX = "sex";
	public static final String MOBILE = "mobile";
	public static final String LAST_TIME_LOGIN = "lastTimeLogin";
	public static final String AVATAR = "avatar";
	public static final String CREATED_AT = "createdAt";
	public static final String PASSWORD = "password";
	public static final String DOB = "dob";
	public static final String ID = "id";
	public static final String FAVORITES_STR = "favoritesStr";
	public static final String FULLNAME = "fullname";
	public static final String EMAIL = "email";
	public static final String USERNAME = "username";
	public static final String STATUS = "status";
	public static final String REFRESH_TOKEN = "refreshToken";
	public static final String UPDATED_AT = "updatedAt";

}

