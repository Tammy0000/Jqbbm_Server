package com.jq.jqbbm_server.Entity.Secondary;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.time.LocalDateTime;

/**
 * @author Tammy
 * @date 2025/3/24 下午10:46
 */
@Entity
@Getter
@Setter
@Table(name = "jq_sys_role_permission")
@Accessors(chain = true)
public class Role_Permission {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 角色Id
     */
    @Column(name = "Role_Id")
    private String roleId;

    /**
     * 权限Id
     */
    @Column(name = "Permission_Id")
    private String permissionId;

    /**
     * 创建时间
     */
    @Column(columnDefinition = "timestamp(0) without time zone", name = "Create_Date")
    private LocalDateTime createTime;
}
