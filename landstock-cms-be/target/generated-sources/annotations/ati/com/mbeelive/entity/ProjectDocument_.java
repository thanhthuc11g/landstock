package ati.com.mbeelive.entity;

import ati.com.mbeelive.enums.ProjectLinkType;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(ProjectDocument.class)
public abstract class ProjectDocument_ extends ati.com.mbeelive.entity.base.BaseEntity_ {

	public static volatile SingularAttribute<ProjectDocument, Long> id;
	public static volatile SingularAttribute<ProjectDocument, ProjectLinkType> type;
	public static volatile SingularAttribute<ProjectDocument, Long> projectId;
	public static volatile SingularAttribute<ProjectDocument, String> url;

	public static final String ID = "id";
	public static final String TYPE = "type";
	public static final String PROJECT_ID = "projectId";
	public static final String URL = "url";

}

