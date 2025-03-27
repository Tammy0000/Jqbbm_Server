package com.jq.jqbbm_server.Controller;

import com.jq.jqbbm_server.Dao.Primary.BmsStQtyLstVRepo;
import com.jq.jqbbm_server.Utils.Result;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * @author Tammy
 * @date 2025/3/27 上午11:00
 */
@RestController
@Slf4j
@RequiredArgsConstructor
public class ProductManagementController {

    private final BmsStQtyLstVRepo bmsStQtyLstVRepo;

    @GetMapping("/test/store/view/getBmsStQtyLstVBatchMoney/{id}")
    Result getBmsStQtyLstVBatchMoney(@PathVariable int id) {
        BigDecimal batchMoney = bmsStQtyLstVRepo.findSumByStorerid((long) id).setScale(2, RoundingMode.HALF_UP);
        return Result.ok().setMsg("获取门店库存金额").setData(batchMoney);
    }
}
