package com.jq.jqbbm_server.Dao.Secondary;

import com.jq.jqbbm_server.Entity.Secondary.User;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * @author Tammy
 * @date  2025/3/22 下午2:49
 */
public interface UserRepo extends JpaRepository<User, Integer> {

    @Cacheable(value = "cache30", key = "'user-view-' + #phone")
    User findByPhone(String phone);

    @Cacheable(value = "cache30", key = "'user-exit-' + #phone")
    Boolean existsByPhone(String phone);

    @CacheEvict(value = "cache30", key = "'user-view-' + #phone")
    void deleteByPhone(String phone);

    @Query(value ="select role_path from jq_sys_user, jq_sys_role where jq_sys_user.role_id = ?1", nativeQuery = true)
    @Cacheable(value = "cache30", key = "'role-pathList-' + #roleId")
    List<String> findByRoleId(Integer roleId);
}
