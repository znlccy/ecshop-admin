package com.znlccy.ecshop.service;

import com.znlccy.ecshop.model.User;

import java.util.List;

/**
 * @CreateTime:2018/3/14 17:14
 * @Author:Administrator
 * @Version:v-1.0.0
 * @Comment: 用户服务接口
 */
public interface UserService {

    /**
     * @comment: userRegedit 注册用户
     * @param: [user]
     * @return: void
     */
    void addUser(User user);

    /**
     * @comment: updateUser 更新用户
     * @param: [user]
     * @return: void
     */
    void updateUser(User user);

    /**
     * @comment: deleteUser 删除用户
     * @param: [userId]
     * @return: void
     */
    void deleteUser(Long userId);

    /**
     * @comment: findByUserId 查询用户
     * @param: [userId]
     * @return: com.znlccy.ecshop.model.User
     */
    User findByUserId(Long userId);

    /**
     * @comment: findAllUser 查找所有用户
     * @param: []
     * @return: java.util.List<com.znlccy.ecshop.model.User>
     */
    List<User> findAllUser();

    /**
     * @comment: userRegedit
     * @param: [user]
     * @return: void
     */
    void userRegedit(User user);

    /**
     * @comment: userLogin
     * @param: [user]
     * @return: void
     */
    void userLogin(String userName, String userPassword);
}
