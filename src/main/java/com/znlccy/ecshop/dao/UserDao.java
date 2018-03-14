package com.znlccy.ecshop.dao;

import com.znlccy.ecshop.model.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @CreateTime:2018/3/14 10:07
 * @Author:Administrator
 * @Version:v-1.0.
 * @Comment: 用户数据库操作类
 */

@Mapper
public interface UserDao {

    /**
     * @comment: addUser
     * @param: [user]
     * @return: void
     */
    @Insert("")
    void addUser(User user);

    /**
     * @comment: updateUser
     * @param: [user]
     * @return: void
     */
    @Update("")
    void updateUser(User user);

    /**
     * @comment: deleteUser
     * @param: [userId]
     * @return: void
     */
    @Delete("")
    void deleteUser(Long userId);

    /**
     * @comment: findByUserId
     * @param: [userId]
     * @return: com.znlccy.ecshop.model.User
     */
    @Select("")
    User findByUserId(Long userId);

    /**
     * @comment: findAllUser
     * @param: []
     * @return: java.util.List<com.znlccy.ecshop.model.User>
     */
    @Select("select * from tb_user")
    List<User> findAllUser();
}
