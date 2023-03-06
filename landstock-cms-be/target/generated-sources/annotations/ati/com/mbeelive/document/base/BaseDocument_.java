package ati.com.mbeelive.document.base;

import java.time.LocalDateTime;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(BaseDocument.class)
public abstract class BaseDocument_ {

	public static volatile SingularAttribute<BaseDocument, LocalDateTime> createdAt;
	public static volatile SingularAttribute<BaseDocument, Boolean> deleted;
	public static volatile SingularAttribute<BaseDocument, Long> createdBy;
	public static volatile SingularAttribute<BaseDocument, LocalDateTime> updatedAt;

	public static final String CREATED_AT = "createdAt";
	public static final String DELETED = "deleted";
	public static final String CREATED_BY = "createdBy";
	public static final String UPDATED_AT = "updatedAt";

}

