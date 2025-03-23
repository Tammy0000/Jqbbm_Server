package com.jq.jqbbm_server.Server;

import com.jq.jqbbm_server.Entity.Secondary.User;

/**
 * @author Tammy
 * @date 2025/3/22 下午3:27
 */
public interface UserAccess {
    /**
     * 登录
     * @param phoneNumber 用户电话号码
     * @param password 用户密码
     * @return 用户不存在返回-1<br>密码错误返回-2<br>登录成功返回0
     */
    public int login(String phoneNumber, String password);
    public boolean logout(String phoneNumber);

    /**
     * 用户注册
     * @param user 用户信息
     * @return 对象为空 -3<br>密码不能为空 -2<br>手机号码存在 -3<br>注册成功 0
     */
    public int register(User user);

    /**
     * 检查密码是否正确
     * @param phoneNumber 用户电话号码
     * @param password 用户密码
     * @return true 密码正确<br>false 密码错误
     */
    public boolean checkPassword(String phoneNumber, String password);

    /**
     * 更新密码
     * @param phoneNumber 用户电话号码
     * @param newPassword 新密码
     * @return true 更新成功<br>false 更新失败
     */
    default boolean updatePassword(String phoneNumber, String newPassword) {
        return false;
    };

    /**
     * 删除用户
     * @param phoneNumber 用户电话号码
     * @return true 删除成功<br>false 删除失败
     */
    public boolean deleteUser(String phoneNumber);

    /**
     * 检查电话号码是否存在
     * @param phoneNumber 手机号码
     * @return 存在返回true<br>不存在返回false
     */
    public boolean isPhoneNumber(String phoneNumber);
    default boolean isUsername(String username) {
        return false;
    }

    /**
     * 获取用户信息
     * @param phoneNumber 手机号码
     * @return 用户信息
     */
    default User getUser(String phoneNumber) {
        return null;
    }

    /**
     * 更新用户信息
     * @param user 用户信息
     * @return true 更新成功<br>false 更新失败
     */
    default boolean updateUser( User user) {
        return false;
    }
}
