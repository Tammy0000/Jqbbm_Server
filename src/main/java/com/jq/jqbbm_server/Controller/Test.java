package com.jq.jqbbm_server.Controller;

import com.jq.jqbbm_server.Dao.Primary.BmsStQtyLstVRepo;
import com.jq.jqbbm_server.Dao.Secondary.RoleRepo;
import com.jq.jqbbm_server.Dao.Secondary.UserRepo;
import com.jq.jqbbm_server.Server.Security.AuthJwt;
import com.jq.jqbbm_server.Utils.Result;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.RoundingMode;
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

    private final AuthJwt  authJwt;

    private final BmsStQtyLstVRepo bmsStQtyLstVRepo;

    @GetMapping("/login/test")
    public Result test() {
        return Result.ok().setData(authJwt.createToken("admin"));
    }

    @GetMapping("/test/kf")
    public Result test2() {
        return Result.ok().setMsg("保管账ID查询库存").setData(bmsStQtyLstVRepo.findSumByStorerid(12L).setScale(2, RoundingMode.HALF_UP));
    }
}
