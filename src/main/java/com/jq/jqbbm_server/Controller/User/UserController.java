package com.jq.jqbbm_server.Controller.User;

import com.alibaba.fastjson2.JSONObject;
import com.jq.jqbbm_server.Config.Security.UserContext;
import com.jq.jqbbm_server.Entity.Secondary.User;
import com.jq.jqbbm_server.Server.AuthService;
import com.jq.jqbbm_server.Server.UserAccess;
import com.jq.jqbbm_server.Utils.Result;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.tomcat.util.json.JSONParser;
import org.springframework.boot.autoconfigure.cache.CacheAutoConfiguration;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;

@RestController
@RequiredArgsConstructor
@Slf4j
public class UserController {

    private final UserAccess userAccess;

    private final AuthService authService;

    @PostMapping("/login")
    public Result login(@RequestBody String data) {
        JSONObject jsonObject = JSONObject.parseObject(data);
        String username = jsonObject.getString("username");
        String password = jsonObject.getString("password");
        var code = userAccess.login(username, password);
        var Msg = switch (code) {
            case -1 -> "用户名不存在!";
            case -2 -> "密码错误!";
            default -> "登录成功";
        };
        return code == 0 ? Result.ok().setMsg(Msg).set("token", authService.createToken(username)) : Result.error().setMsg(Msg);
    }

    @PostMapping("/register")
    public Result register(@RequestBody String data) {
        JSONObject jsonObject = JSONObject.parseObject(data);
        String username = jsonObject.getString("username");
        String password = jsonObject.getString("password");
        String phone = jsonObject.getString("phone");
        User user = new User()
                .setUsername(username)
                .setPassword(password)
                .setPhone(phone)
                .setCreateTime(LocalDateTime.now())
                .setIsForbidden(false)
                .setRoleId(1);
        int code = userAccess.register(user);
        String token = authService.createToken(username);
        return code == 0 ? Result.ok().setMsg("注册成功").set("token", token) : Result.error().setMsg("注册失败");
    }
}
