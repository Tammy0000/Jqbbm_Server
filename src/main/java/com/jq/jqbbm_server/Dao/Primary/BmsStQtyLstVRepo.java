package com.jq.jqbbm_server.Dao.Primary;

import com.jq.jqbbm_server.Entity.Primary.BmsStQtyLstV;
import com.jq.jqbbm_server.Server.RoundDecimal;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.math.BigDecimal;
import java.util.List;

/**
 * @author Tammy
 * @date 2025/3/26 下午2:58
 */
public interface BmsStQtyLstVRepo extends JpaRepository<BmsStQtyLstV, Long> {
    List<BmsStQtyLstV> findByLotno(String lotno);

    @Cacheable(value = "cache30", key = "'BmsStQtyLstVRepo-findSumByStorerid-' + #storerid")
    @Query("select sum(b.batchmoney) from BmsStQtyLstV b where b.storageid = ?1")
    BigDecimal findSumByStorerid(Long storerid);
}
