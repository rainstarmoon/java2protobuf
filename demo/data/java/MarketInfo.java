package com.iquantex.ts.cre.data.model;

import com.iquantex.ts.cre.data.process.message.protobuf.REDataMarket;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by devin on 2017/9/29.
 */
@Getter
@Setter
public class MarketInfo {

    /**
     * 市场编码
     */
    private String marketCode;

    /**
     * 地域编码
     */
    private String regionCode;

    /**
     * 市场状态<>normal=0=正常交易&settling=1=清算中&settleend=2=清算完成&stop=3=暂停交易
     */
    private Integer status;

    /**
     * 中文全称
     */
    private String cname;

    private String csname;

    /**
     * 英文全称
     */
    private String ename;

    private String esname;

    /**
     * ISO 代码
     */
    private String isoCode;

    /**
     * 当前交易日
     */
    private Date curTradeDate;

    /**
     * 日历编码
     */
    private String dateCode;

    /**
     * 交易日列表
     */
    private List<Date> tradeDateList;

    /**
     * 正常交易
     */
    public static final Integer c_status_normal = 0;

    /**
     * 清算中
     */
    public static final Integer c_status_settling = 1;

    /**
     * 清算完成
     */
    public static final Integer c_status_settleend = 2;

    /**
     * 暂停交易
     */
    public static final Integer c_status_stop = 3;

    public MarketInfo parserPbBean(REDataMarket.MarketInfo bean) {
        MarketInfo value = this;
        value.setMarketCode(bean.getMarketCode());
        value.setRegionCode(bean.getRegionCode());
        value.setStatus(bean.getStatus());
        value.setCname(bean.getCname());
        value.setCsname(bean.getCsname());
        value.setEname(bean.getEname());
        value.setEsname(bean.getEsname());
        value.setIsoCode(bean.getIsoCode());
        value.setCurTradeDate(new Date(bean.getCurTradeDate()));
        value.setDateCode(bean.getDateCode());
        List<Date> tradeDateList = new ArrayList<>();
        for (Long date : bean.getTradeDateListList()) {
            tradeDateList.add(new Date(date));
        }
        value.setTradeDateList(tradeDateList);
        return value;
    }

}
