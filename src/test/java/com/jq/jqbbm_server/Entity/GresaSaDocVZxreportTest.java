package com.jq.jqbbm_server.Entity;

import com.jq.jqbbm_server.Dao.Primary.GresaSaDocVZxreportRepo;
import com.jq.jqbbm_server.Entity.Primary.GresaSaDocVZxreport;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

/**
 * @author Tammy
 * @date 2025/3/26 下午1:55
 */
@SpringBootTest
@Slf4j
public class GresaSaDocVZxreportTest {
    @Autowired
    GresaSaDocVZxreportRepo gresaSaDocVZxreportRepo;

    @Test
    public void test(){
        List<GresaSaDocVZxreport> byRsadtlid = gresaSaDocVZxreportRepo.findByRsadtlid(15370948L);
        log.info(byRsadtlid.getFirst().getGoodsname());
    }
}
