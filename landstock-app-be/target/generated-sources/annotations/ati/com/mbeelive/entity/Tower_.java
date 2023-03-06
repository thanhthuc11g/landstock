package ati.com.mbeelive.entity;

import ati.com.mbeelive.enums.CommonStatus;
import ati.com.mbeelive.enums.TowerSellStatus;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Tower.class)
public abstract class Tower_ extends ati.com.mbeelive.entity.base.BaseEntity_ {

	public static volatile SingularAttribute<Tower, String> code;
	public static volatile SingularAttribute<Tower, TowerSellStatus> sellStatus;
	public static volatile SingularAttribute<Tower, Long> totalApartments;
	public static volatile SingularAttribute<Tower, String> name;
	public static volatile SingularAttribute<Tower, String> sectionalImageUrl;
	public static volatile SingularAttribute<Tower, Long> id;
	public static volatile SingularAttribute<Tower, Long> totalFloors;
	public static volatile SingularAttribute<Tower, Long> projectId;
	public static volatile SingularAttribute<Tower, CommonStatus> status;

	public static final String CODE = "code";
	public static final String SELL_STATUS = "sellStatus";
	public static final String TOTAL_APARTMENTS = "totalApartments";
	public static final String NAME = "name";
	public static final String SECTIONAL_IMAGE_URL = "sectionalImageUrl";
	public static final String ID = "id";
	public static final String TOTAL_FLOORS = "totalFloors";
	public static final String PROJECT_ID = "projectId";
	public static final String STATUS = "status";

}

