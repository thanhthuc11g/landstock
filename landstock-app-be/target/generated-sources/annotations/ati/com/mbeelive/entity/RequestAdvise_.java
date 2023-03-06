package ati.com.mbeelive.entity;

import ati.com.mbeelive.enums.RequestAdviseStatus;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(RequestAdvise.class)
public abstract class RequestAdvise_ {

	public static volatile SingularAttribute<RequestAdvise, String> note;
	public static volatile SingularAttribute<RequestAdvise, ProjectApartment> projectApartment;
	public static volatile SingularAttribute<RequestAdvise, String> emailAdvise;
	public static volatile SingularAttribute<RequestAdvise, Project> project;
	public static volatile SingularAttribute<RequestAdvise, Date> createdAt;
	public static volatile SingularAttribute<RequestAdvise, String> phone;
	public static volatile SingularAttribute<RequestAdvise, Long> id;
	public static volatile SingularAttribute<RequestAdvise, String> phoneAdvise;
	public static volatile SingularAttribute<RequestAdvise, User> user;
	public static volatile SingularAttribute<RequestAdvise, String> email;
	public static volatile SingularAttribute<RequestAdvise, RequestAdviseStatus> status;
	public static volatile SingularAttribute<RequestAdvise, Tower> tower;
	public static volatile SingularAttribute<RequestAdvise, Date> updatedAt;

	public static final String NOTE = "note";
	public static final String PROJECT_APARTMENT = "projectApartment";
	public static final String EMAIL_ADVISE = "emailAdvise";
	public static final String PROJECT = "project";
	public static final String CREATED_AT = "createdAt";
	public static final String PHONE = "phone";
	public static final String ID = "id";
	public static final String PHONE_ADVISE = "phoneAdvise";
	public static final String USER = "user";
	public static final String EMAIL = "email";
	public static final String STATUS = "status";
	public static final String TOWER = "tower";
	public static final String UPDATED_AT = "updatedAt";

}

