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
 * @Author : Tammy
 * @Date : 22025年3月29日14:23:55
 * @Description : 零售门店定义
 */
@Getter
@Setter
@Entity
@Immutable
@Table(name = "GPCS_PLACEPOINT_V")
public class GpcsPlacepointV {
    @Id
    @Column(name = "PLACEPOINTID", nullable = false)
    private Long placepointid;

    @Column(name = "PLACEPOINTOPCODE", length = 40)
    private String placepointopcode;

    @Column(name = "PLACEPOINTNO", length = 40)
    private String placepointno;

    @Column(name = "PLACEPOINTNAME", length = 50)
    private String placepointname;

    @Column(name = "PLACEPOINTPINYIN", length = 22)
    private String placepointpinyin;

    @Column(name = "PLACEPOINTFLAG", length = 30)
    private String placepointflag;

    @Column(name = "USESTATUS")
    private Boolean usestatus;

    @Column(name = "MEMO", length = 200)
    private String memo;

    @Column(name = "TEL", length = 30)
    private String tel;

    @Column(name = "ONES")
    private Short ones;

    @Column(name = "BUSINESSTIME", precision = 4, scale = 2)
    private BigDecimal businesstime;

    @Column(name = "ADDRESS", length = 100)
    private String address;

    @Column(name = "CREDATE")
    private Date credate;

    @Column(name = "RISERATE", precision = 4, scale = 2)
    private BigDecimal riserate;

    @Column(name = "RESA_MONEY_PRECISION")
    private Boolean resaMoneyPrecision;

    @Column(name = "UPDATEPOS")
    private Boolean updatepos;

    @Column(name = "SALERFLAG")
    private Boolean salerflag;

    @Column(name = "CTRLLOWPRICE", precision = 20, scale = 10)
    private BigDecimal ctrllowprice;

    @Column(name = "DISPAYGATHMONEY")
    private Boolean dispaygathmoney;

    @Column(name = "AREADOCID")
    private Long areadocid;

    @Column(name = "AREANAME", length = 80)
    private String areaname;

    @Column(name = "AREAOPCODE", length = 20)
    private String areaopcode;

    @Column(name = "STHOUSENO", length = 40)
    private String sthouseno;

    @Column(name = "STHOUSENAME", length = 100)
    private String sthousename;

    @Column(name = "STHOUSEID")
    private Long sthouseid;

    @Column(name = "STORAGEID")
    private Long storageid;

    @Column(name = "STORAGEOPCODE", length = 40)
    private String storageopcode;

    @Column(name = "STORAGENAME", length = 120)
    private String storagename;

    @Column(name = "STORAGENO", length = 40)
    private String storageno;

    @Column(name = "EMPLOYEEOPCODE", length = 20)
    private String employeeopcode;

    @Column(name = "EMPLOYEENAME", length = 40)
    private String employeename;

    @Column(name = "INPUTMANID")
    private Long inputmanid;

    @Column(name = "RETAILCENTERID")
    private Long retailcenterid;

    @Column(name = "RETAILCENTEROPCODE", length = 20)
    private String retailcenteropcode;

    @Column(name = "RETAILCENTERNAME", length = 80)
    private String retailcentername;

    @Column(name = "REQSPLITFLAG")
    private Boolean reqsplitflag;

    @Column(name = "ENTRYID")
    private Long entryid;

    @Column(name = "ENTRYNAME", length = 100)
    private String entryname;

    @Column(name = "PRESSTOCKFLAG")
    private Boolean presstockflag;

    @Column(name = "LOT_MANAGER_MODE")
    private Boolean lotManagerMode;

    @Column(name = "LOT_MODIFY")
    private Boolean lotModify;

    @Column(name = "BATCH_MANAGER_MODE")
    private Boolean batchManagerMode;

    @Column(name = "PRINTFLAG")
    private Boolean printflag;

    @Column(name = "ISCOMM")
    private Boolean iscomm;

    @Column(name = "REQCENTERST")
    private Boolean reqcenterst;

    @Column(name = "REQQTYUPLIMIT")
    private Boolean reqqtyuplimit;

    @Column(name = "MINIATURETAXPAYERFLAG")
    private Boolean miniaturetaxpayerflag;

    @Column(name = "INCOMETAXRATE", precision = 10, scale = 4)
    private BigDecimal incometaxrate;

    @Column(name = "OUTPUTTAXRATE", precision = 10, scale = 4)
    private BigDecimal outputtaxrate;

    @Column(name = "MANUALRATELIMIT", precision = 16, scale = 6)
    private BigDecimal manualratelimit;

    @Column(name = "OTCRESTRICT")
    private Long otcrestrict;

    @Column(name = "DEFAULTDOCTER", length = 32)
    private String defaultdocter;

    @Column(name = "DEFAULTHOSPITAL", length = 128)
    private String defaulthospital;

    @Column(name = "MAXEPHQTY", precision = 16, scale = 6)
    private BigDecimal maxephqty;

    @Column(name = "EXAMPRICEID")
    private Long exampriceid;

    @Column(name = "PRICENAME", length = 40)
    private String pricename;

    @Column(name = "EXAMPRICEOPCODE", length = 20)
    private String exampriceopcode;

    @Column(name = "PRELOTMANAGERMODE")
    private Short prelotmanagermode;

    @Column(name = "PEIFANGMANID")
    private Long peifangmanid;

    @Column(name = "SHENFANGMANID")
    private Long shenfangmanid;

    @Column(name = "PEIFANGMANNAME", length = 40)
    private String peifangmanname;

    @Column(name = "PEIFANGMANOPCODE", length = 50)
    private String peifangmanopcode;

    @Column(name = "SHENFANGMANNAME", length = 40)
    private String shenfangmanname;

    @Column(name = "SHENFANGMANOPCODE", length = 50)
    private String shenfangmanopcode;

    @Column(name = "TRANSLINEID")
    private Long translineid;

    @Column(name = "TRANSLINENAME", length = 100)
    private String translinename;

    @Column(name = "SADAYS_PARAM")
    private Integer sadaysParam;

    @Column(name = "TOPNUM_PARAM")
    private Integer topnumParam;

    @Column(name = "CATEGORYID")
    private Long categoryid;

    @Column(name = "BULKCHECKMANID")
    private Long bulkcheckmanid;

    @Column(name = "BULKMANOPCODE", length = 20)
    private String bulkmanopcode;

    @Column(name = "BULKMANNAME", length = 40)
    private String bulkmanname;

    @Column(name = "DELIVERYDAY", length = 50)
    private String deliveryday;

    @Column(name = "TOTALAREA", precision = 14, scale = 4)
    private BigDecimal totalarea;

    @Column(name = "LIVINGAREA", precision = 14, scale = 4)
    private BigDecimal livingarea;

    @Column(name = "RECIPEREUSABLEFLAG")
    private Boolean recipereusableflag;

    @Column(name = "MANUALLYADD")
    private Boolean manuallyadd;

    @Column(name = "ISAPPROVAL")
    private Boolean isapproval;

    @Column(name = "JFDKXS", precision = 10, scale = 2)
    private BigDecimal jfdkxs;

    @Column(name = "ISCONFIRM")
    private Long isconfirm;

    @Column(name = "OFFICESIDS", length = 200)
    private String officesids;

    @Column(name = "OFFICESNAMES", length = 200)
    private String officesnames;

    @Column(name = "CLASSTEMPLETID")
    private Long classtempletid;

    @Column(name = "WX_CUSTOMERNO", length = 4000)
    private String wxCustomerno;

    @Column(name = "ISWEIXIN")
    private Long isweixin;

    @Column(name = "ZFB_PAY_PUBKEY", length = 4000)
    private String zfbPayPubkey;

    @Column(name = "ZFB_PRIVATEKEY", length = 4000)
    private String zfbPrivatekey;

    @Column(name = "ZFB_APPID", length = 4000)
    private String zfbAppid;

    @Column(name = "ISZFB")
    private Long iszfb;

    @Column(name = "ISENDOFDAY")
    private Long isendofday;

    @Column(name = "ISSAME")
    private Long issame;

    @Column(name = "AVGMATHED")
    private Short avgmathed;

    @Column(name = "AVGMATHEDPOINT")
    private Short avgmathedpoint;

    @Column(name = "UPDOWNUPDATE")
    private Short updownupdate;

    @Column(name = "UPDOWNGOODS")
    private Short updowngoods;

    @Column(name = "UPDOWNAVGMATHED")
    private Short updownavgmathed;

    @Column(name = "UPDOWNMATHEDPOINT")
    private Short updownmathedpoint;

    @Column(name = "DEFAULTUPDAYS", precision = 10, scale = 2)
    private BigDecimal defaultupdays;

    @Column(name = "DEFAULTDOWNDAYS", precision = 10, scale = 2)
    private BigDecimal defaultdowndays;

    @Column(name = "AVGCALCULATEMATHED")
    private Short avgcalculatemathed;

    @Column(name = "D1DAYS", precision = 16, scale = 6)
    private BigDecimal d1days;

    @Column(name = "D2DAYS", precision = 16, scale = 6)
    private BigDecimal d2days;

    @Column(name = "D3DAYS", precision = 16, scale = 6)
    private BigDecimal d3days;

    @Column(name = "D4DAYS", precision = 16, scale = 6)
    private BigDecimal d4days;

    @Column(name = "D1PROPORTION", precision = 6, scale = 3)
    private BigDecimal d1proportion;

    @Column(name = "D2PROPORTION", precision = 6, scale = 3)
    private BigDecimal d2proportion;

    @Column(name = "D3PROPORTION", precision = 6, scale = 3)
    private BigDecimal d3proportion;

    @Column(name = "D4PROPORTION", precision = 6, scale = 3)
    private BigDecimal d4proportion;

    @Column(name = "REMOVENOSALE")
    private Boolean removenosale;

    @Column(name = "REMOVEPLACE")
    private Boolean removeplace;

    @Column(name = "REMOVENOACCEPT")
    private Boolean removenoaccept;

    @Column(name = "REMOVEINST")
    private Boolean removeinst;

    @Column(name = "REMOVEOUTST")
    private Boolean removeoutst;

    @Column(name = "REQMATHED")
    private Short reqmathed;

    @Column(name = "AUTOREQDATE", length = 500)
    private String autoreqdate;

    @Column(name = "AUTOREQMATHED")
    private Short autoreqmathed;

    @Column(name = "AUTOREQUSESTATUS")
    private Short autorequsestatus;

    @Column(name = "CLACDATEN")
    private Long clacdaten;

    @Column(name = "CALCMETHOD")
    private Boolean calcmethod;

    @Column(name = "AREAMANAGERID")
    private Long areamanagerid;

    @Column(name = "AREAMANAGER", length = 40)
    private String areamanager;

    @Column(name = "POINTHEADID")
    private Long pointheadid;

    @Column(name = "POINTHEAD", length = 40)
    private String pointhead;

    @Column(name = "POINTKEEPERID")
    private Long pointkeeperid;

    @Column(name = "POINTKEEPER", length = 40)
    private String pointkeeper;

    @Column(name = "PRESALEPATTERN")
    private Boolean presalepattern;

    @Column(name = "PRECHECKPATTERN")
    private Boolean precheckpattern;

    @Column(name = "OPENDATE")
    private Date opendate;

    @Column(name = "OPENDAYS")
    private Long opendays;

    @Column(name = "BUSINESSHOURS", length = 200)
    private String businesshours;

    @Column(name = "ISSHORTCUTKEY")
    private Boolean isshortcutkey;

    @Column(name = "LONGITUDE", precision = 16, scale = 6)
    private BigDecimal longitude;

    @Column(name = "LATITUDE", precision = 16, scale = 6)
    private BigDecimal latitude;

    @Column(name = "ISCREDIT")
    private Boolean iscredit;

    @Column(name = "CASHIERHANDINMODE")
    private Short cashierhandinmode;

    @Column(name = "CASHIERMANUALHANDINMODE")
    private Short cashiermanualhandinmode;

    @Column(name = "POINTHANDINMODE")
    private Short pointhandinmode;

    @Column(name = "POINTAUTOHANDINSTATUS")
    private Short pointautohandinstatus;

    @Column(name = "ZHYDCASHIERID")
    private Long zhydcashierid;

    @Column(name = "ZHYDCASHIERNAME", length = 40)
    private String zhydcashiername;

    @Column(name = "ZHYDCLERKERID")
    private Long zhydclerkerid;

    @Column(name = "ZHYDCLERKERNAME", length = 40)
    private String zhydclerkername;

    @Column(name = "ZX_PRINTFORM")
    private Short zxPrintform;

    @Column(name = "O2OMANID")
    private Long o2omanid;

    @Column(name = "O2OMANNAME", length = 40)
    private String o2omanname;

    @Column(name = "MEDAGENCODE", length = 2000)
    private String medagencode;

    @Column(name = "MEDAGENNAME", length = 2000)
    private String medagenname;

    @Column(name = "MDTRTAREA_ADMVS", length = 2000)
    private String mdtrtareaAdmvs;

    @Column(name = "PAMDBM", length = 100)
    private String pamdbm;

    @Column(name = "B2CCLERKERID")
    private Long b2cclerkerid;

    @Column(name = "B2CMANNAME", length = 40)
    private String b2cmanname;

    @Column(name = "B2CREQGOODSMANID")
    private Long b2creqgoodsmanid;

    @Column(name = "B2CREQGOODSMAN", length = 40)
    private String b2creqgoodsman;

    @Column(name = "ZX_ECODEFLAG")
    private Long zxEcodeflag;

}