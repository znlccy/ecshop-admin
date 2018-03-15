package com.znlccy.ecshop.controller;

import com.znlccy.ecshop.config.EmailConfig;
import com.znlccy.ecshop.service.UserService;
import com.znlccy.ecshop.tools.RandomTools;
import com.znlccy.ecshop.utils.SendEmailUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

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

    /**
     * 自动依赖注入userService
     */
    /*@Autowired
    private UserService userService;*/

    /**
     * 自动依赖注入sendEmailUtils
     */
    @Autowired
    private SendEmailUtils sendEmailUtils;

    /**
     * 自动依赖注入emailConfig
     */
    @Autowired
    private EmailConfig emailConfig;

    /**
     * @comment: sendCode 发送验证码
     * @param: [email, request]
     * @return: void
     */
    @RequestMapping(value = "/send", method = RequestMethod.POST)
    @ResponseBody
    public String sendCode(@RequestParam(value = "email",defaultValue = "", required = true) String email, HttpServletRequest request) {
        try {
            String code = RandomTools.randomCode();
            request.getSession().setAttribute("registerCode", code);
            sendEmailUtils.sendRegisterCode(email, code);
        } catch (Exception e) {
            e.printStackTrace();
            return "0";
        }
        return "1";
    }

}
