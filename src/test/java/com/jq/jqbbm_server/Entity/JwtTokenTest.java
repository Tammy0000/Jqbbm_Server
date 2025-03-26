package com.jq.jqbbm_server.Entity;

import com.jq.jqbbm_server.Dao.Secondary.JwtValidRepo;
import com.jq.jqbbm_server.Entity.Secondary.JwtToken;
import com.jq.jqbbm_server.Server.Security.AuthJwt;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author Tammy
 * @date 2025/3/26 上午10:21
 */
@SpringBootTest
@Slf4j
public class JwtTokenTest {
    @Autowired
    private AuthJwt authJwt;

    @Autowired
    private JwtValidRepo jwtValidRepo;

    @Test
    public void test(){
        log.info("{}", jwtValidRepo.findByToken("123"));
    }
}
