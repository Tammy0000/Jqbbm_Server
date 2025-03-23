package com.jq.jqbbm_server.Dao.Secondary;

import com.jq.jqbbm_server.Entity.Secondary.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 * @author Tammy
 * @date  2025/3/22 下午2:49
 */
public interface UserRepo extends JpaRepository<User, Integer> {

    @Override
    void deleteById(Integer Id);

    User findByPhone(String phone);

    Boolean existsByPhone(String phone);

    long deleteByPhone(String phone);
}
