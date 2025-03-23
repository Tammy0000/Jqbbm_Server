package com.jq.jqbbm_server.Server.User;

import com.jq.jqbbm_server.Config.Redis.Redis;
import com.jq.jqbbm_server.Dao.Secondary.UserRepo;
import com.jq.jqbbm_server.Entity.Secondary.User;
import com.jq.jqbbm_server.Server.UserAccess;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Objects;

/**
 * @author Tammy
 * @date 2025/3/22 下午3:26
 */
@Service
@Slf4j
@RequiredArgsConstructor
public class UserAccessService implements UserAccess {

    private final UserRepo userRepo;

    private final BCryptPasswordEncoder bCryptPasswordEncoder;

    private final Redis redis;

    @Override
    public int login(String phoneNumber, String password) {
        //Todo 需要做一个恶意登录的拦截用Redis判断该用户在尝试一定次数后锁定。等待Redis过期失效，方可再次登录
        User user = getUser(phoneNumber);
        if (Objects.isNull(phoneNumber)) return -1;
        if (!bCryptPasswordEncoder.matches(password, user.getPassword())) return -2;
        return 0;
    }

    @Override
    public boolean logout(String phoneNumber) {
        //Todo 登出的一些操作，看需要
        return false;
    }

    @Override
    public int register(User user) {
        //User对象不能为空
        if (Objects.isNull(user)) return -1;
        //密码不能为空，严格来说前端需要判断。
        if (Objects.isNull(user.getPassword())) return -2;
        //Todo 注册的时候需要判断一些必填项，后续补上
        //判断手机号码是否已经存在
        if (isPhoneNumber(user.getPhone())) return -3;
        try {
            userRepo.save(user);
            return 0;
        } catch (Exception e) {
            log.error("注册失败，错误信息：数据库错误!");
            return -4;
        }
    }

    @Override
    public boolean updateUser(User user) {
        User user1 = getUser(user.getPhone());
        if (Objects.isNull(user1)) return false;
        user.setId(user1.getId());
        userRepo.save(user);
        return true;
    }

    @Override
    public boolean checkPassword(String phoneNumber, String password) {
        User user = getUser(phoneNumber);
        if (Objects.isNull(user)) return false;
        return bCryptPasswordEncoder.matches(password, user.getPassword());
    }

    @Override
    public boolean updatePassword(String phoneNumber, String newPassword) {
        User user = getUser(phoneNumber);
        if (Objects.isNull(user)) return false;
        user.setPassword(bCryptPasswordEncoder.encode(newPassword));
        userRepo.save(user);
        return false;
    }

    @Override
    public boolean deleteUser(String phoneNumber) {
        if (!isPhoneNumber(phoneNumber)) return false;
        userRepo.deleteByPhone(phoneNumber);
        return true;
    }

    @Override
    public boolean isPhoneNumber(String phoneNumber) {
        return userRepo.existsByPhone(phoneNumber);
    }

    @Override
    public User getUser(String phoneNumber) {
       return userRepo.findByPhone(phoneNumber);
    }
}
