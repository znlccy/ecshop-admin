package com.znlccy.ecshop.exception;

/**
 * @CreateTime:2018/3/15 14:50
 * @Author:Administrator
 * @Version:v-1.0.
 * @Comment: 
 */
public class RequestLimitException extends Exception {

    /**
     * 序列版本号
     */
    private static final long serialVersionUID = 1364225358754654702L;

    /**
     * 默认构造方法
     */
    public RequestLimitException() {
        super("HTTP请求超出设定的限制");
    }

    /**
      * @comment: RequestLimitException 方法重写
      * @param: [message]
      * @return:
      */
    public RequestLimitException(String message) {
        super(message);
    }
}
