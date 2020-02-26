package com.example.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.redisson.Redisson;
import org.redisson.config.Config;
import org.redisson.config.SingleServerConfig;

import javax.annotation.PostConstruct;

/**
 * @Describe
 * @Author Gary
 * @Create 2019-11-14 11:53
 */
@Component
public class RedissonManager {

    @Value("${spring.redis.host}")
    private String host;

    private static final Logger logger = LoggerFactory.getLogger(RedissonManager.class);

    private static Config config = new Config();
    //声明redisso对象
    private static Redisson redisson = null;


    //获取redisson对象的方法
    public Redisson getRedisson(){
        if (redisson == null){
            synchronized (this){
                if (redisson == null){
                    SingleServerConfig singleServerConfig = config.useSingleServer();
                    singleServerConfig.setAddress("58.87.124.195:6379");
                    singleServerConfig.setPassword("123456");
                    //得到redisson对象
                    redisson = (Redisson) Redisson.create(config);
                }
            }
        }
        return redisson;
    }
}
