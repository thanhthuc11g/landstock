package ati.com.mbeelive.entity;

import ati.com.mbeelive.enums.CommonStatus;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(FengshuiItem.class)
public abstract class FengshuiItem_ {

	public static volatile SingularAttribute<FengshuiItem, String> image;
	public static volatile SingularAttribute<FengshuiItem, Date> createdAt;
	public static volatile SingularAttribute<FengshuiItem, String> thumbnail;
	public static volatile SingularAttribute<FengshuiItem, String> shortDes;
	public static volatile SingularAttribute<FengshuiItem, String> fullDes;
	public static volatile SingularAttribute<FengshuiItem, Long> createdBy;
	public static volatile SingularAttribute<FengshuiItem, String> cateId;
	public static volatile SingularAttribute<FengshuiItem, Long> id;
	public static volatile SingularAttribute<FengshuiItem, String> title;
	public static volatile SingularAttribute<FengshuiItem, CommonStatus> status;
	public static volatile SingularAttribute<FengshuiItem, Date> updatedAt;

	public static final String IMAGE = "image";
	public static final String CREATED_AT = "createdAt";
	public static final String THUMBNAIL = "thumbnail";
	public static final String SHORT_DES = "shortDes";
	public static final String FULL_DES = "fullDes";
	public static final String CREATED_BY = "createdBy";
	public static final String CATE_ID = "cateId";
	public static final String ID = "id";
	public static final String TITLE = "title";
	public static final String STATUS = "status";
	public static final String UPDATED_AT = "updatedAt";

}

