package com.iquantex.ts.cre.data.model;

import com.iquantex.ts.cre.data.process.message.protobuf.REDataBond;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Deprecated
@Getter
@Setter
public class BondCashFlow {

    /**
     * 现金流类型
     */
    private int valueType;

    /**
     * 开始时间
     */
    private Date startDate;

    /**
     * 结束时间
     */
    private Date endDate;

    /**
     * 派息/兑付日期
     */
    private Date PMTDate;

    /**
     * 每百元面额付息
     */
    private double interestRate;

    /**
     * 每百元面额兑付现金
     */
    private double cash;

    public BondCashFlow parserPbBean(REDataBond.BondCashFlow bean) {
        BondCashFlow value = this;
        value.setValueType(bean.getValueType());
        value.setStartDate(new Date(bean.getStartDate()));
        value.setEndDate(new Date(bean.getEndDate()));
        value.setPMTDate(new Date(bean.getPMTDate()));
        value.setInterestRate(bean.getInterestRate());
        value.setCash(bean.getCash());
        return value;
    }

    public static Map<Date, BondCashFlow> parserPbBean(Map<Long, REDataBond.BondCashFlow> bean) {
        Map<Date, BondCashFlow> value = new HashMap<>();
        for (Map.Entry<Long, REDataBond.BondCashFlow> entry : bean.entrySet()) {
            value.put(new Date(entry.getKey()), new BondCashFlow().parserPbBean(entry.getValue()));
        }
        return value;
    }

}
