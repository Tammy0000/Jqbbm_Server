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
 * @Date 2025年3月26日14:19:13
 */
@Getter
@Setter
@Entity
@Immutable
@Table(name = "GRESA_SA_REPORT_V")
public class GresaSaReportV {
    @Column(name = "PLACEPOINTID")
    private Long placepointid;

    @Column(name = "PLACEPOINTNAME")
    private String placepointname;

    @Column(name = "AREADOCID")
    private Long areadocid;

    @Column(name = "AREANAME")
    private String areaname;

    @Column(name = "RETAILCENTERID")
    private Long retailcenterid;

    @Column(name = "RETAILCENTERNAME")
    private String retailcentername;

    @Column(name = "CREDATE_YEAR")
    private Long credateYear;

    @Column(name = "CREDATE_MONTH")
    private Long credateMonth;

    @Column(name = "CREDATE_WEEKDAY")
    private String credateWeekday;

    @Column(name = "CREDATE_HOUR")
    private Long credateHour;

    @Column(name = "USEDAY")
    private LocalDate useday;

    @Column(name = "CREDATE")
    private LocalDate credate;

    @Column(name = "RESACLASS")
    private Long resaclass;

    @Id
    @Column(name = "RSAID")
    private Long rsaid;

    @Column(name = "RSATYPE")
    private Boolean rsatype;

    @Column(name = "INSIDERID")
    private Long insiderid;

    @Column(name = "CARDTYPEID")
    private Long cardtypeid;

    @Column(name = "CARDTYPENAME")
    private String cardtypename;

    @Column(name = "INSIDERCARDNO")
    private String insidercardno;

    @Column(name = "INSIDERNAME")
    private String insidername;

    @Column(name = "INTEGRAL", precision = 20, scale = 2)
    private BigDecimal integral;

    @Column(name = "CASHIERID")
    private Long cashierid;

    @Column(name = "CASHNAME")
    private String cashname;

    @Column(name = "CLERKERID")
    private Long clerkerid;

    @Column(name = "CLERKERNAME")
    private String clerkername;

    @Column(name = "COUNTERID")
    private Long counterid;

    @Column(name = "COUNTERNAME")
    private String countername;

    @Column(name = "GOODSID")
    private Long goodsid;

    @Column(name = "GOODSNAME")
    private String goodsname;

    @Column(name = "CURRENCYNAME")
    private String currencyname;

    @Column(name = "OPCODE")
    private String opcode;

    @Column(name = "GOODSTYPE")
    private String goodstype;

    @Column(name = "GOODSUNIT")
    private String goodsunit;

    @Column(name = "FACTORYID")
    private Long factoryid;

    @Column(name = "FACTORYNAME")
    private String factoryname;

    @Column(name = "PRODAREA")
    private String prodarea;

    @Column(name = "APPROVEDOCNO")
    private String approvedocno;

    @Column(name = "REGISTDOCNO")
    private String registdocno;

    @Column(name = "DAY_SPAN")
    private String daySpan;

    @Column(name = "DOC_QTY")
    private String docQty;

    @Column(name = "DOC_REALMONEY")
    private String docRealmoney;

    @Column(name = "GOODS_TIMES")
    private String goodsTimes;

    @Column(name = "GOODS_USEPRICE")
    private String goodsUseprice;

    @Column(name = "GOODS_QTY")
    private String goodsQty;

    @Column(name = "GOODSQTY")
    private Long goodsqty;

    @Column(name = "TOTAL_LINE")
    private Long totalLine;

    @Column(name = "REALMONEY")
    private Long realmoney;

    @Column(name = "PLACE_SU_MONEY")
    private Long placeSuMoney;

    @Column(name = "PLACE_GROSSPROFIT")
    private Long placeGrossprofit;

    @Column(name = "UNITPRICE", precision = 20, scale = 2)
    private BigDecimal unitprice;

    @Column(name = "PLACE_GROSSMARGIN")
    private String placeGrossmargin;

    @Column(name = "EXAMPRICE", precision = 20, scale = 2)
    private BigDecimal examprice;

    @Column(name = "ASSESSMONEY", precision = 20, scale = 2)
    private BigDecimal assessmoney;

    @Column(name = "ASSESS_GROSSPROFIT")
    private String assessGrossprofit;

    @Column(name = "ASSES_GROSSMARGIN")
    private String assesGrossmargin;

    @Column(name = "DAY_GOODSQTY")
    private String dayGoodsqty;

    @Column(name = "DAY_TOTAL_OUT")
    private String dayTotalOut;

    @Column(name = "DAY_REALMONEY")
    private String dayRealmoney;

    @Column(name = "INSIDER_GOODSQTY")
    private Long insiderGoodsqty;

    @Column(name = "INSIDER_REALMONEY")
    private Long insiderRealmoney;

    @Column(name = "INSIDER_TOTAL_OUT")
    private Long insiderTotalOut;

    @Column(name = "INSIDER_BATCHMONEY", precision = 20, scale = 2)
    private BigDecimal insiderBatchmoney;

    @Column(name = "INSIDER_BATCHGROSSPROFIT")
    private String insiderBatchgrossprofit;

    @Column(name = "INSIDER_BATCHGROSSMARGIN")
    private String insiderBatchgrossmargin;

    @Column(name = "INSIDER_DAY_GOODSQTY")
    private String insiderDayGoodsqty;

    @Column(name = "INSIDER_DAY_TOTALOUT")
    private String insiderDayTotalout;

    @Column(name = "INSIDER_DAY_REALMONEY")
    private String insiderDayRealmoney;

    @Column(name = "INSIDER_GOODSQTY_PROP")
    private String insiderGoodsqtyProp;

    @Column(name = "INSIDER_TOTAL_OUT_PROP")
    private String insiderTotalOutProp;

    @Column(name = "INSIDER_REALMONEY_PROP")
    private String insiderRealmoneyProp;

    @Column(name = "INSIDER_BATCHGROSSPROFIT_PROP")
    private String insiderBatchgrossprofitProp;

    @Column(name = "GOODSQTY_PROP")
    private String goodsqtyProp;

    @Column(name = "TOTAL_OUT_PROP")
    private String totalOutProp;

    @Column(name = "REALMONEY_PROP")
    private String realmoneyProp;

    @Column(name = "BATCHGROSSPROFIT_PROP")
    private String batchgrossprofitProp;

    @Column(name = "TASKID")
    private String taskid;

    @Column(name = "ENTRYID")
    private Long entryid;

}