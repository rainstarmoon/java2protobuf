package com.iquantex.ts.cre.data.model;

import com.iquantex.ts.cre.data.process.message.protobuf.REDataIBCounter;
import lombok.Getter;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by zero on 2017/7/27.
 */
@Getter
@Setter
public class IBCounterInfo {
    private String code;
    private Set<String> parentCode;
    private String cname;
    private String class1;
    private String class2;
    private String partyHcode;
    private Set<String> labels;

    public IBCounterInfo parserPbBean(REDataIBCounter.IBCounterInfo bean) {
        IBCounterInfo value = this;
        value.setCode(bean.getCode());
        value.setParentCode(new HashSet<>(bean.getParentCodeList()));
        value.setCname(bean.getCname());
        value.setClass1(bean.getClass1());
        value.setClass2(bean.getClass2());
        value.setPartyHcode(bean.getPartyHcode());
        value.setLabels(new HashSet<>(bean.getLabelsList()));
        return value;
    }

}
