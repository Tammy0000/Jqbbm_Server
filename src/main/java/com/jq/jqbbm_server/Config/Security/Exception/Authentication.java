package com.jq.jqbbm_server.Config.Security.Exception;

import com.jq.jqbbm_server.Utils.Result;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.AuthenticationEntryPoint;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author Tammy
 * @date 2025/3/24 下午2:10
 */
@Component
@Slf4j
public class Authentication implements AuthenticationEntryPoint {
    @Override
    public void commence(HttpServletRequest request, HttpServletResponse response, AuthenticationException authException) throws IOException {
        //获取错误响应状态码
        var code = response.getStatus();
        var msg = code == 401 ? "未登录或者Token过期! by:Tammy" : code == 404 ? "路径不存在! by:Tammy" : "其他错误,请反馈! by:Tammy";

        response.setContentType("application/json;charset=UTF-8");
        response.setCharacterEncoding("UTF-8");
        PrintWriter out = response.getWriter();
        String jsonResponse = Result.code(code).setMsg(msg).toString();
        out.print(jsonResponse);
        out.flush();
    }
}
