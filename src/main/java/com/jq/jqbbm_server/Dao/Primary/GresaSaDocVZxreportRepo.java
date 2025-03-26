package com.jq.jqbbm_server.Dao.Primary;

import com.jq.jqbbm_server.Entity.Primary.GresaSaDocVZxreport;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author Tammy
 * @date 2025/3/26 下午1:53
 */
public interface GresaSaDocVZxreportRepo extends JpaRepository<GresaSaDocVZxreport, Long> {
    List<GresaSaDocVZxreport> findByRsadtlid(Long rsadtlid);
}
