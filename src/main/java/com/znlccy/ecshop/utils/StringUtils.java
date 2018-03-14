package com.znlccy.ecshop.utils;

/**
 * @CreateTime:2018/3/14 17:43
 * @Author:Administrator
 * @Version:v-1.0.0
 * @Comment: 字符串工具
 */
public class StringUtils {

    /**
     * @comment: isEmpty 判断字符长是否为空
     * @param: [str]
     * @return: boolean
     */
    public static boolean isEmpty(String str) {
        if (str != null && str.trim().length() != 0) {
            return true;
        }
        return false;
    }

}
