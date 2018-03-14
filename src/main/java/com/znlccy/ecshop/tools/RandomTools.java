package com.znlccy.ecshop.tools;

/**
 * @CreateTime:2018/3/14 17:29
 * @Author:Administrator
 * @Version:v-1.0.0
 * @Comment: 随机数工具
 */
public class RandomTools {

    /**
     * @comment: randomCode 生成随机6位数
     * @param: []
     * @return: java.lang.String
     */
    public static String randomCode() {
        Integer code = (int) (Math.random()*1000000);
        if (code.toString().length()<6) {
            return code+""+ (int)(Math.random()*10);
        } else {
            return code + "";
        }
    }
}
