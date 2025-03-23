package com.jq.jqbbm_server.Controller.User;

import cn.dev33.satoken.util.SaResult;
import com.alibaba.fastjson2.JSONObject;
import com.jq.jqbbm_server.Entity.Secondary.User;
import com.jq.jqbbm_server.Server.UserAccess;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;

@RestController
@RequiredArgsConstructor
@Slf4j
public class UserController {

    private final BCryptPasswordEncoder bCrypt;

    private final UserAccess userAccess;

    @GetMapping("/test")
    SaResult test(@RequestParam String pwd){
        return SaResult.ok().setData(bCrypt.encode(pwd));
    }

    @PostMapping("/register")
    SaResult register(@RequestBody String body){
        JSONObject json = JSONObject.parseObject(body);
        String password = json.getString("password");
        String username = json.getString("username");
        String phone = json.getString("phone");
        User user = new User()
                .setPhone(phone)
                .setUsername(username)
                .setPassword(bCrypt.encode(password))
                .setCreateTime(LocalDateTime.now())
                .setIsForbidden(false)
                .setDept("IT部");
        return SaResult.ok().setData(userAccess.register(user) == 0 ? "successful" : "fail");
    }
}
