package com.jq.jqbbm_server.Config.Security;

import com.jq.jqbbm_server.Config.Security.Exception.AccessDenied;
import com.jq.jqbbm_server.Config.Security.Exception.Authentication;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

/**
 * @author Tammy
 * @date 2025/3/24 上午10:05
 */
@Configuration
@Slf4j
@RequiredArgsConstructor
public class SecurityConfig {

    private final JwtRequestFilter jwtRequestFilter;

    private final Authentication authentication;

    private final AccessDenied accessDenied;

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http.csrf(AbstractHttpConfigurer::disable);
        http.
                authorizeHttpRequests(
                        //Todo 路径设置
                        authorize -> authorize
                                .requestMatchers("/login").permitAll()
                                .requestMatchers("/test/**").hasAnyAuthority("admin", "user")
                                .requestMatchers("/user").hasAnyAuthority("user")
                                .requestMatchers("/admin").hasAnyAuthority("admin")
                                //默认所有请求都拒绝
                                .anyRequest().denyAll()
                );
        http.addFilterBefore(jwtRequestFilter, UsernamePasswordAuthenticationFilter.class);
        http.exceptionHandling((exec) -> {
           exec.accessDeniedHandler(accessDenied)
                   .authenticationEntryPoint(authentication);
        });
        return http.build();
    }
}
