package com.jq.jqbbm_server.Config.Security.Exception;

import com.jq.jqbbm_server.Utils.Result;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.web.access.AccessDeniedHandler;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author Tammy
 * @date 2025/3/24 下午2:08
 */
@Component
@Slf4j
public class AccessDenied implements AccessDeniedHandler {
    @Override
    public void handle(HttpServletRequest request, HttpServletResponse response, org.springframework.security.access.AccessDeniedException accessDeniedException) throws IOException {

        log.info(String.valueOf(response.getStatus()));

        response.setContentType("application/json;charset=UTF-8");
        response.setCharacterEncoding("UTF-8");
        PrintWriter out = response.getWriter();
        String jsonResponse = Result.code(403).setMsg("权限不足,无法访问!").toString();
        out.print(jsonResponse);
        out.flush();
    }
}
