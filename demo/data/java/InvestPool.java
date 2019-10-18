package com.iquantex.ts.cre.data.model;

import com.iquantex.ts.cre.data.process.message.protobuf.REDataPool;
import lombok.Getter;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

/**
 * 投向池
 *
 * @author Carl
 */
@Getter
@Setter
public class InvestPool {

    private String fundType;

    private Set<String> poolList;

    public InvestPool parserPbBean(REDataPool.InvestPool bean) {
        InvestPool value = this;
        value.setFundType(bean.getFundType());
        value.setPoolList(new HashSet<>(bean.getPoolListList()));
        return value;
    }

}
