package com.jq.jqbbm_server.Entity.Primary;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Immutable;

import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * Mapping for DB view
 * @author Tammy
 * @Date 2025年3月26日13:49:37
 */
@Getter
@Setter
@Entity
//只读注解，以避免修改数据，提高性能
@Immutable
@Table(name = "GRESA_SA_DOC_V_ZXREPORT")
public class GresaSaDocVZxreport {
    @Id
    @Column(name = "RSAID", nullable = false)
    private Long rsaid;

    @Column(name = "USEDAY")
    private LocalDate useday;

    @Column(name = "CREDATE")
    private LocalDate credate;

    @Column(name = "CASHIERNAME", length = 40)
    private String cashiername;

    @Column(name = "RECEIVALMONEY", precision = 12, scale = 2)
    private BigDecimal receivalmoney;

    @Column(name = "REALMONEY", precision = 12, scale = 2)
    private BigDecimal realmoney;

    @Column(name = "USESTATUS")
    private Integer usestatus;

    @Column(name = "MANUALPREMONEY", precision = 12, scale = 2)
    private BigDecimal manualpremoney;

    @Column(name = "MANUALMONEY", precision = 12, scale = 2)
    private BigDecimal manualmoney;

    @Column(name = "MANUALRATE", precision = 16, scale = 6)
    private BigDecimal manualrate;

    @Column(name = "RSATYPE")
    private Boolean rsatype;

    @Column(name = "DTL_LINES")
    private Short dtlLines;

    @Column(name = "RSACLASS")
    private Long rsaclass;

    @Column(name = "PLACEPOINTID")
    private Long placepointid;

    @Column(name = "ORDERSOURCE")
    private Long ordersource;

    @Column(name = "CASHIEROPCODE", length = 20)
    private String cashieropcode;

    @Column(name = "ZX_B2CDOCID", length = 200)
    private String zxB2cdocid;

    @Column(name = "CLERKERID")
    private Long clerkerid;

    @Column(name = "EMPLOYEENAME", length = 40)
    private String employeename;

    @Column(name = "GOODSID")
    private Long goodsid;

    @Column(name = "GOODSNAME", length = 100)
    private String goodsname;

    @Column(name = "GOODSTYPE", length = 100)
    private String goodstype;

    @Column(name = "GOODSUNIT", length = 10)
    private String goodsunit;

    @Column(name = "GOODSQTY", precision = 16, scale = 6)
    private BigDecimal goodsqty;

    @Column(name = "USEPRICE", precision = 20, scale = 10)
    private BigDecimal useprice;

    @Column(name = "TOTAL_LINE", precision = 12, scale = 4)
    private BigDecimal totalLine;

    @Column(name = "FACTORYNAME", length = 100)
    private String factoryname;

    @Column(name = "UNITPRICE", precision = 20, scale = 10)
    private BigDecimal unitprice;

    @Column(name = "PACKSIZE", precision = 16, scale = 6)
    private BigDecimal packsize;

    @Column(name = "PACKNAME", length = 10)
    private String packname;

    @Column(name = "OPCODE", length = 40)
    private String opcode;

    @Column(name = "GOODSDTLID")
    private Long goodsdtlid;

    @Column(name = "RSADTLID", nullable = false)
    private Long rsadtlid;

    @Column(name = "ZX_B2CDTLID", length = 200)
    private String zxB2cdtlid;

    @Column(name = "TASKID", length = 50)
    private String taskid;

    @Column(name = "DICTID")
    private Long dictid;

}