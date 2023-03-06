package ati.com.mbeelive.entity;

import ati.com.mbeelive.enums.ChartType;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(TransactionChart.class)
public abstract class TransactionChart_ {

	public static volatile SingularAttribute<TransactionChart, Integer> year;
	public static volatile SingularAttribute<TransactionChart, Long> numberTransaction;
	public static volatile SingularAttribute<TransactionChart, String> location;
	public static volatile SingularAttribute<TransactionChart, Long> id;
	public static volatile SingularAttribute<TransactionChart, ChartType> type;
	public static volatile SingularAttribute<TransactionChart, Integer> quarter;

	public static final String YEAR = "year";
	public static final String NUMBER_TRANSACTION = "numberTransaction";
	public static final String LOCATION = "location";
	public static final String ID = "id";
	public static final String TYPE = "type";
	public static final String QUARTER = "quarter";

}

