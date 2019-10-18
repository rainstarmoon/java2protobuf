package com.iquantex.ts.cre.data.model;

import com.iquantex.ts.cre.data.process.message.protobuf.REDataCommonRef;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dingzj on 2017/12/9.
 */
@Getter
@Setter
public class BondClass {

    private String secClass;

    private String pareSecClass;

    private Integer classLevel;

    public BondClass parserPbBean(REDataCommonRef.BondClass bean) {
        BondClass value = this;
        value.setSecClass(bean.getSecClass());
        value.setPareSecClass(bean.getPareSecClass());
        value.setClassLevel(bean.getClassLevel());
        return value;
    }

    public static List<BondClass> parserPbBean(List<REDataCommonRef.BondClass> beans) {
        List<BondClass> values = new ArrayList<>();
        for (REDataCommonRef.BondClass item : beans) {
            values.add(new BondClass().parserPbBean(item));
        }
        return values;
    }

}
