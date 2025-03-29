package com.jq.jqbbm_server.Dao.Primary;

import com.jq.jqbbm_server.Entity.Primary.PubGoodsV;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * @author Tammy
 * @date 2025/3/29 下午3:48
 * @description 公共商品表持久接口
 */
public interface PubGoodsVRepo extends JpaRepository<PubGoodsV, Long> {

    /**
     * @description 根据商品id查询
     * @param goodsid 商品id
     * @return 实体类
     */
    @Query("select g from PubGoodsV g where g.goodsid = ?1")
    @Cacheable(value = "cache30", key = "'PubGoodsVRepo-findByGoodsid-' + #goodsid")
    PubGoodsV findByGoodsid(Long goodsid);

    /**
     * @description 根据商品名模糊查询
     * @param goodsname 商品名
     * @return 实体类
     */
    @Query("select g from PubGoodsV g where g.goodsname like %?1%")
    @Cacheable(value = "cache30", key = "'PubGoodsVRepo-findByGoodsname-' + #goodsname")
    List<PubGoodsV> findByGoodsname(String goodsname);
}
