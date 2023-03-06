package ati.com.mbeelive.entity;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Banner.class)
public abstract class Banner_ {

	public static volatile SingularAttribute<Banner, Date> createdAt;
	public static volatile SingularAttribute<Banner, String> link;
	public static volatile SingularAttribute<Banner, Long> id;
	public static volatile SingularAttribute<Banner, Integer> position;
	public static volatile SingularAttribute<Banner, String> title;
	public static volatile SingularAttribute<Banner, Integer> type;
	public static volatile SingularAttribute<Banner, String> url;
	public static volatile SingularAttribute<Banner, String> content;
	public static volatile SingularAttribute<Banner, Integer> status;
	public static volatile SingularAttribute<Banner, Date> updatedAt;

	public static final String CREATED_AT = "createdAt";
	public static final String LINK = "link";
	public static final String ID = "id";
	public static final String POSITION = "position";
	public static final String TITLE = "title";
	public static final String TYPE = "type";
	public static final String URL = "url";
	public static final String CONTENT = "content";
	public static final String STATUS = "status";
	public static final String UPDATED_AT = "updatedAt";

}

