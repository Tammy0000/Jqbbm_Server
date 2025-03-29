package com.jq.jqbbm_server.Entity;

import com.jq.jqbbm_server.Dao.Primary.PubGoodsVRepo;
import com.jq.jqbbm_server.Entity.Primary.PubGoodsV;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

/**
 * @description 测试实体类
 * @author Tammy
 * @date 2025/3/29 下午3:59
 */
@SpringBootTest
public class EntityTest {
    @Autowired
    PubGoodsVRepo pubGoodsVRepo;

    @Test
    public void test(){
        List<PubGoodsV> goodsname = pubGoodsVRepo.findByGoodsname("维他奶");
        goodsname.forEach(e -> {
            System.out.println(e.getGoodsname());
        });
    }
}
