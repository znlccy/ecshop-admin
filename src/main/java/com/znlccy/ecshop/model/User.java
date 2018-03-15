package com.znlccy.ecshop.model;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.io.Serializable;
import java.sql.Timestamp;

/**
 * @CreateTime:2018/3/14 11:06
 * @Author:Administrator
 * @Version:v-1.0.0
 * @Comment: 用户实体类
 */

@Entity
@Table(name = "tb_user", catalog = "db_ecshop")
public class User implements Serializable {

    @Id
    @GenericGenerator(name = "userId", strategy = "com.znlccy.ecshop.utils.KeyGeneratorUtils", parameters = {@Parameter(name = "k", value = "M")})
    @GeneratedValue(generator = "userId")
    private Long userId;

    @NotBlank
    @Column(name = "userName")
    private String userName;

    @NotBlank
    @Column(name = "userPassword")
    private String userPassword;

    @Column(name = "userEmail")
    private String userEmail;

    @Column(name = "loginTime")
    private Timestamp loginTime;

    @Column(name = "loginStatus")
    private boolean loginStatus;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public Timestamp getLoginTime() {
        return loginTime;
    }

    public void setLoginTime(Timestamp loginTime) {
        this.loginTime = loginTime;
    }

    public boolean isLoginStatus() {
        return loginStatus;
    }

    public void setLoginStatus(boolean loginStatus) {
        this.loginStatus = loginStatus;
    }
}
