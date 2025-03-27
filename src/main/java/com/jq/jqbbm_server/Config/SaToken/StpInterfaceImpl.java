package com.jq.jqbbm_server.Config.SaToken;

import cn.dev33.satoken.stp.StpInterface;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author Tammy
 * @date 2025/3/27 下午2:02
 * @description 自定义鉴权接口加载
 */
@Component
@Slf4j
@RequiredArgsConstructor
public class StpInterfaceImpl implements StpInterface {

    /**
     * 权限列表
     * @param o
     * @param s 用户名
     * @return 权限集
     */
    @Override
    public List<String> getPermissionList(Object o, String s) {
        log.info("getPermissionList");
        return List.of();
    }

    /**
     * 角色列表
     * @param o
     * @param s 用户名
     * @return 权限集
     */
    @Override
    public List<String> getRoleList(Object o, String s) {
        log.info("getRoleList");
        return List.of("admin");
    }
}
