package com.jq.jqbbm_server.Server;

public interface AuthService {
    /**
     * 创建token
     * @param username 需要创建token的用户名
     * @return token
     */
    public String createToken(String username);

    /**
     * 验证token
     * @param token 需要验证的token
     * @return true or false
     */
    public boolean verifyToken(String token);

    /**
     * 获取用户名
     * @param token 需要获取用户名的token
     * @return 用户名
     */
    public String getUsername(String token);

    /**
     * 获取解码后的token
     * @param token 需要获取解码后的token
     * @return 解码后的token
     */
    public Object getDecodeToken(String token);

    /**
     * 判断token是否在黑名单 <br> 这个方法主要是匹配该token是否在数据库中存在 <br> 如果存在则该token无效 <br> 如果不存在则该token有效
     * @param token 需要判断的token
     * @return true or false
     */
    default boolean isTokenValid(String token) {
        return false;
    }

    /**
     * 保存需要被封禁token到数据库
     * @param token 需要被封禁的token
     */
    default void saveTokenToDb(String token) {}

    /**
     * 删除数据库中保存的token
     * @param token 需要被删除的token
     */
    default void removeTokenFromDb(String token) {}
}
