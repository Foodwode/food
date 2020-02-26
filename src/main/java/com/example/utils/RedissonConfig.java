//package com.example.utils;
//
//import org.redisson.Redisson;
//import org.redisson.config.Config;
//import org.redisson.config.SingleServerConfig;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.boot.context.properties.ConfigurationProperties;
//import org.springframework.context.annotation.Configuration;
//
///**
// * @Describe
// * @Author Gary
// * @Create 2019-10-18 17:03
// */
//@Configuration
//@ConfigurationProperties(prefix="redis")
//public class RedissonConfig {
//    private static final Logger logger = LoggerFactory.getLogger(RedissonConfig.class);
//    private static String host;
//    private static String port;
//    private static String password;
//    public String getHost() {
//        return host;
//    }
//    public void setHost(String host) {
//        logger.info("注入reids配置ip["+host+"]");
//        RedissonConfig.host = host;
//    }
//    public String getPort() {
//        return port;
//    }
//    public void setPort(String port) {
//        RedissonConfig.port = port;
//    }
//    public String getPassword() {
//        return password;
//    }
//    public void setPassword(String password) {
//        RedissonConfig.password = password;
//    }
//}
