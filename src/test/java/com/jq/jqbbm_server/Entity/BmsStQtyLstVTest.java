package com.jq.jqbbm_server.Entity;

import com.jq.jqbbm_server.Dao.Primary.BmsStQtyLstVRepo;
import com.jq.jqbbm_server.Entity.Primary.BmsStQtyLstV;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

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
        List<BmsStQtyLstV> byLotno = bmsStQtyLstVRepo.findByLotno("23080008");
        byLotno.forEach(ex -> {
            System.out.println(ex.getGoodsname());
        });
    }
}
