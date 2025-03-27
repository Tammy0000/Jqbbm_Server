package com.jq.jqbbm_server.Entity.Secondary;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;
import org.springframework.data.redis.core.RedisHash;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

@Table(name = "jq_sys_user")
@Entity
@Getter
@Setter
//链式调用
@Accessors(chain = true)
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 用户名
     */
    @Column(name = "UserName")
    private String username;

    /**
     * 密码
     */
    @Column(name = "Password")
    private String password;

    /**
     * 岗位
     */
    @Column(name = "Post")
    private String post;

    /**
     * 电话
     */
    @Column(name = "Phone")
    private String phone;

    /**
     * 店铺
     */
    @Column(name = "Store_Id")
    private Integer StoreId;

    /**
     * 所在区域
     */
    @Column(name = "Area")
    private String area;

    /**
     * 创建时间
     */
    @Column(columnDefinition = "timestamp(0) without time zone", name = "Create_Date")
    private Date createTime;

    /**
     * 是否禁止登录
     */
    private Boolean isForbidden;

    /**
     * 角色ID
     */
    @Column(name = "Role_Id", unique = true)
    private Integer roleId;

    /**
     * 用户ID
     */
    @Column(name = "User_Id")
    private Integer userId;

    @OneToMany(mappedBy = "user", fetch = FetchType.EAGER)
    private List<Role> roles;
}
