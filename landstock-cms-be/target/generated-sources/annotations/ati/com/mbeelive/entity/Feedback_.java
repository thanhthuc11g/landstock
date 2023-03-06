package ati.com.mbeelive.entity;

import ati.com.mbeelive.enums.FeedbackStatus;
import ati.com.mbeelive.enums.Sex;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Feedback.class)
public abstract class Feedback_ {

	public static volatile SingularAttribute<Feedback, String> cif;
	public static volatile SingularAttribute<Feedback, Date> createdAt;
	public static volatile SingularAttribute<Feedback, Sex> sex;
	public static volatile SingularAttribute<Feedback, String> mobile;
	public static volatile SingularAttribute<Feedback, Long> id;
	public static volatile SingularAttribute<Feedback, String> fullname;
	public static volatile SingularAttribute<Feedback, Long> userId;
	public static volatile SingularAttribute<Feedback, String> content;
	public static volatile SingularAttribute<Feedback, String> email;
	public static volatile SingularAttribute<Feedback, FeedbackStatus> status;
	public static volatile SingularAttribute<Feedback, Date> updatedAt;

	public static final String CIF = "cif";
	public static final String CREATED_AT = "createdAt";
	public static final String SEX = "sex";
	public static final String MOBILE = "mobile";
	public static final String ID = "id";
	public static final String FULLNAME = "fullname";
	public static final String USER_ID = "userId";
	public static final String CONTENT = "content";
	public static final String EMAIL = "email";
	public static final String STATUS = "status";
	public static final String UPDATED_AT = "updatedAt";

}

