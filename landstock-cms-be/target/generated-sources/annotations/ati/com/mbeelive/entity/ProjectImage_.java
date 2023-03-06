package ati.com.mbeelive.entity;

import ati.com.mbeelive.enums.CommonStatus;
import ati.com.mbeelive.enums.ProjectImageType;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(ProjectImage.class)
public abstract class ProjectImage_ extends ati.com.mbeelive.entity.base.BaseEntity_ {

	public static volatile SingularAttribute<ProjectImage, String> imageUrl;
	public static volatile SingularAttribute<ProjectImage, String> name;
	public static volatile SingularAttribute<ProjectImage, Long> id;
	public static volatile SingularAttribute<ProjectImage, ProjectImageType> type;
	public static volatile SingularAttribute<ProjectImage, Long> projectId;
	public static volatile SingularAttribute<ProjectImage, CommonStatus> status;

	public static final String IMAGE_URL = "imageUrl";
	public static final String NAME = "name";
	public static final String ID = "id";
	public static final String TYPE = "type";
	public static final String PROJECT_ID = "projectId";
	public static final String STATUS = "status";

}

