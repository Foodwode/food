package com.example.demo;

import com.example.utils.DistributedRedisLock;
import com.example.utils.RedissonManager;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.redisson.Redisson;
import org.redisson.api.RBucket;
import org.redisson.api.RLock;
import org.redisson.api.RedissonClient;
import org.redisson.config.Config;
import org.redisson.config.SingleServerConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Component;
import org.springframework.test.context.junit4.SpringRunner;

import java.lang.management.ManagementFactory;
import java.lang.management.ThreadInfo;
import java.lang.management.ThreadMXBean;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

@RunWith(SpringRunner.class)
@SpringBootTest
@Component
public class DemoApplicationTests {

    @Autowired
    private DistributedRedisLock distributedRedisLock;
    @Autowired
    private RedissonManager redissonManager;

	@Test
	public void contextLoads() {
        Redisson redisson = redissonManager.getRedisson();
        
    }




}

