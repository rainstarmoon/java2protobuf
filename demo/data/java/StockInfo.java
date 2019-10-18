package com.iquantex.ts.cre.data.model;

import com.iquantex.ts.cre.data.process.message.protobuf.REDataStock;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.Map;

/**
 * Created by zero on 2017/5/8.
 */
@Getter
@Setter
public class StockInfo {
    /**
     * 股票内部编码
     */
    private String stkHcode;

    /**
     * 上市板块代码：001-主板/002-中小企业板/003-三板/004-大宗交易系统/005-创业板/999-其他
     */
    private String listSectorHcode;

    /**
     * 发行公司内部编码
     */
    private String partyHcode;

    /**
     * 中文全称
     */
    private String cname;

    /**
     * 中文简称
     */
    private String csname;

    /**
     * 英文全称
     */
    private String ename;

    /**
     * 英文简称
     */
    private String esname;

    /**
     * 证券拼音
     */
    private String pyName;

    /**
     * 股票类别1
     */
    private String stkClass1;

    /**
     * 股票类别2
     */
    private String stkClass2;

    /**
     * 股票类别3
     */
    private String stkClass3;

    /**
     * 面值
     */
    private Double parValue;

    /**
     * 证券代码
     */
    private String symbol;

    /**
     * 市场证券代码
     */
    private String combSymbol;

    /**
     * 市场编码
     */
    private String marketCode;

    /**
     * 上市状态
     */
    private String listStatus;

    /**
     * 上市日期
     */
    private Date listDate;

    /**
     * 退市日期
     */
    private Date delistDate;

    /**
     * 申万一级行业分类代码
     */
    private String swInduHcode1;

    /**
     * 申万一级行业分类名称
     */
    private String swInduCname1;

    /**
     * 申万二级行业分类代码
     */
    private String swInduHcode2;

    /**
     * 申万二级行业分类名称
     */
    private String swInduCname2;

    /**
     * 申万三级行业分类代码
     */
    private String swInduHcode3;

    /**
     * 申万三级行业分类名称
     */
    private String swInduCname3;


    /***************** 停牌信息 ******************/
    /**
     * 上交所股票停牌信息
     */
    private StockSuspensionInfo shStockSuspensionInfo;

    /**
     * 深交所股票停牌信息 key为secuCode_dateStr(yyyy-MM-dd)
     */
    private Map<String, StockSuspensionInfo> szStockSuspensionInfoMap;

    /* ************************** 证券主表信息 ************************ */

    /**
     * 证券内部编码
     */
    private String secuHcode;

    /**
     * 证券内部编码(等价于secu_hcode)
     */
    private String secuCode;

//    /**
//     * 只有证券代码
//     */
//    private String symbol;

    /**
     * 货币内部编码
     */
    private String currHcode;

//    /**
//     * 市场编码，见ref_market表
//     */
//    private String marketCode;

    /**
     * 1）sec_class3=IMS079，则secu_type=B；
     * 2）sec_class3=IMS082，则secu_type=MR；
     * 3）sec_class3=IMS081，则secu_type=TD；
     * 4）sec_class3=IMS080，则secu_type=CD；
     */
    private String secuType;

    /**
     * 证券名称
     */
    private String secuName;

//    /**
//     * 中文全称
//     */
//    private String cname;
//
//    /**
//     * 英文简称
//     */
//    private String esname;
//
//    /**
//     * 证券拼音
//     */
//    private String pyName;

    /**
     * 数据中心证券类别
     */
    private String secType;

    /**
     * 数据中心证券类别一
     */
    private String secClass1;

    /**
     * 数据中心证券类别二
     */
    private String secClass2;

    /**
     * 数据中心证券类别三
     */
    private String secClass3;


    /******************* 行情信息 *********************/
    /**
     * 当日股票行情
     */
    private StockPrice dayPrice;
    /**
     * 上一交易日股票行情
     */
    private StockPrice lastTradingDayPrice;

    /***************** 股本结构变化表 ******************/


//    /**
//     * 主体内部编码
//     */
//    private String partyHcode;

    /**
     * 变动日期
     */
    private Date changeDate;

    /**
     * 公告日期
     */
    private Date anncDate;

    /**
     * 总股本
     */
    private Double ttlShares;

    /**
     * A股股本
     */
    private Double ashares;

    /**
     * 流通A股股本
     */
    private Double circAshares;

    /**
     * 限售A股股本
     */
    private Double restrAshares;

    /**
     * 非流通A股股本
     */
    private Double uncircAshares;

    /**
     * B股股本
     */
    private Double bshares;

    /**
     * 流通B股股本
     */
    private Double circBshares;

    /**
     * 限售B股股本
     */
    private Double restrBshares;

    /**
     * 非流通B股股本
     */
    private Double uncircBshares;

    /**
     * 港股股本
     */
    private Double hshares;

    /**
     * 海外流通股股本
     */
    private Double outCircShares;

    public StockInfo parserPbBean(REDataStock.StockInfo bean) {
        StockInfo value = this;
        value.setStkHcode(bean.getStkHcode());
        value.setListSectorHcode(bean.getListSectorHcode());
        value.setPartyHcode(bean.getPartyHcode());
        value.setCname(bean.getCname());
        value.setCsname(bean.getCsname());
        value.setEname(bean.getEname());
        value.setEsname(bean.getEsname());
        value.setPyName(bean.getPyName());
        value.setStkClass1(bean.getStkClass1());
        value.setStkClass2(bean.getStkClass2());
        value.setStkClass3(bean.getStkClass3());
        value.setParValue(bean.getParValue());
        value.setSymbol(bean.getSymbol());
        value.setCombSymbol(bean.getCombSymbol());
        value.setMarketCode(bean.getMarketCode());
        value.setListStatus(bean.getListStatus());
        value.setListDate(new Date(bean.getListDate()));
        value.setDelistDate(new Date(bean.getDelistDate()));
        value.setSwInduHcode1(bean.getSwInduHcode1());
        value.setSwInduCname1(bean.getSwInduCname1());
        value.setSwInduHcode2(bean.getSwInduHcode2());
        value.setSwInduCname2(bean.getSwInduCname2());
        value.setSwInduHcode3(bean.getSwInduHcode3());
        value.setSwInduCname3(bean.getSwInduCname3());
        value.setShStockSuspensionInfo(new StockSuspensionInfo().parserPbBean(bean.getShStockSuspensionInfo()));
        value.setSzStockSuspensionInfoMap(StockSuspensionInfo.parserPbBean(bean.getSzStockSuspensionInfoMapMap()));
        value.setSecuHcode(bean.getSecuHcode());
        value.setSecuCode(bean.getSecuCode());
        value.setCurrHcode(bean.getCurrHcode());
        value.setSecuType(bean.getSecuType());
        value.setSecuName(bean.getSecuName());
        value.setSecType(bean.getSecType());
        value.setSecClass1(bean.getSecClass1());
        value.setSecClass2(bean.getSecClass2());
        value.setSecClass3(bean.getSecClass3());
        value.setDayPrice(new StockPrice().parserPbBean(bean.getDayPrice()));
        value.setLastTradingDayPrice(new StockPrice().parserPbBean(bean.getLastTradingDayPrice()));
        value.setChangeDate(new Date(bean.getChangeDate()));
        value.setAnncDate(new Date(bean.getAnncDate()));
        value.setTtlShares(bean.getTtlShares());
        value.setAshares(bean.getAshares());
        value.setCircAshares(bean.getCircAshares());
        value.setRestrAshares(bean.getRestrAshares());
        value.setUncircAshares(bean.getUncircAshares());
        value.setBshares(bean.getBshares());
        value.setCircBshares(bean.getCircBshares());
        value.setRestrBshares(bean.getRestrBshares());
        value.setUncircBshares(bean.getUncircBshares());
        value.setHshares(bean.getHshares());
        value.setOutCircShares(bean.getOutCircShares());
        return value;
    }

}
