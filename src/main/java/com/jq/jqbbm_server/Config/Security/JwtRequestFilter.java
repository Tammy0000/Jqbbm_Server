package com.jq.jqbbm_server.Config.Security;

import com.jq.jqbbm_server.Server.AuthService;
import com.jq.jqbbm_server.Utils.Result;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import java.io.IOException;
import java.util.Objects;

/**
 * @author Tammy
 * @date 2025/3/22 9:02
 * 集中处理jwt请求
 */
@Component
@Slf4j
@RequiredArgsConstructor
public class JwtRequestFilter extends OncePerRequestFilter {

    private final AuthService authService;

    private final UserDetail userDetail;

    @Bean
    public BCryptPasswordEncoder bCryptPasswordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
        String header = request.getHeader("Authorization");
        if (Objects.isNull(header) || !authService.verifyToken(header)) {
            response.sendError(401, "token无效" );
            return;
        }
        String username = authService.getUsername(header);
        UserDetails user = userDetail.loadUserByUsername(username);

        log.info("用户是否禁用:{}", user.isEnabled());

        //以下是测试代码，可以删除
        if(!user.isEnabled()){
            response.setStatus(HttpServletResponse.SC_FORBIDDEN); // 设置 HTTP 状态码为 403 Forbidden
            response.setContentType("application/json"); // 设置响应类型为 JSON
            response.setCharacterEncoding("UTF-8"); // 设置字符编码为 UTF-8

            // 创建自定义的错误信息
            String jsonResponse = Result.error().setCode(403).setMsg("你的账号已禁止使用,请联系管理员!").toString();

            // 写入响应体
            response.getWriter().write(jsonResponse);
            return;
        }

        //注入到自带的SecurityContextHolder中
        UsernamePasswordAuthenticationToken authenticationToken = new UsernamePasswordAuthenticationToken(user, null, user.getAuthorities());
        SecurityContextHolder.getContext().setAuthentication(authenticationToken);

        //注入到自定义的UserContext中，在RestController中，自带的SecurityContextHolder跟自定义的UserContext是同一个，所以可以互相注入
        UserContext.setUserDetails(user);
        try {
            filterChain.doFilter(request, response);
        } finally {
            UserContext.clear();
        }
    }


    @Override
    protected boolean shouldNotFilter(HttpServletRequest request) {
        String path = request.getRequestURI();
        return path.startsWith("/login") || path.startsWith("/test");
    }
}
