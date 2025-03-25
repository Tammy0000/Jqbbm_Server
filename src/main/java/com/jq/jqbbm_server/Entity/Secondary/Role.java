package com.jq.jqbbm_server.Entity.Secondary;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;
import org.springframework.data.redis.core.RedisHash;

import java.util.Date;

/**
 * @author Tammy
 * @date 2025/3/24 下午4:19
 */
@Entity
@Getter
@Setter
@Accessors(chain = true)
@Table(name = "jq_sys_role")
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 角色名称
     */
    @Column(name = "Role_Name")
    private String roleName;

    /**
     * 描述
     */
    @Column(name = "Role_Desc")
    private String roleDesc;

    /**
     * 角色Id
     */
    @Column(name = "Role_Id")
    private Integer roleId;

    /**
     * 创建时间
     */
    @Column(columnDefinition = "timestamp(0) without time zone", name = "Create_Date")
    private Date createTime;

    /**
     * 是否禁用
     */
    private Boolean isForbidden;


    /**
     * 路径
     */
    @Column(name = "Role_Path")
    private String path;

    /**
     * 更新时间
     */
    @Column(columnDefinition = "timestamp(0) without time zone", name = "Update_Date")
    private Date updateTime;

    @ManyToOne
    @JoinColumn(name = "role_id", referencedColumnName = "Role_Id")
    private User user;
}
