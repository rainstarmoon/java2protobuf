package com.iquantex.ts.cre.data.model;

import com.iquantex.ts.cre.data.process.message.protobuf.REDataFund;
import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;
import java.util.Map;

/**
 * @author devin.chung
 * @create: 2018/10/15 17:12
 */
@Getter
@Setter
public class FundTreeNode {
    private String code;

    private String pCode;

    private int type;

    private String name;

    private String sname;

    private String fundCode;

    public FundTreeNode parserPbBean(REDataFund.FundTreeNode bean) {
        FundTreeNode value = this;
        value.setCode(bean.getCode());
        value.setPCode(bean.getPCode());
        value.setType(bean.getType());
        value.setName(bean.getName());
        value.setSname(bean.getSname());
        value.setFundCode(bean.getFundCode());
        return value;
    }

    public static Map<String, FundTreeNode> parserPbBean(Map<String, REDataFund.FundTreeNode> bean) {
        Map<String, FundTreeNode> value = new HashMap<>();
        for (Map.Entry<String, REDataFund.FundTreeNode> entry : bean.entrySet()) {
            value.put(entry.getKey(), new FundTreeNode().parserPbBean(entry.getValue()));
        }
        return value;
    }

}

