package com.jq.jqbbm_server.Dao.Secondary;

import com.jq.jqbbm_server.Entity.Secondary.JwtToken;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Tammy
 * @date 2025/3/26 上午10:05
 */
public interface JwtValidRepo extends JpaRepository<JwtToken, Long> {
    boolean existsByToken(String token);

    long deleteByToken(String token);

    JwtToken findByToken(String token);
}
