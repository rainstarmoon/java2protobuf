package com.iquantex.ruleengine.data.bean;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by Carl on 2019/7/19.
 * 期货信息
 */
public class FuturesInfo implements Serializable {

    private static final long serialVersionUID = 2218247803912896595L;

    /**
     * 合约内部编码
     */
    private Long innercode;

    /**
     * 证券内部编码
     */
    private String futHcode;

    /**
     * 合约代码
     */
    private String contractCode;

    /**
     * 合约简称
     */
    private String contractAbbr;

    /**
     * 合约全称
     */
    private String contractName;

    /**
     * 交易所代码 SHF-上海期货交易所, DCE-大连商品交易所, CZCE-郑州商品交易所, CFFEX-中国金融期货交易所, HKFE-香港期货交易所, OSE-大阪证券交易所, KR-韩国证券期货交易所, CBOT-芝加哥期货交易所
     */
    private String marketCode;

    /**
     * 合约类型 1-商品期货, 2-货币期货
     */
    private String contractType;

    /**
     * 合约标的
     */
    private String optionCode;

    /**
     * 是否真实 1-真实, 2-虚拟
     */
    private String ifReal;

    /**
     * 合约乘数(数值)
     */
    private String cmvalue;

    /**
     * 交易单位/合约乘数
     */
    private String contractMultiplier;

    /**
     * 报价单位
     */
    private String priceUnit;

    /**
     * 最小变动价位
     */
    private String littlestChangeUnit;

    /**
     * 每日涨跌幅度
     */
    private String changePctLimit;

    /**
     * 货币单位 CNY-人民币元
     */
    private String currHcode;

    /**
     * 交割年
     */
    private String deliveryYear;

    /**
     * 交割月
     */
    private String deliveryMonth;

    /**
     * 生效日期
     */
    private Date effectiveDate;

    /**
     * 最后交易日
     */
    private Date lasttradingDate;

    /**
     * 交割日期
     */
    private Date deliveryDate;

    /**
     * 最后交割日期
     */
    private Date lastDeliveryDate;

    /**
     * 交割方式 1-实物交割, 2-现金结算
     */
    private String deliveryMethod;

    /**
     * 最低交易保证金率%
     */
    private Double minMarginRatio;

    /**
     * 交易手续费
     */
    private String tradingCommission;

    /**
     * 交割手续费
     */
    private String deliveryCommission;

    /**
     * 挂牌基准价
     */
    private Double listBasisPrice;

    /**
     * 挂牌价涨跌幅%
     */
    private String changePctlistPrice;

    /**
     * 合约状态 1-正在上市交易, 5-已退市, 9-暂未上市
     */
    private String contractState;

    /**
     * 合约月份
     */
    private String contractMonth;

    /**
     * 交易时间
     */
    private String exchangedate;

    /* ************************** 证券主表信息 ************************ */

    /**
     * 证券内部编码
     */
    private String secuHcode;

    /**
     * 证券内部编码(等价于secu_hcode)
     */
    private String secuCode;

    /**
     * 只有证券代码
     */
    private String symbol;

//    /**
//     * 货币内部编码
//     */
//    private String currHcode;
//
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

    /**
     * 中文全称
     */
    private String cname;

    /**
     * 英文简称
     */
    private String esname;

    /**
     * 证券拼音
     */
    private String pyName;

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

    /**
     * 组合证券编码
     */
    private String combSymbol;

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

    /* ************************** 期货行情信息 ************************ */
    /**
     * 当日期货行情
     */
    private FuturesPrice dayPrice;
    /**
     * 上一交易日期货行情
     */
    private FuturesPrice lastTradingDayPrice;

    // 1-正在上市交易;5-已退市;9-暂未上市
    public static final String CONTRACT_STATE_ONLINE = "1";

    // 合约类型 1-商品期货;2-货币期货;3-利率期货;4-股指期货
    public static final String CONTRACT_TYPE_COMMODITY_FUTURES = "1";
    public static final String CONTRACT_TYPE_TREASURY_BOND_FUTURES = "3";
    public static final String CONTRACT_TYPE_STOCK_INDEX_FUTURES = "4";


    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Long getInnercode() {
        return innercode;
    }

    public void setInnercode(Long innercode) {
        this.innercode = innercode;
    }

    public String getFutHcode() {
        return futHcode;
    }

    public void setFutHcode(String futHcode) {
        this.futHcode = futHcode;
    }

    public String getContractCode() {
        return contractCode;
    }

    public void setContractCode(String contractCode) {
        this.contractCode = contractCode;
    }

    public String getContractAbbr() {
        return contractAbbr;
    }

    public void setContractAbbr(String contractAbbr) {
        this.contractAbbr = contractAbbr;
    }

    public String getContractName() {
        return contractName;
    }

    public void setContractName(String contractName) {
        this.contractName = contractName;
    }

    public String getMarketCode() {
        return marketCode;
    }

    public void setMarketCode(String marketCode) {
        this.marketCode = marketCode;
    }

    public String getContractType() {
        return contractType;
    }

    public void setContractType(String contractType) {
        this.contractType = contractType;
    }

    public String getOptionCode() {
        return optionCode;
    }

    public void setOptionCode(String optionCode) {
        this.optionCode = optionCode;
    }

    public String getIfReal() {
        return ifReal;
    }

    public void setIfReal(String ifReal) {
        this.ifReal = ifReal;
    }

    public String getCmvalue() {
        return cmvalue;
    }

    public void setCmvalue(String cmvalue) {
        this.cmvalue = cmvalue;
    }

    public String getContractMultiplier() {
        return contractMultiplier;
    }

    public void setContractMultiplier(String contractMultiplier) {
        this.contractMultiplier = contractMultiplier;
    }

    public String getPriceUnit() {
        return priceUnit;
    }

    public void setPriceUnit(String priceUnit) {
        this.priceUnit = priceUnit;
    }

    public String getLittlestChangeUnit() {
        return littlestChangeUnit;
    }

    public void setLittlestChangeUnit(String littlestChangeUnit) {
        this.littlestChangeUnit = littlestChangeUnit;
    }

    public String getChangePctLimit() {
        return changePctLimit;
    }

    public void setChangePctLimit(String changePctLimit) {
        this.changePctLimit = changePctLimit;
    }

    public String getCurrHcode() {
        return currHcode;
    }

    public void setCurrHcode(String currHcode) {
        this.currHcode = currHcode;
    }

    public String getDeliveryYear() {
        return deliveryYear;
    }

    public void setDeliveryYear(String deliveryYear) {
        this.deliveryYear = deliveryYear;
    }

    public String getDeliveryMonth() {
        return deliveryMonth;
    }

    public void setDeliveryMonth(String deliveryMonth) {
        this.deliveryMonth = deliveryMonth;
    }

    public Date getEffectiveDate() {
        return effectiveDate;
    }

    public void setEffectiveDate(Date effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    public Date getLasttradingDate() {
        return lasttradingDate;
    }

    public void setLasttradingDate(Date lasttradingDate) {
        this.lasttradingDate = lasttradingDate;
    }

    public Date getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(Date deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public Date getLastDeliveryDate() {
        return lastDeliveryDate;
    }

    public void setLastDeliveryDate(Date lastDeliveryDate) {
        this.lastDeliveryDate = lastDeliveryDate;
    }

    public String getDeliveryMethod() {
        return deliveryMethod;
    }

    public void setDeliveryMethod(String deliveryMethod) {
        this.deliveryMethod = deliveryMethod;
    }

    public Double getMinMarginRatio() {
        return minMarginRatio;
    }

    public void setMinMarginRatio(Double minMarginRatio) {
        this.minMarginRatio = minMarginRatio;
    }

    public String getTradingCommission() {
        return tradingCommission;
    }

    public void setTradingCommission(String tradingCommission) {
        this.tradingCommission = tradingCommission;
    }

    public String getDeliveryCommission() {
        return deliveryCommission;
    }

    public void setDeliveryCommission(String deliveryCommission) {
        this.deliveryCommission = deliveryCommission;
    }

    public Double getListBasisPrice() {
        return listBasisPrice;
    }

    public void setListBasisPrice(Double listBasisPrice) {
        this.listBasisPrice = listBasisPrice;
    }

    public String getChangePctlistPrice() {
        return changePctlistPrice;
    }

    public void setChangePctlistPrice(String changePctlistPrice) {
        this.changePctlistPrice = changePctlistPrice;
    }

    public String getContractState() {
        return contractState;
    }

    public void setContractState(String contractState) {
        this.contractState = contractState;
    }

    public String getContractMonth() {
        return contractMonth;
    }

    public void setContractMonth(String contractMonth) {
        this.contractMonth = contractMonth;
    }

    public String getExchangedate() {
        return exchangedate;
    }

    public void setExchangedate(String exchangedate) {
        this.exchangedate = exchangedate;
    }

    public String getSecuHcode() {
        return secuHcode;
    }

    public void setSecuHcode(String secuHcode) {
        this.secuHcode = secuHcode;
    }

    public String getSecuCode() {
        return secuCode;
    }

    public void setSecuCode(String secuCode) {
        this.secuCode = secuCode;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getSecuType() {
        return secuType;
    }

    public void setSecuType(String secuType) {
        this.secuType = secuType;
    }

    public String getSecuName() {
        return secuName;
    }

    public void setSecuName(String secuName) {
        this.secuName = secuName;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getEsname() {
        return esname;
    }

    public void setEsname(String esname) {
        this.esname = esname;
    }

    public String getPyName() {
        return pyName;
    }

    public void setPyName(String pyName) {
        this.pyName = pyName;
    }

    public String getSecType() {
        return secType;
    }

    public void setSecType(String secType) {
        this.secType = secType;
    }

    public String getSecClass1() {
        return secClass1;
    }

    public void setSecClass1(String secClass1) {
        this.secClass1 = secClass1;
    }

    public String getSecClass2() {
        return secClass2;
    }

    public void setSecClass2(String secClass2) {
        this.secClass2 = secClass2;
    }

    public String getSecClass3() {
        return secClass3;
    }

    public void setSecClass3(String secClass3) {
        this.secClass3 = secClass3;
    }

    public String getCombSymbol() {
        return combSymbol;
    }

    public void setCombSymbol(String combSymbol) {
        this.combSymbol = combSymbol;
    }

    public String getListStatus() {
        return listStatus;
    }

    public void setListStatus(String listStatus) {
        this.listStatus = listStatus;
    }

    public Date getListDate() {
        return listDate;
    }

    public void setListDate(Date listDate) {
        this.listDate = listDate;
    }

    public Date getDelistDate() {
        return delistDate;
    }

    public void setDelistDate(Date delistDate) {
        this.delistDate = delistDate;
    }

    public FuturesPrice getDayPrice() {
        return dayPrice;
    }

    public void setDayPrice(FuturesPrice dayPrice) {
        this.dayPrice = dayPrice;
    }

    public FuturesPrice getLastTradingDayPrice() {
        return lastTradingDayPrice;
    }

    public void setLastTradingDayPrice(FuturesPrice lastTradingDayPrice) {
        this.lastTradingDayPrice = lastTradingDayPrice;
    }
}
