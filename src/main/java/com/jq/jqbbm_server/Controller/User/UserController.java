package com.jq.jqbbm_server.Controller.User;

import com.alibaba.fastjson2.JSONObject;
import com.jq.jqbbm_server.Config.Security.UserContext;
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

@RestController
@RequiredArgsConstructor
@Slf4j
public class UserController {

    private final BCryptPasswordEncoder bCrypt;

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
        return code == 0 ? Result.ok().setMsg(Msg) : Result.error().setMsg(Msg);
    }

    @GetMapping("/test")
    public Result test() {
        log.info(SecurityContextHolder.getContext().getAuthentication().getName());
        return Result.ok();
    }

    @PostMapping("/test/2")
    public String test2() {
        return "successful";
    }
}
