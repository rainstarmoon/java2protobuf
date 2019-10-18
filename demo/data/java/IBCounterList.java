package com.iquantex.ts.cre.data.model;

import com.iquantex.ts.cre.data.process.message.protobuf.REDataIBCounter;
import lombok.Getter;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

/**
 * 交易对手黑白名单
 *
 * @author Carl
 */
@Getter
@Setter
public class IBCounterList {

    private String fundType;

    private Set<String> poolList;

    public IBCounterList parserPbBean(REDataIBCounter.IBCounterList bean) {
        IBCounterList value = this;
        value.setFundType(bean.getFundType());
        value.setPoolList(new HashSet<>(bean.getPoolListList()));
        return value;
    }

}
