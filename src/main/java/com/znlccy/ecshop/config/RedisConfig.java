package com.znlccy.ecshop.config;

import org.hibernate.loader.custom.Return;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.jedis.JedisClientConfiguration;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;

/**
 * @CreateTime:2018/3/14 11:18
 * @Author:Administrator
 * @Version:v-1.0.0
 * @Comment: Redis配置类
 */
/*@Configuration*/
public class RedisConfig {

    /*@Bean
    JedisConnectionFactory jedisConnectionFactory() {
        return new JedisConnectionFactory();
    }

    public RedisTemplate<String,Object> redisTemplate() {
        return redisTemplate();
    }*/
}
