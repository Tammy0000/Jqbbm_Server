package com.jq.jqbbm_server.Entity.Primary;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Immutable;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Mapping for DB view
 * @author Tammy
 * @date 2025年3月29日15:47:05
 * @description 查询药品的信息
 */
@Getter
@Setter
@Entity
@Immutable
@Table(name = "PUB_GOODS_V")
public class PubGoodsV {
    @Column(name = "GOODSID", nullable = false)
    @Id
    private Long goodsid;

    @Column(name = "OPCODE", length = 40)
    private String opcode;

    @Column(name = "GOODSPINYIN", length = 40)
    private String goodspinyin;

    @Column(name = "GOODSNAME", length = 100)
    private String goodsname;

    @Column(name = "CURRENCYNAME", length = 100)
    private String currencyname;

    @Column(name = "GOODSENGNAME", length = 100)
    private String goodsengname;

    @Column(name = "GOODSINVNAME", length = 100)
    private String goodsinvname;

    @Column(name = "GOODSSHORTNAME", length = 40)
    private String goodsshortname;

    @Column(name = "GOODSFORMALNAME", length = 100)
    private String goodsformalname;

    @Column(name = "GOODSFORMALPY", length = 40)
    private String goodsformalpy;

    @Column(name = "GOODSNO", length = 40)
    private String goodsno;

    @Column(name = "STANDARDNO", length = 40)
    private String standardno;

    @Column(name = "BARCODE", length = 20)
    private String barcode;

    @Column(name = "GOODSTYPE", length = 100)
    private String goodstype;

    @Column(name = "GOODSUNIT", length = 10)
    private String goodsunit;

    @Column(name = "FIRSTAPPROVEDOCNO", length = 40)
    private String firstapprovedocno;

    @Column(name = "APPROVEDOCNO", length = 100)
    private String approvedocno;

    @Column(name = "REGISTDOCNO", length = 100)
    private String registdocno;

    @Column(name = "STANDARDTYPE", length = 100)
    private String standardtype;

    @Column(name = "FACTORYID")
    private Long factoryid;

    @Column(name = "FACTORYOPCODE", length = 100)
    private String factoryopcode;

    @Column(name = "FACTORYNAME", length = 100)
    private String factoryname;

    @Column(name = "VALIDPERIOD")
    private Integer validperiod;

    @Column(name = "RESPPERIOD")
    private Integer respperiod;

    @Column(name = "PERIODUNIT", length = 2)
    private String periodunit;

    @Column(name = "TRADEMARK", length = 50)
    private String trademark;

    @Column(name = "PRODAREA", length = 100)
    private String prodarea;

    @Column(name = "SUPPLYTAXRATE", precision = 2, scale = 2)
    private BigDecimal supplytaxrate;

    @Column(name = "SALESTAXRATE", precision = 2, scale = 2)
    private BigDecimal salestaxrate;

    @Column(name = "BRANDID")
    private Long brandid;

    @Column(name = "PERMITNO", length = 80)
    private String permitno;

    @Column(name = "VARIETYID")
    private Long varietyid;

    @Column(name = "VARIETYNO", length = 40)
    private String varietyno;

    @Column(name = "VARIETYNAME", length = 40)
    private String varietyname;

    @Column(name = "VARIETYDESCID")
    private Long varietydescid;

    @Column(name = "VARIETYDESCNO", length = 40)
    private String varietydescno;

    @Column(name = "VARIETYDESCNAME", length = 40)
    private String varietydescname;

    @Column(name = "VARDESCLASSID")
    private Long vardesclassid;

    @Column(name = "VARDESCLASSNO", length = 40)
    private String vardesclassno;

    @Column(name = "VARDESCLASSNAME", length = 40)
    private String vardesclassname;

    @Column(name = "ACCFLAG")
    private Long accflag;

    @Column(name = "STORAGECONDITION")
    private Short storagecondition;

    @Column(name = "TRANSCONDITION")
    private Short transcondition;

    @Column(name = "COMBINFLAG")
    private Boolean combinflag;

    @Column(name = "CUSTOMSTAX", precision = 6, scale = 4)
    private BigDecimal customstax;

    @Column(name = "MINREQGOODSQTY", precision = 16, scale = 6)
    private BigDecimal minreqgoodsqty;

    @Column(name = "FINANCENO", length = 50)
    private String financeno;

    @Column(name = "OTCFLAG")
    private Boolean otcflag;

    @Column(name = "SECURITYFLAG")
    private Boolean securityflag;

    @Column(name = "CHINESEFLAG")
    private Long chineseflag;

    @Column(name = "MEDICINETYPE")
    private Long medicinetype;

    @Column(name = "MEDICINETYPENAME", length = 100)
    private String medicinetypename;

    @Column(name = "BUSISCOPE")
    private Long busiscope;

    @Column(name = "BUSISCOPENAME", length = 100)
    private String busiscopename;

    @Column(name = "IMPORTFLAG")
    private Long importflag;

    @Column(name = "SPECIALCTRL")
    private Short specialctrl;

    @Column(name = "SPECIALDRUG")
    private Short specialdrug;

    @Column(name = "CREDATE")
    private Date credate;

    @Column(name = "INPUTMANID")
    private Long inputmanid;

    @Column(name = "INPUTMANNAME", length = 40)
    private String inputmanname;

    @Column(name = "MEMO", length = 200)
    private String memo;

    @Column(name = "USESTATUS")
    private Short usestatus;

    @Column(name = "INTEGERNX", precision = 20, scale = 10)
    private BigDecimal integernx;

    @Column(name = "\"FUNCTION\"", length = 500)
    private String function;

    @Column(name = "MEDICINESORT")
    private Boolean medicinesort;

    @Column(name = "GSPFLAG")
    private Long gspflag;

    @Column(name = "ECODEFLAG")
    private Long ecodeflag;

    @Column(name = "GSPCATEGORYID")
    private Long gspcategoryid;

    @Column(name = "MEDICINEFLAG")
    private Long medicineflag;

    @Column(name = "INITFLAG")
    private Long initflag;

    @Column(name = "ALONEPACKFLAG")
    private Long alonepackflag;

    @Column(name = "COLDFLAG")
    private Boolean coldflag;

    @Column(name = "TEMPERATUREDOWN", precision = 12, scale = 2)
    private BigDecimal temperaturedown;

    @Column(name = "TEMPERATUREUP", precision = 12, scale = 2)
    private BigDecimal temperatureup;

    @Column(name = "TRANSPORTTIME", precision = 12, scale = 2)
    private BigDecimal transporttime;

    @Column(name = "TREATMENT", length = 100)
    private String treatment;

    @Column(name = "DOSAGE", length = 100)
    private String dosage;

    @Column(name = "USEGOODSTIME", length = 100)
    private String usegoodstime;

    @Column(name = "DIAGNOSTICINFO", length = 100)
    private String diagnosticinfo;

    @Column(name = "SYS_MODIFYDATE")
    private Date sysModifydate;

    @Column(name = "RETAILNOLOT")
    private Boolean retailnolot;

    @Column(name = "BRANDNAME", length = 100)
    private String brandname;

    @Column(name = "LOTFLAG")
    private Long lotflag;

    @Column(name = "FACTORYFLAG")
    private Long factoryflag;

    @Column(name = "PRODAREAFLAG")
    private Long prodareaflag;

    @Column(name = "SEASONCLASSNAME", length = 40)
    private String seasonclassname;

    @Column(name = "SEASONCLASSID")
    private Long seasonclassid;

    @Column(name = "AGAINCHKFLAG")
    private Long againchkflag;

    @Column(name = "CHINESEMEDIFLAG")
    private Long chinesemediflag;

    @Column(name = "TREATMENTFLAG")
    private Long treatmentflag;

    @Column(name = "USEGOODSTABOO", length = 200)
    private String usegoodstaboo;

    @Column(name = "INVALIDMANID")
    private Long invalidmanid;

    @Column(name = "INVALIDMANAME", length = 40)
    private String invalidmaname;

    @Column(name = "INVALIDTIME")
    private Date invalidtime;

    @Column(name = "INVALIDMEMO", length = 1000)
    private String invalidmemo;

    @Column(name = "UPCLOUDDATE")
    private Date upclouddate;

    @Column(name = "UPCLOUDFLAG")
    private Boolean upcloudflag;

    @Column(name = "HOLDERSID")
    private Long holdersid;

    @Column(name = "HOLDERSNAME", length = 100)
    private String holdersname;

    @Column(name = "ZX_AGENT", length = 100)
    private String zxAgent;

    @Column(name = "ZX_FORBIDTYPE")
    private Boolean zxForbidtype;

    @Column(name = "ZX_FORBIDAREA")
    private Boolean zxForbidarea;

    @Column(name = "ZX_FPFLAG")
    private Long zxFpflag;

    @Column(name = "ZX_SWBM", length = 100)
    private String zxSwbm;

    @Column(name = "ZX_SPLITCLASS")
    private Short zxSplitclass;

    @Column(name = "ZX_STANDARDNO", length = 100)
    private String zxStandardno;

    @Column(name = "ZX_SYJFLAG")
    private Boolean zxSyjflag;

    @Column(name = "ZX_MLFL")
    private Long zxMlfl;

    @Column(name = "ZX_YJGOODSTYPE", length = 100)
    private String zxYjgoodstype;

    @Column(name = "ZX_RESPILIT")
    private Boolean zxRespilit;

    @Column(name = "ZX_MAINTAINFLAG")
    private Boolean zxMaintainflag;

    @Column(name = "ZX_SYSMODIFYDATE1")
    private Date zxSysmodifydate1;

    @Column(name = "ZX_WYKTYPE")
    private Short zxWyktype;

    @Column(name = "ZX_ZHXS", precision = 16, scale = 6)
    private BigDecimal zxZhxs;

    @Column(name = "ZX_SFSH")
    private Boolean zxSfsh;

    @Column(name = "ZX_SSYH")
    private Boolean zxSsyh;

    @Column(name = "ZX_YBYPDM", length = 50)
    private String zxYbypdm;

    @Column(name = "KKGOODSNAME", length = 100)
    private String kkgoodsname;

    @Column(name = "KKONELEVELCLASS")
    private Short kkonelevelclass;

    @Column(name = "KKMLFL")
    private Short kkmlfl;

    @Column(name = "ZX_DJ")
    private Short zxDj;

    @Column(name = "ZX_SFYBY")
    private Long zxSfyby;

    @Column(name = "ZX_YBM", length = 50)
    private String zxYbm;

    @Column(name = "ZX_NOCODEFLAG")
    private Long zxNocodeflag;

}