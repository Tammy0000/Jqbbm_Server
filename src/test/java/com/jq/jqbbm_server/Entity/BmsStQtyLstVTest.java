package com.jq.jqbbm_server.Entity;

import com.jq.jqbbm_server.Dao.Primary.BmsStQtyLstVRepo;
import com.jq.jqbbm_server.Dao.Primary.GresaSaReportVRepo;
import com.jq.jqbbm_server.Entity.Primary.BmsStQtyLstV;
import com.jq.jqbbm_server.Utils.ListComparison;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;

/**
 * @author Tammy
 * @date 2025/3/26 下午2:59
 */
@SpringBootTest
public class BmsStQtyLstVTest {
    @Autowired
    BmsStQtyLstVRepo bmsStQtyLstVRepo;

    @Autowired
    GresaSaReportVRepo gresaSaReportVRepo;

    @Test
    public void test() {
//        List<Long> byGoodsid = bmsStQtyLstVRepo.findByGoodsid(3L);
        List<Long> pointId = gresaSaReportVRepo.findGoodsNameByPlacePointId(43L, 30);
//        List<Long> differentElements = ListComparison.getDifferentElements(byGoodsid, pointId);
        System.out.println(pointId.size());
    }
}
