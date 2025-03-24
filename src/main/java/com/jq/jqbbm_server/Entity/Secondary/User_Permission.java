package com.jq.jqbbm_server.Entity.Secondary;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.time.LocalDateTime;

/**
 * @author Tammy
 * @date 2025/3/24 下午11:17
 *
 * 此表存放用户特殊权限需求，在获取用户权限时，需要将此表与用户权限表进行合并
 */
@Table(name = "jq_sys_user_permission")
@Entity
@Getter
@Setter
@Accessors(chain = true)
public class User_Permission {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 用户Id
     */
    @Column(name = "User_Id")
    private Integer userId;

    /**
     * 权限Id
     */
    @Column(name = "Permission_Id")
    private Integer permissionId;

    /**
     * 创建时间
     */
    @Column(columnDefinition = "timestamp(0) without time zone", name = "Create_Date")
    private LocalDateTime createDate;
}
