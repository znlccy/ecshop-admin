package com.znlccy.ecshop.utils;

import org.hibernate.HibernateException;
import org.hibernate.MappingException;
import org.hibernate.engine.spi.SessionImplementor;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.AbstractUUIDGenerator;
import org.hibernate.id.Configurable;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.type.Type;
import org.springframework.context.annotation.Configuration;

import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

/**
 * @CreateTime:2018/3/14 11:25
 * @Author:Administrator
 * @Version:v-1.0.0
 * @Comment: 主键生成工具
 */

public class KeyGeneratorUtils extends AbstractUUIDGenerator implements Configurable {

    public String k;

    /**
     * @comment: configure 集成配置类
     * @param: [type, properties, serviceRegistry]
     * @return: void
     */
    @Override
    public void configure(Type type, Properties properties, ServiceRegistry serviceRegistry) throws MappingException {
        properties.getProperty("k");
    }

    /**
     * @comment: generate 生成主键类型
     * @param: [sharedSessionContractImplementor, o]
     * @return: java.io.Serializable
     */
    @Override
    public Serializable generate(SharedSessionContractImplementor sharedSessionContractImplementor, Object o) throws HibernateException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmssSSS");
        return k+simpleDateFormat.format(new Date());
    }
}
