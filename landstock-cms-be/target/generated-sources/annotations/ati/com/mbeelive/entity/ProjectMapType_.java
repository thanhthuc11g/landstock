package ati.com.mbeelive.entity;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(ProjectMapType.class)
public abstract class ProjectMapType_ {

	public static volatile SingularAttribute<ProjectMapType, ProjectType> projectType;
	public static volatile SingularAttribute<ProjectMapType, Project> project;
	public static volatile SingularAttribute<ProjectMapType, Long> id;

	public static final String PROJECT_TYPE = "projectType";
	public static final String PROJECT = "project";
	public static final String ID = "id";

}

