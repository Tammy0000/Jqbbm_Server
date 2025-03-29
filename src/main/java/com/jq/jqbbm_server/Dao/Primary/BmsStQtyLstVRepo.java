package com.jq.jqbbm_server.Dao.Primary;

import com.jq.jqbbm_server.Entity.Primary.BmsStQtyLstV;
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
    /**
     * 获取门店库存金额
     * @param storerid 门店id
      * @return 门店库存金额
     */
    @Cacheable(value = "cache30", key = "'BmsStQtyLstVRepo-findSumByStorerid-' + #storerid")
    @Query("select sum(b.batchmoney) from BmsStQtyLstV b where b.storageid = ?1")
    BigDecimal findSumByStorerid(Long storerid);

    /**
     * 获取门店库存品规数
     * @param storerid 门店id
     * @return 门店库存数量
     */
    @Cacheable(value = "cache30", key = "'BmsStQtyLstVRepo-findSumGoodsidByStorerid-' + #storerid")
    @Query("select count(distinct b.goodsid) from BmsStQtyLstV b where b.storageid = ?1")
    int findSumGoodsidByStorerid(Long storerid);

    /**
     * 获取门店库存品规ID
     * @param storerid 门店id
     * @return 门店库存品规
     */
    @Query("select distinct b.goodsid from BmsStQtyLstV b where b.storageid = ?1")
    @Cacheable(value = "cache30", key = "'BmsStQtyLstVRepo-findGoodsidByGoodsid-' + #storerid")
    List<Long> findByGoodsid(Long storerid);
}
