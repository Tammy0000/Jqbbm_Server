package com.jq.jqbbm_server.Dao;

import com.jq.jqbbm_server.Config.Redis.Redis;
import jakarta.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author Tammy
 * @date 2025/3/25 上午9:48
 *
 * 用于测试redis单元测试
 */
@SpringBootTest
public class RedisTest {
    @Autowired
    Redis redis;

    @Test
    public void test() {
        redis.set("hello", "world");
    }
}
