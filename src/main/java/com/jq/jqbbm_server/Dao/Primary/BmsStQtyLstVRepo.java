package com.jq.jqbbm_server.Dao.Primary;

import com.jq.jqbbm_server.Entity.Primary.BmsStQtyLstV;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author Tammy
 * @date 2025/3/26 下午2:58
 */
public interface BmsStQtyLstVRepo extends JpaRepository<BmsStQtyLstV, Long> {
    List<BmsStQtyLstV> findByLotno(String lotno);
}
