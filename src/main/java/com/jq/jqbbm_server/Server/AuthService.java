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
}
