package com.iquantex.ts.cre.data.model;

import com.iquantex.ts.cre.data.process.message.protobuf.REDataStock;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Getter
@Setter
public class StockSuspensionInfo {
    /**
     * 组合证券编码
     */
    private String combSymbol;

    /**
     * 交易日期
     */
    private Date tradeDate;

    /**
     * 证券内部编码
     */
    private String secHcode;

    /**
     * 停牌标识
     */
    private String suspSign;

    /**
     * 开始停牌日期
     */
    private Date suspStdate;

    public StockSuspensionInfo parserPbBean(REDataStock.StockSuspensionInfo bean) {
        StockSuspensionInfo value = this;
        value.setCombSymbol(bean.getCombSymbol());
        value.setTradeDate(new Date(bean.getTradeDate()));
        value.setSecHcode(bean.getSecHcode());
        value.setSuspSign(bean.getSuspSign());
        value.setSuspStdate(new Date(bean.getSuspStdate()));
        return value;
    }


    public static Map<String, StockSuspensionInfo> parserPbBean(Map<String, REDataStock.StockSuspensionInfo> bean) {
        Map<String, StockSuspensionInfo> value = new HashMap<>();
        for (Map.Entry<String, REDataStock.StockSuspensionInfo> entry : bean.entrySet()) {
            value.put(entry.getKey(), new StockSuspensionInfo().parserPbBean(entry.getValue()));
        }
        return value;
    }

}
