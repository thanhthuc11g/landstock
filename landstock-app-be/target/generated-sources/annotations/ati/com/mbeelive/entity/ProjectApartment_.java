package ati.com.mbeelive.entity;

import ati.com.mbeelive.enums.ApartmentSellStatus;
import ati.com.mbeelive.enums.CommonStatus;
import ati.com.mbeelive.enums.PriceType;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(ProjectApartment.class)
public abstract class ProjectApartment_ extends ati.com.mbeelive.entity.base.BaseEntity_ {

	public static volatile SingularAttribute<ProjectApartment, String> positionImageUrl;
	public static volatile SingularAttribute<ProjectApartment, String> code;
	public static volatile SingularAttribute<ProjectApartment, Long> apartmentCategoryId;
	public static volatile SingularAttribute<ProjectApartment, PriceType> priceType;
	public static volatile SingularAttribute<ProjectApartment, String> sectionalImageUrl;
	public static volatile SingularAttribute<ProjectApartment, Float> usableSquare;
	public static volatile SingularAttribute<ProjectApartment, String> image3dUrl;
	public static volatile SingularAttribute<ProjectApartment, ApartmentSellStatus> sellStatus;
	public static volatile SingularAttribute<ProjectApartment, Long> price;
	public static volatile SingularAttribute<ProjectApartment, String> name;
	public static volatile SingularAttribute<ProjectApartment, Integer> floorNo;
	public static volatile SingularAttribute<ProjectApartment, Long> id;
	public static volatile SingularAttribute<ProjectApartment, Long> towerId;
	public static volatile SingularAttribute<ProjectApartment, Float> totalSquare;
	public static volatile SingularAttribute<ProjectApartment, String> floorCode;
	public static volatile SingularAttribute<ProjectApartment, String> direction;
	public static volatile SingularAttribute<ProjectApartment, CommonStatus> status;

	public static final String POSITION_IMAGE_URL = "positionImageUrl";
	public static final String CODE = "code";
	public static final String APARTMENT_CATEGORY_ID = "apartmentCategoryId";
	public static final String PRICE_TYPE = "priceType";
	public static final String SECTIONAL_IMAGE_URL = "sectionalImageUrl";
	public static final String USABLE_SQUARE = "usableSquare";
	public static final String IMAGE3D_URL = "image3dUrl";
	public static final String SELL_STATUS = "sellStatus";
	public static final String PRICE = "price";
	public static final String NAME = "name";
	public static final String FLOOR_NO = "floorNo";
	public static final String ID = "id";
	public static final String TOWER_ID = "towerId";
	public static final String TOTAL_SQUARE = "totalSquare";
	public static final String FLOOR_CODE = "floorCode";
	public static final String DIRECTION = "direction";
	public static final String STATUS = "status";

}

