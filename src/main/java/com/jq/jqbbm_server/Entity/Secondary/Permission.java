package com.jq.jqbbm_server.Entity.Secondary;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.time.LocalDateTime;

/**
 * @author Tammy
 * @date 2025/3/24 下午4:26
 */
@Table(name = "jp_sys_permission")
@Entity
@Getter
@Setter
@Accessors(chain = true)
public class Permission {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 权限名称
     */
    @Column(name = "Permission_Name")
    private String permissionName;

    /**
     * 描述
     */
    @Column(name = "Permission_Desc")
    private String permissionDesc;

    /**
     * 创建时间
     */
    @Column(columnDefinition = "timestamp(0) without time zone" , name = "Create_Date")
    private LocalDateTime createTime;

    /**
     * 修改时间
     */
    @Column(columnDefinition = "timestamp(0) without time zone" , name = "Update_Date")
    private LocalDateTime updateTime;

    /**
     * 路径
     * 路径规则: <br>
     * /test/view/** <br>
     * /test/edit/** <br>
     * /test/add/** <br>
     * /test/delete/** <br>
     */
    @Column(name = "Permission_Path")
    private String path;

    /**
     * 创建人
     */
    @Column(name = "Create_By")
    private String createBy;

    /**
     * 权限Id
     */
    @Column(name = "Permission_Id")
    private Integer permissionId;
}
