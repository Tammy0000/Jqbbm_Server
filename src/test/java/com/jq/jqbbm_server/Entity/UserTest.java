package com.jq.jqbbm_server.Entity;

import com.jq.jqbbm_server.Dao.Secondary.UserRepo;
import jakarta.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author Tammy
 * @date 2025/3/22 下午3:03
 */
@SpringBootTest
public class UserTest {

    @Resource
    UserRepo userRepo;

    @Test
    public void test() {
    }
}
