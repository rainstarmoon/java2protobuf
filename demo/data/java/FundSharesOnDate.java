package com.iquantex.ts.cre.data.model;

import com.iquantex.ts.cre.data.process.message.protobuf.REDataFund;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Getter
@Setter
public class FundSharesOnDate {
    private Date date;
    //期初份额
    private Double psShares;
    //当日的份额
    private Double totalShares;
    //当日的赎回量(包括赎回和基金转出)
    private Double redeemShares;
    //当日的申购量（包括申购、基金转入和再投资）
    private Double createShares;

    public FundSharesOnDate parserPbBean(REDataFund.FundSharesOnDate bean) {
        FundSharesOnDate value = this;
        value.setDate(new Date(bean.getDate()));
        value.setPsShares(bean.getPsShares());
        value.setTotalShares(bean.getTotalShares());
        value.setRedeemShares(bean.getRedeemShares());
        value.setCreateShares(bean.getCreateShares());
        return value;
    }

    public static List<FundSharesOnDate> parserPbBean(List<REDataFund.FundSharesOnDate> beans) {
        List<FundSharesOnDate> values = new ArrayList<>();
        for (REDataFund.FundSharesOnDate item : beans) {
            values.add(new FundSharesOnDate().parserPbBean(item));
        }
        return values;
    }

}
