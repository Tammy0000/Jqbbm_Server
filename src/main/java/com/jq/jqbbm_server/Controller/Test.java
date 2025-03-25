package com.jq.jqbbm_server.Controller;

import com.jq.jqbbm_server.Dao.Secondary.RoleRepo;
import com.jq.jqbbm_server.Dao.Secondary.UserRepo;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Tammy
 * @date 2025/3/25 上午10:17
 */
@RestController
@Slf4j
@RequiredArgsConstructor
public class Test {
    private final RoleRepo roleRepo;

    private final UserRepo userRepo;

    @GetMapping("/test/repo")
    List<String> test(){
        return userRepo.findByRoleId(1);
    }
}
