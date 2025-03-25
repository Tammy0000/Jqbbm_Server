package com.jq.jqbbm_server.Entity;

import com.jq.jqbbm_server.Dao.Secondary.RoleRepo;
import com.jq.jqbbm_server.Entity.Secondary.Role;
import jakarta.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cache.annotation.Cacheable;

import java.util.List;

/**
 * @author Tammy
 * @date 2025/3/25 上午9:57
 * RoleTest单元测试
 */
@SpringBootTest
public class RoleTest {
    @Resource
    RoleRepo roleRepo;

    @Test
    @Cacheable(value = "rareCache", key = "'role-path-list'")
    public void test() {
        List<Role> repo = roleRepo.findByIsForbiddenFalse();
        for (Role role : repo) {
            System.out.println(role.getPath());
        }
    }
}
