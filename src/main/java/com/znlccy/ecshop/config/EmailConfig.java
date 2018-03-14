package com.znlccy.ecshop.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

/**
 * @CreateTime:2018/3/14 11:36
 * @Author:Administrator
 * @Version:v-1.0.0
 * @Comment: 电子邮件配置
 */

@Configuration
public class EmailConfig {

    @Value("http://localhost:8080/user/modifyPwd")
    public String URL;

    @Value("znlccy0603@163.com")
    public String MEMMAIL;

}
