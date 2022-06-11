package org.kevin.dao;


import org.apache.ibatis.annotations.Mapper;
import org.kevin.entity.User;

/**
 * @author kevin lau (双鹰)
 */
@Mapper
public interface UserMapper {

//    @Insert(" insert into kevin_test(username, age, `desc`)  values (#{username}, #{age}, #{desc})")
    Long insert(User user);

    User getById(Long id);
}
