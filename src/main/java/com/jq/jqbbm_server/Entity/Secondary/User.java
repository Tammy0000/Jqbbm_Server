package com.jq.jqbbm_server.Entity.Secondary;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.time.LocalDateTime;

@Table(name = "jq_sys_user")
@Entity
@Getter
@Setter
//链式调用
@Accessors(chain = true)
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 用户名
     */
    private String username;

    /**
     * 密码
     */
    private String password;

    /**
     * 部门
     */
    private String dept;

    /**
     * 电话
     */
    private String phone;

    /**
     * 店铺
     */
    private Integer StoreId;

    /**
     * 所在区域
     */
    private String area;

    /**
     * 创建时间
     */
    @Column(columnDefinition = "timestamp(0) without time zone")
    private LocalDateTime createTime;

    /**
     * 是否禁止登录
     */
    private Boolean isForbidden;
}
