package com.znlccy.ecshop.controller;

import org.springframework.web.bind.annotation.*;

/**
 * @CreateTime:2018/3/15 11:42
 * @Author:Administrator
 * @Version:v-1.0.0
 * @Comment: 邮件控制器
 */
@RestController
@RequestMapping(value = "/email")
@CrossOrigin(maxAge = 3600, origins = "*")
public class EmailController {

    @RequestMapping(value = "/send", method = RequestMethod.POST)
    @ResponseBody
    public void sendEmail() {

    }

}
