package com.iquantex.ts.cre.data.model;

import java.util.Date;

/**
 * Created by Carl on 2019/8/30.
 */
public class FuturesPrice {
//    /**
//     * 期货内部代码
//     */
//    private String futHcode;
//
//    /**
//     * 咨询商内部编码
//     */
//    private Integer innercode;

    /**
     * 交易日期
     */
    private Date tradeDate;

    /**
     * 合约名称/编码
     */
    private String ctrName;

//    /**
//     * 品种代码/合约标的
//     */
//    private Integer optionCode;

    /**
     * 前结算
     */
    private Double lsettlePrice;

    /**
     * 开盘价
     */
    private Double openPrice;

    /**
     * 最高价
     */
    private Double highPrice;

    /**
     * 最低价
     */
    private Double lowPrice;

    /**
     * 收盘价
     */
    private Double closePrice;

    /**
     * 结算价
     */
    private Double settlePrice;

    /**
     * 收盘价涨跌幅(%)
     */
    private Double changePct;

    /**
     * 持仓量(手)
     */
    private Long openInterest;

    /**
     * 成交量(手)
     */
    private Long dealVol;

    /**
     * 成交金额(元)
     */
    private Double dealAmt;

    /**
     * 基差, 当“合约类型”为股指期货，基差 = 期货市场收盘价-现货市场收盘价
     */
    private Double basisValue;

    public Date getTradeDate() {
        return tradeDate;
    }

    public void setTradeDate(Date tradeDate) {
        this.tradeDate = tradeDate;
    }

    public String getCtrName() {
        return ctrName;
    }

    public void setCtrName(String ctrName) {
        this.ctrName = ctrName;
    }

    public Double getLsettlePrice() {
        return lsettlePrice;
    }

    public void setLsettlePrice(Double lsettlePrice) {
        this.lsettlePrice = lsettlePrice;
    }

    public Double getOpenPrice() {
        return openPrice;
    }

    public void setOpenPrice(Double openPrice) {
        this.openPrice = openPrice;
    }

    public Double getHighPrice() {
        return highPrice;
    }

    public void setHighPrice(Double highPrice) {
        this.highPrice = highPrice;
    }

    public Double getLowPrice() {
        return lowPrice;
    }

    public void setLowPrice(Double lowPrice) {
        this.lowPrice = lowPrice;
    }

    public Double getClosePrice() {
        return closePrice;
    }

    public void setClosePrice(Double closePrice) {
        this.closePrice = closePrice;
    }

    public Double getSettlePrice() {
        return settlePrice;
    }

    public void setSettlePrice(Double settlePrice) {
        this.settlePrice = settlePrice;
    }

    public Double getChangePct() {
        return changePct;
    }

    public void setChangePct(Double changePct) {
        this.changePct = changePct;
    }

    public Long getOpenInterest() {
        return openInterest;
    }

    public void setOpenInterest(Long openInterest) {
        this.openInterest = openInterest;
    }

    public Long getDealVol() {
        return dealVol;
    }

    public void setDealVol(Long dealVol) {
        this.dealVol = dealVol;
    }

    public Double getDealAmt() {
        return dealAmt;
    }

    public void setDealAmt(Double dealAmt) {
        this.dealAmt = dealAmt;
    }

    public Double getBasisValue() {
        return basisValue;
    }

    public void setBasisValue(Double basisValue) {
        this.basisValue = basisValue;
    }
}
