package com.jq.jqbbm_server.Dao.Primary;

import com.jq.jqbbm_server.Entity.Primary.GpcsPlacepointV;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * @author Tammy
 * @date 2025/3/29 下午2:30
 * @description 零售门店表
 */
public interface GpcsPlacepointVRepo extends JpaRepository<GpcsPlacepointV, Long> {

    /**
     * @param placepointid 门店id
     * @return 实体类
     * @author Tammy
     * @description 根据placepointid查询
     */
    @Query("select g from GpcsPlacepointV g where g.placepointid = ?1")
    @Cacheable(value = "cache30", key = "'GpcsPlacepointVRepo-findByPlacepointid-' + #placepointid")
    GpcsPlacepointV findByPlacepointid(Long placepointid);

    /**
     * @param storageid 保管账id
     * @return 实体类
     * @author Tammy
     * @description 根据storageid查询
     */
    @Cacheable(value = "cache30", key = "'GpcsPlacepointVRepo-findByStorageid-' + #storageid")
    @Query("select g from GpcsPlacepointV g where g.storageid = ?1")
    GpcsPlacepointV findByStorageid(Long storageid);

    /**
     * @param placepointname 门店关键字
     * @return 实体类
     * @author Tammy
     * @description 根据门店名模糊搜索
     */
    @Query("select g from GpcsPlacepointV g where g.placepointname like %?1%")
    @Cacheable(value = "cache30", key = "'GpcsPlacepointVRepo-findByPlacepointname-' + #placepointname")
    List<GpcsPlacepointV> findByPlacepointname(String placepointname);

    /**
     * @return 实体类
     * @author Tammy
     * @description 查询所有门店的门店ID，保管账ID，门店名
     */
    @Query("select g.placepointid, g.storageid, g.placepointname from GpcsPlacepointV g")
    @Cacheable(value = "cache30", key = "'GpcsPlacepointVRepo-findAllPlacepointidStorageidPlacepointname'")
    List<Object[]> findAllPlacepointidStorageidPlacepointname();
}
