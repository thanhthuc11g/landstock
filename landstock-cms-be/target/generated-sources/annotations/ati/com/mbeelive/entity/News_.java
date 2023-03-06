package ati.com.mbeelive.entity;

import ati.com.mbeelive.enums.NewsStatus;
import ati.com.mbeelive.enums.NewsType;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(News.class)
public abstract class News_ {

	public static volatile SingularAttribute<News, String> image;
	public static volatile SingularAttribute<News, Date> createdAt;
	public static volatile SingularAttribute<News, String> shortDes;
	public static volatile SingularAttribute<News, String> partnerCode;
	public static volatile SingularAttribute<News, String> fullDes;
	public static volatile SingularAttribute<News, Long> createdBy;
	public static volatile SingularAttribute<News, Long> id;
	public static volatile SingularAttribute<News, String> title;
	public static volatile SingularAttribute<News, NewsType> type;
	public static volatile SingularAttribute<News, String> url;
	public static volatile SingularAttribute<News, NewsStatus> status;
	public static volatile SingularAttribute<News, Date> updatedAt;

	public static final String IMAGE = "image";
	public static final String CREATED_AT = "createdAt";
	public static final String SHORT_DES = "shortDes";
	public static final String PARTNER_CODE = "partnerCode";
	public static final String FULL_DES = "fullDes";
	public static final String CREATED_BY = "createdBy";
	public static final String ID = "id";
	public static final String TITLE = "title";
	public static final String TYPE = "type";
	public static final String URL = "url";
	public static final String STATUS = "status";
	public static final String UPDATED_AT = "updatedAt";

}

