package com.jq.jqbbm_server.Entity;

import com.jq.jqbbm_server.Dao.Primary.BmsStQtyLstVRepo;
import com.jq.jqbbm_server.Entity.Primary.BmsStQtyLstV;
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

    @Test
    public void test() {
        System.out.println(bmsStQtyLstVRepo.findSumByStorerid(12L).setScale(2, RoundingMode.HALF_UP));
    }
}
