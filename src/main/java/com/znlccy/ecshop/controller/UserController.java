package com.znlccy.ecshop.controller;

import com.znlccy.ecshop.annotation.RequestLimit;
import org.springframework.web.bind.annotation.*;

/**
 * @CreateTime:2018/3/14 17:01
 * @Author:Administrator
 * @Version:v-1.0.0
 * @Comment: 用户控制器
 */

@RestController
@RequestMapping(value = "/user")
@CrossOrigin(maxAge = 3600, origins = "*")
public class UserController {

    /**
     * @comment: userRegedit 实现用户注册接口
     * @param: []
     * @return: java.lang.String
     */
    @RequestMapping(value = "/regedit", method = RequestMethod.POST)
    @ResponseBody
    public String userRegedit() {
        return "nihap";
    }

    /**
     * @comment: userLogin 实现用户登录接口
     * @param: []
     * @return: void
     */
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    @ResponseBody
    public void userLogin() {

    }

}
