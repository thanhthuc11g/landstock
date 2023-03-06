package ati.com.mbeelive.entity.mapper;

import ati.com.mbeelive.dto.land.output.LandUserInfo;
import ati.com.mbeelive.dto.userbanned.output.UserBannedLogOutput.UserInfo;
import ati.com.mbeelive.entity.User;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-02-01T15:40:38+0700",
    comments = "version: 1.4.1.Final, compiler: javac, environment: Java 11.0.14 (Oracle Corporation)"
)
public class UserMapperImpl implements UserMapper {

    @Override
    public List<UserInfo> toDto(List<User> users) {
        if ( users == null ) {
            return null;
        }

        List<UserInfo> list = new ArrayList<UserInfo>( users.size() );
        for ( User user : users ) {
            list.add( userToUserInfo( user ) );
        }

        return list;
    }

    @Override
    public List<ati.com.mbeelive.dto.userbanned.output.UserBannedOutput.UserInfo> toBannedUserInfo(List<User> users) {
        if ( users == null ) {
            return null;
        }

        List<ati.com.mbeelive.dto.userbanned.output.UserBannedOutput.UserInfo> list = new ArrayList<ati.com.mbeelive.dto.userbanned.output.UserBannedOutput.UserInfo>( users.size() );
        for ( User user : users ) {
            list.add( userToUserInfo1( user ) );
        }

        return list;
    }

    @Override
    public LandUserInfo toLandUserInfo(User user) {
        if ( user == null ) {
            return null;
        }

        LandUserInfo landUserInfo = new LandUserInfo();

        landUserInfo.setId( user.getId() );
        landUserInfo.setUsername( user.getUsername() );
        landUserInfo.setFullname( user.getFullname() );
        landUserInfo.setEmail( user.getEmail() );
        landUserInfo.setMobile( user.getMobile() );
        landUserInfo.setAvatar( user.getAvatar() );
        landUserInfo.setCreatedAt( user.getCreatedAt() );

        return landUserInfo;
    }

    protected UserInfo userToUserInfo(User user) {
        if ( user == null ) {
            return null;
        }

        UserInfo userInfo = new UserInfo();

        userInfo.setId( user.getId() );
        userInfo.setUsername( user.getUsername() );
        userInfo.setFullname( user.getFullname() );

        return userInfo;
    }

    protected ati.com.mbeelive.dto.userbanned.output.UserBannedOutput.UserInfo userToUserInfo1(User user) {
        if ( user == null ) {
            return null;
        }

        ati.com.mbeelive.dto.userbanned.output.UserBannedOutput.UserInfo userInfo = new ati.com.mbeelive.dto.userbanned.output.UserBannedOutput.UserInfo();

        userInfo.setId( user.getId() );
        userInfo.setUsername( user.getUsername() );
        userInfo.setFullname( user.getFullname() );

        return userInfo;
    }
}
