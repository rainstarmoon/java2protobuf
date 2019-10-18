package com.iquantex.ts.cre.data.model;

import com.iquantex.ts.cre.data.process.message.protobuf.REDataBond;
import com.iquantex.ts.cre.data.process.message.protobuf.REDataCommon;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class InternalBondRating extends InternalRating {

    private String bondCode;

    private boolean isShortTermRating;

    public InternalBondRating parserPbBean(REDataBond.InternalBondRating bean) {
        InternalBondRating value = this;
        super.parserPbBean(bean.getParent());
        value.setBondCode(bean.getBondCode());
        value.setShortTermRating(bean.getIsShortTermRating());
        return value;
    }

    public static List<InternalBondRating> parserPbBean(List<REDataBond.InternalBondRating> beans) {
        List<InternalBondRating> values = new ArrayList<>();
        for (REDataBond.InternalBondRating bean : beans) {
            values.add(new InternalBondRating().parserPbBean(bean));
        }
        return values;
    }

}
