package ati.com.mbeelive.entity.mapper;

import ati.com.mbeelive.dto.CommonSettingDto;
import ati.com.mbeelive.entity.CommonSetting;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-02-24T10:15:16+0700",
    comments = "version: 1.4.1.Final, compiler: javac, environment: Java 11.0.14 (Oracle Corporation)"
)
public class CommonSettingMapperImpl implements CommonSettingMapper {

    @Override
    public CommonSettingDto toDto(CommonSetting entity) {
        if ( entity == null ) {
            return null;
        }

        CommonSettingDto commonSettingDto = new CommonSettingDto();

        commonSettingDto.setId( entity.getId() );
        if ( entity.getName() != null ) {
            commonSettingDto.setName( Long.parseLong( entity.getName() ) );
        }
        commonSettingDto.setValue( entity.getValue() );
        commonSettingDto.setCreatedBy( entity.getCreatedBy() );
        commonSettingDto.setCreatedAt( entity.getCreatedAt() );
        commonSettingDto.setUpdatedAt( entity.getUpdatedAt() );

        return commonSettingDto;
    }

    @Override
    public CommonSetting toEntity(CommonSettingDto dto) {
        if ( dto == null ) {
            return null;
        }

        CommonSetting commonSetting = new CommonSetting();

        commonSetting.setId( dto.getId() );
        if ( dto.getName() != null ) {
            commonSetting.setName( String.valueOf( dto.getName() ) );
        }
        commonSetting.setValue( dto.getValue() );
        commonSetting.setCreatedBy( dto.getCreatedBy() );
        commonSetting.setCreatedAt( dto.getCreatedAt() );
        commonSetting.setUpdatedAt( dto.getUpdatedAt() );

        return commonSetting;
    }
}
