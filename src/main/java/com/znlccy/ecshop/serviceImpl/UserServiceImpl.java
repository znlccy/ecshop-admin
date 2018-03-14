package com.znlccy.ecshop.serviceImpl;

import com.znlccy.ecshop.dao.UserDao;
import com.znlccy.ecshop.model.User;
import com.znlccy.ecshop.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @CreateTime:2018/3/14 17:14
 * @Author:Administrator
 * @Version:v-1.0.0
 * @Comment: 用户服务接口实现类
 */
public class UserServiceImpl implements UserService {

    /**
     * 声明UserDao的自动依赖注入
     */
    @Autowired
    private UserDao userDao;

    /**
     * @comment: addUser 添加用户
     * @param: [user]
     * @return: void
     */
    @Override
    public void addUser(User user) {

    }

    /**
     * @comment: updateUser
     * @param: [user]
     * @return: void
     */
    @Override
    public void updateUser(User user) {

    }

    /**
     * @comment: deleteUser
     * @param: [userId]
     * @return: void
     */
    @Override
    public void deleteUser(Long userId) {

    }

    /**
     * @comment: findByUserId
     * @param: [userId]
     * @return: com.znlccy.ecshop.model.User
     */
    @Override
    public User findByUserId(Long userId) {
        return null;
    }

    /**
     * @comment: findAllUser
     * @param: []
     * @return: java.util.List<com.znlccy.ecshop.model.User>
     */
    @Override
    public List<User> findAllUser() {
        return null;
    }

    /**
     * @comment: userRegedit
     * @param: [user]
     * @return: void
     */
    @Override
    public void userRegedit(User user) {

    }

    /**
     * @comment: userLogin
     * @param: [userName, userPassword]
     * @return: void
     */
    @Override
    public void userLogin(String userName, String userPassword) {

    }
}
