package com.jq.jqbbm_server.Dao.Secondary;

import com.jq.jqbbm_server.Entity.Secondary.Role;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author Tammy
 * @date 2025/3/25 上午9:57
 */
public interface RoleRepo extends JpaRepository<Role,Integer> {

    @Cacheable(value = "commonCache", key = "'rolePath_list_false'")
    List<Role> findByIsForbiddenFalse();

    List<Role> findByIsForbiddenAndRoleId(Boolean isForbidden, Integer roleId);

    Role findByIsForbidden(Boolean isForbidden);
}
