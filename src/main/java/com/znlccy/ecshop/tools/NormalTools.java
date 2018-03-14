package com.znlccy.ecshop.tools;

import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @CreateTime:2018/3/14 17:22
 * @Author:Administrator
 * @Version:v-1.0.0
 * @Comment: 普通工具类
 */
public class NormalTools {

    /**
     * @comment: getFileType 获得文件类型
     * @param: [file]
     * @return: java.lang.String
     */
    public static String getFileType(String fileName) {
        if (fileName != null && fileName.indexOf(".")>=0) {
            return fileName.substring(fileName.lastIndexOf(".", fileName.length()));
        }
        return "";
    }

    /**
     * @comment: isImageFile 判断是否是图片文件
     * @param: [fileName]
     * @return: boolean
     */
    public static boolean isImageFile(String fileName) {
        String[] imgType = new String[]{".jpg",".jpeg",".png",".gif",".bmp"};
        if (fileName == null ) {
            return false;
        }
        fileName = fileName.toLowerCase();
        for (String type:imgType) {
            if (fileName.endsWith(type)) {
                return true;
            }
        }
        return false;
    }

    /**
     * @comment: currentDate 获取当前日期格式
     * @param: [pattern]
     * @return: java.lang.String
     */
    public static String currentDate(String pattern) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        return simpleDateFormat.format(new Date());
    }

    /**
     * @comment: currentDate 返回当前日期
     * @param: []
     * @return: java.lang.String
     */
    public static String currentDate() {
        return currentDate("yyyy-MM-dd HH:mm:ss");
    }
}
