package com.iquantex.ts.cre.data.model;

import com.iquantex.ts.cre.data.process.message.protobuf.REDataStock;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

/**
 * Created by Carl on 2019/8/30.
 */
@Getter
@Setter
public class StockPrice {
    /**
     * 交易日期
     */
    private Date tradeDate;

    /**
     * 数据来源
     */
    private String dataSrc;

    /**
     * 币种
     */
    private String currHcode;

    /**
     * 昨收盘
     */
    private Double lclosePrice;

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
     * 成交量
     */
    private Double dealVol;

    /**
     * 成交金额
     */
    private Double dealAmt;

    public StockPrice parserPbBean(REDataStock.StockPrice bean) {
        StockPrice value = this;
        value.setTradeDate(new Date(bean.getTradeDate()));
        value.setDataSrc(bean.getDataSrc());
        value.setCurrHcode(bean.getCurrHcode());
        value.setLclosePrice(bean.getLclosePrice());
        value.setOpenPrice(bean.getOpenPrice());
        value.setHighPrice(bean.getHighPrice());
        value.setLowPrice(bean.getLowPrice());
        value.setClosePrice(bean.getClosePrice());
        value.setDealVol(bean.getDealVol());
        value.setDealAmt(bean.getDealAmt());
        return value;
    }

}
