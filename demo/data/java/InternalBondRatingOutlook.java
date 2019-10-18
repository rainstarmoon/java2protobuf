package com.iquantex.ts.cre.data.model;

import com.iquantex.ts.cre.data.process.message.protobuf.REDataBond;
import com.iquantex.ts.cre.data.process.message.protobuf.REDataCommon;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class InternalBondRatingOutlook extends InternalRating {

    private String bondCode;

    public InternalBondRatingOutlook parserPbBean(REDataBond.InternalBondRatingOutlook bean) {
        InternalBondRatingOutlook value = this;
        super.parserPbBean(bean.getParent());
        value.setBondCode(bean.getBondCode());
        return value;
    }

    public static List<InternalBondRatingOutlook> parserPbBean(List<REDataBond.InternalBondRatingOutlook> beans) {
        List<InternalBondRatingOutlook> values = new ArrayList<>();
        for (REDataBond.InternalBondRatingOutlook bean : beans) {
            values.add(new InternalBondRatingOutlook().parserPbBean(bean));
        }
        return values;
    }

}
