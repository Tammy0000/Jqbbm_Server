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
 * @description 零售决策分析
 */
public interface GresaSaReportVRepo extends JpaRepository<GresaSaReportV, Long> {

    /**
     * 根据门店id获取近30天日均销售额
     * @Author Tammy
     * @param id 门店id
     * @return 近30天日均销售额
     * @description 测试通过
     */
    @Query(value = "select sum(gsrv.REALMONEY) / 30 as avgs from GRESA_SA_REPORT_V gsrv where CREDATE between TRUNC(current_date) - 30 AND TRUNC(current_date) and PLACEPOINTID = ?1", nativeQuery = true)
    @Cacheable(value = "cache30", key = "'GresaSaReportVRepo-findSumRealMoneyByPlacePointId-' + #id")
    BigDecimal findSumRealMoneyByPlacePointId(Long id);

    /**
     * @param placePointId 门店id
     * @param days 天数
     * @return  指定日期的销售商品名
     * @description 根据门店id获取指定日期的销售商品名(30天销售过的商品)
     */
    @Query(nativeQuery = true, value = "select DISTINCT GOODSID from GRESA_SA_REPORT_V where PLACEPOINTID = ?1 and trunc(CREDATE) between trunc(current_date) - ?2 and trunc(current_date)")
    @Cacheable(value = "cache30", key = "'GresaSaReportVRepo-findGoodsNameByPlacePointId-' + #placePointId + '-' + #days")
    List<Long> findGoodsNameByPlacePointId(Long placePointId, int days);
}
