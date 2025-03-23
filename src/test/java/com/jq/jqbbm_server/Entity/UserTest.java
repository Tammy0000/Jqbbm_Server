package com.jq.jqbbm_server.Entity;

import com.jq.jqbbm_server.Dao.Secondary.UserRepo;
import com.jq.jqbbm_server.Entity.Secondary.User;
import jakarta.annotation.Resource;
import lombok.RequiredArgsConstructor;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.time.LocalDateTime;

/**
 * @author Tammy
 * @date 2025/3/22 下午3:03
 */
@SpringBootTest
public class UserTest {

    @Resource
    UserRepo userRepo;

    @Resource
    BCryptPasswordEncoder bCryptPasswordEncoder;

    @Test
    public void test() {
    }
}
