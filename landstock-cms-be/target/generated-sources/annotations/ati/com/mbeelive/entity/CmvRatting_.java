package ati.com.mbeelive.entity;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(CmvRatting.class)
public abstract class CmvRatting_ {

	public static volatile SingularAttribute<CmvRatting, Date> createdAt;
	public static volatile SingularAttribute<CmvRatting, Long> refHuyenCode;
	public static volatile SingularAttribute<CmvRatting, Long> refDuongCode;
	public static volatile SingularAttribute<CmvRatting, Boolean> isAccept;
	public static volatile SingularAttribute<CmvRatting, Double> cmvPrice;
	public static volatile SingularAttribute<CmvRatting, Long> refTinhCode;
	public static volatile SingularAttribute<CmvRatting, Boolean> isMatDuong;
	public static volatile SingularAttribute<CmvRatting, Long> id;
	public static volatile SingularAttribute<CmvRatting, Long> dienTich;
	public static volatile SingularAttribute<CmvRatting, Double> suggestPrice;

	public static final String CREATED_AT = "createdAt";
	public static final String REF_HUYEN_CODE = "refHuyenCode";
	public static final String REF_DUONG_CODE = "refDuongCode";
	public static final String IS_ACCEPT = "isAccept";
	public static final String CMV_PRICE = "cmvPrice";
	public static final String REF_TINH_CODE = "refTinhCode";
	public static final String IS_MAT_DUONG = "isMatDuong";
	public static final String ID = "id";
	public static final String DIEN_TICH = "dienTich";
	public static final String SUGGEST_PRICE = "suggestPrice";

}

