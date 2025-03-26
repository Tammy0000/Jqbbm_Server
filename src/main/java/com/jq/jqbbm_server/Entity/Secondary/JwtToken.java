package com.jq.jqbbm_server.Entity.Secondary;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.time.LocalDateTime;

/**
 * @author Tammy
 * @date 2025/3/26 上午9:56
 * <p>
 * 用于获取被禁止使用的token
 * 在服务层使用的时候，每次调用都尽可能检测失效日期，然后删除，已经过期的 token
 */
@Table(name = "jq_sys_jwt_token")
@Getter
@Setter
@Entity
@Accessors(chain = true)
public class JwtToken {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "Token")
    private String token;

    @Column(name = "Create_Time", columnDefinition = "timestamp(0) without time zone")
    private LocalDateTime createTime;
}
