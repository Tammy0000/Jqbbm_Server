package com.jq.jqbbm_server.Entity.Primary;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Immutable;

import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * Mapping for DB view
 * @author Tammy
 * @Date 2025年3月26日14:58:29
 */
@Getter
@Setter
@Entity
@Immutable
@Table(name = "BMS_ST_QTY_LST_V")
public class BmsStQtyLstV {
    @Column(name = "GOODSID", nullable = false)
    private Long goodsid;

    @Column(name = "OPCODE", length = 40)
    private String opcode;

    @Column(name = "GOODSNO", length = 40)
    private String goodsno;

    @Column(name = "GOODSNAME", length = 100)
    private String goodsname;

    @Column(name = "CURRENCYNAME", length = 100)
    private String currencyname;

    @Column(name = "GOODSTYPE", length = 100)
    private String goodstype;

    @Column(name = "GOODSUNIT", length = 10)
    private String goodsunit;

    @Column(name = "ZX_FPFLAG")
    private Long zxFpflag;

    @Column(name = "FACTORYID")
    private Long factoryid;

    @Column(name = "FACTORYNAME", length = 100)
    private String factoryname;

    @Column(name = "PRODAREA", length = 100)
    private String prodarea;

    @Column(name = "VALIDPERIOD")
    private Integer validperiod;

    @Column(name = "IMPORTFLAG")
    private Long importflag;

    @Column(name = "SPECIALDRUG")
    private Short specialdrug;

    @Column(name = "SPECIALCTRL")
    private Short specialctrl;

    @Column(name = "GOODSDETAILID", nullable = false)
    private Long goodsdetailid;

    @Column(name = "PACKNAME", length = 10)
    private String packname;

    @Column(name = "PACKSIZE", precision = 16, scale = 2)
    private BigDecimal packsize;

    @Column(name = "STORAGEID", nullable = false)
    private Long storageid;

    @Column(name = "STORAGENAME", length = 120)
    private String storagename;

    @Column(name = "BATCHID", nullable = false)
    private Long batchid;

    @Column(name = "BATCHNO", length = 20)
    private String batchno;

    @Column(name = "COMPANYID")
    private Long companyid;

    @Column(name = "COMPANYNAME", length = 100)
    private String companyname;

    @Column(name = "LOTID", nullable = false)
    private Long lotid;

    @Column(name = "LOTNO", length = 100)
    private String lotno;

    @Column(name = "KILLLOTNO", length = 20)
    private String killlotno;

    @Column(name = "POSID", nullable = false)
    private Long posid;

    @Column(name = "POSNO", length = 20)
    private String posno;

    @Column(name = "GOODSSTATUSID", nullable = false)
    @Id
    private Long goodsstatusid;

    @Column(name = "GOODSSTATUS", length = 20)
    private String goodsstatus;

    @Column(name = "USEFLAG")
    private Short useflag;

    @Column(name = "QUALITYSTATUS")
    private Short qualitystatus;

    @Column(name = "GOODSQTY", precision = 16, scale = 2)
    private BigDecimal goodsqty;

    @Column(name = "PACKQTY")
    private Long packqty;

    @Column(name = "STORAGENO", length = 40)
    private String storageno;

    @Column(name = "STORAGEOPCODE", length = 40)
    private String storageopcode;

    @Column(name = "BATCHSORTNO", length = 20)
    private String batchsortno;

    @Column(name = "LOTSORTNO", length = 20)
    private String lotsortno;

    @Column(name = "PRODDATE")
    private LocalDate proddate;

    @Column(name = "INVALIDDATE")
    private LocalDate invaliddate;

    @Column(name = "DIFFDAY")
    private Long diffday;

    @Column(name = "COUNTERID")
    private Long counterid;

    @Column(name = "COUNTERNAME", length = 50)
    private String countername;

    @Column(name = "OTCFLAG")
    private Boolean otcflag;

    @Column(name = "MEDICINETYPE")
    private Long medicinetype;

    @Column(name = "RESALEPRICE", precision = 20, scale = 2)
    private BigDecimal resaleprice;

    @Column(name = "BARCODE", length = 20)
    private String barcode;

    @Column(name = "GOODSPINYIN", length = 40)
    private String goodspinyin;

    @Column(name = "STHOUSEID")
    private Long sthouseid;

    @Column(name = "STHOUSENAME", length = 100)
    private String sthousename;

    @Column(name = "STORERID")
    private Long storerid;

    @Column(name = "STOREROPCODE", length = 40)
    private String storeropcode;

    @Column(name = "STORERNO", length = 40)
    private String storerno;

    @Column(name = "PERIODUNIT", length = 2)
    private String periodunit;

    @Column(name = "ACCFLAG")
    private Long accflag;

    @Column(name = "ENTRYID")
    private Long entryid;

    @Column(name = "EMPID")
    private Long empid;

    @Column(name = "EMPOPCODE", length = 20)
    private String empopcode;

    @Column(name = "EMPNAME", length = 40)
    private String empname;

    @Column(name = "UNITPRICE", precision = 20, scale = 2)
    private BigDecimal unitprice;

    @Column(name = "BATCHMONEY")
    private Long batchmoney;

    @Column(name = "CREDATE")
    private LocalDate credate;

    @Column(name = "APPROVEDOCNO", length = 100)
    private String approvedocno;

    @Column(name = "EMPDEPTNAME", length = 100)
    private String empdeptname;

    @Column(name = "DEPUTYID")
    private Long deputyid;

    @Column(name = "DEPUTY", length = 40)
    private String deputy;

    @Column(name = "MEDICINEFLAG")
    private Long medicineflag;

    @Column(name = "NOTAXSUPRICE", precision = 20, scale = 2)
    private BigDecimal notaxsuprice;

    @Column(name = "NOTAXMONEY")
    private Long notaxmoney;

    @Column(name = "FUNCTION", length = 500)
    private String function;

    @Column(name = "VARIETYID")
    private Long varietyid;

    @Column(name = "VARIETYDESCID")
    private Long varietydescid;

    @Column(name = "VARDESCLASSID")
    private Long vardesclassid;

    @Column(name = "CREATEFROM")
    private Short createfrom;

    @Column(name = "QUALITYINFO", length = 4000)
    private String qualityinfo;

    @Lob
    @Column(name = "AVAILABLEQTY_REAL")
    private String availableqtyReal;

    @Lob
    @Column(name = "AVAILABLEQTY")
    private String availableqty;

    @Column(name = "CUSTOMNAME", length = 100)
    private String customname;

    @Column(name = "EXISTDAYS")
    private Long existdays;

    @Column(name = "ECODEFLAG")
    private Long ecodeflag;

    @Column(name = "STORERNAME", length = 100)
    private String storername;

    @Column(name = "CONTACTID")
    private Long contactid;

    @Column(name = "CONTACTMAN", length = 40)
    private String contactman;

    @Column(name = "BRANDID")
    private Long brandid;

    @Column(name = "BRANDNAME", length = 100)
    private String brandname;

}