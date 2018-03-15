package com.znlccy.ecshop.annotation;

import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;

import java.lang.annotation.*;

/**
 * @CreateTime:2018/3/15 14:15
 * @Author:Administrator
 * @Version:v-1.0.0
 * @Comment: IP地址限制访问
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@Documented
@Order(Ordered.HIGHEST_PRECEDENCE)
public @interface RequestLimit {

    /**
     * 允许访问的最大次数
     */
    int count() default Integer.MAX_VALUE;

    /**
     * 时间段，单位为毫秒，默认值为一分钟
     */
    long time() default 60000;
}
