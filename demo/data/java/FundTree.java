package com.iquantex.ts.cre.data.model;

import com.iquantex.ts.cre.data.process.message.protobuf.REDataFund;
import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;
import java.util.Map;

/**
 * @author devin.chung
 * @create: 2018/10/15 17:19
 */
@Getter
@Setter
public class FundTree {

    private String fundCode;

    private Map<String, FundTreeNode> treeNodes = new HashMap<>();

    public FundTree parserPbBean(REDataFund.FundTree bean) {
        FundTree value = this;
        value.setFundCode(bean.getFundCode());
        value.setTreeNodes(FundTreeNode.parserPbBean(bean.getTreeNodesMap()));
        return value;
    }

}
