package com.ucd.server.mapper.usermapper;

import com.ucd.server.model.usermodel.User;
import org.apache.ibatis.annotations.Param;

public interface UserExtendsMapper {

    User getUserByName(@Param("username")String username);

}
