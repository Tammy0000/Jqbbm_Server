package com.jq.jqbbm_server.Controller.User;

import cn.dev33.satoken.stp.StpUtil;
import com.alibaba.fastjson2.JSONObject;
import com.jq.jqbbm_server.Entity.Secondary.User;
import com.jq.jqbbm_server.Server.AuthService;
import com.jq.jqbbm_server.Server.UserAccess;
import com.jq.jqbbm_server.Utils.Result;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.Date;

@RestController
@RequiredArgsConstructor
@Slf4j
public class UserController {

    private final UserAccess userAccess;

    private final BCryptPasswordEncoder bCryptPasswordEncoder;

    @PostMapping("/user/login")
    public Result login(@RequestBody String data) {
        JSONObject jsonObject = JSONObject.parseObject(data);
        String phoneNumber = jsonObject.getString("phoneNumber");
        String password = jsonObject.getString("password");
        var code = userAccess.login(phoneNumber, password);
        var Msg = switch (code) {
            case -1 -> "用户名不存在!";
            case -2 -> "密码错误!";
            default -> "登录成功";
        };
        if (code == 0) StpUtil.login(phoneNumber);
        return code == 0 ? Result.ok().setMsg(Msg).set("token", StpUtil.getLoginId(phoneNumber)) : Result.error().setMsg(Msg);
    }

    @PostMapping("/user/register")
    public Result register(@RequestBody String data) {
        JSONObject jsonObject = JSONObject.parseObject(data);
        String username = jsonObject.getString("username");
        String password = jsonObject.getString("password");
        String phone = jsonObject.getString("phoneNumber");
        log.info("用户注册，手机号码：{}", phone);
        User user = new User()
                .setUsername(username)
                .setPassword(bCryptPasswordEncoder.encode(password))
                .setPhone(phone)
                .setCreateTime(new Date())
                .setIsForbidden(false)
                .setRoleId(1);
        int code = userAccess.register(user);
        StpUtil.login(username);
        String token = StpUtil.getTokenValue();
        var msg = switch (code) {
            case -2 -> "密码不能为空";
            case -1 -> "请填写完整信息";
            case -3 -> "手机号码已存在";
            case -4 -> "数据库错误";
            default -> "注册成功!";
        };
        return code == 0 ? Result.ok().setMsg(msg).set("token", token) : Result.error().setMsg(msg);
    }
}
