package com.jq.jqbbm_server.Config.SaToken;

import cn.dev33.satoken.interceptor.SaInterceptor;
import cn.dev33.satoken.router.SaRouter;
import cn.dev33.satoken.stp.StpUtil;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author Tammy
 * @date 2025/3/27 下午2:07
 */
@Configuration
public class SaTokenConfigure implements WebMvcConfigurer {
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new SaInterceptor(handler -> {
            // 拦截所有请求，通过判断是否有 @SaCheckLogin 注解 决定是否需要登录
            SaRouter.notMatch("/test/**");
            SaRouter.notMatch("/user/**");
            SaRouter.match("/public/**", r -> StpUtil.checkLogin());
            SaRouter.match("/admin/**", r -> StpUtil.checkRole("admin"));
            SaRouter.match("/finance/**", r -> StpUtil.checkPermission("finance"));
        })).addPathPatterns("/**");
    }
}
