package com.jq.jqbbm_server.Dao.Primary;

import com.jq.jqbbm_server.Entity.Primary.GresaSaReportV;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.math.BigDecimal;
import java.util.List;

/**
 * @author Tammy
 * @date 2025/3/26 下午2:49
 * @description 零售流水决策分析
 */
public interface GresaSaReportVRepo extends JpaRepository<GresaSaReportV, Long> {

}
