package com.znlccy.ecshop.utils;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * @CreateTime:2018/3/14 17:37
 * @Author:Administrator
 * @Version:v-1.0.0
 * @Comment:
 */
public class SecurityUtils {

    /**
     * @comment: md5 MD5加密
     * @param: [password]
     * @return: java.lang.String
     */
    public static String MD5(String userPassword) throws NoSuchAlgorithmException {
        MessageDigest md = MessageDigest.getInstance("MD5");
        md.update(userPassword.getBytes());
        return new BigInteger(1, md.digest()).toString(16);
    }

    /**
     * @comment: MD5 MD5加密用户名和用户密码
     * @param: [userName, userPassword]
     * @return: java.lang.String
     */
    public static String MD5(String userName, String userPassword) throws NoSuchAlgorithmException {
        MessageDigest md = MessageDigest.getInstance("MD5");
        md.update(userName.getBytes());
        md.update(userPassword.getBytes());
        return new BigInteger(1, md.digest()).toString(16);
    }
}
