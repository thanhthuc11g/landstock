package ati.com.mbeelive.entity;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(CmvSearchResponse.class)
public abstract class CmvSearchResponse_ {

	public static volatile SingularAttribute<CmvSearchResponse, Date> createdAt;
	public static volatile SingularAttribute<CmvSearchResponse, Long> refDuongCode;
	public static volatile SingularAttribute<CmvSearchResponse, Boolean> isAccept;
	public static volatile SingularAttribute<CmvSearchResponse, Long> id;
	public static volatile SingularAttribute<CmvSearchResponse, Long> dienTich;
	public static volatile SingularAttribute<CmvSearchResponse, Long> suggestPrice;

	public static final String CREATED_AT = "createdAt";
	public static final String REF_DUONG_CODE = "refDuongCode";
	public static final String IS_ACCEPT = "isAccept";
	public static final String ID = "id";
	public static final String DIEN_TICH = "dienTich";
	public static final String SUGGEST_PRICE = "suggestPrice";

}

