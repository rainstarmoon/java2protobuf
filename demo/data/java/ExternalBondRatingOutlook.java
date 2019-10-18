package com.iquantex.ts.cre.data.model;

import com.iquantex.ts.cre.data.process.message.protobuf.REDataBond;
import com.iquantex.ts.cre.data.process.message.protobuf.REDataCommon;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Getter
@Setter
public class ExternalBondRatingOutlook extends ExternalRating {

    private String bondCode;

    private boolean isShortTermRatingOutlook;

    public ExternalBondRatingOutlook parserPbBean(REDataBond.ExternalBondRatingOutlook bean) {
        ExternalBondRatingOutlook value = this;
        super.parserPbBean(bean.getParent());
        value.setBondCode(bean.getBondCode());
        value.setShortTermRatingOutlook(bean.getIsShortTermRatingOutlook());
        return value;
    }

    public static List<ExternalBondRatingOutlook> parserPbBean(REDataBond.ExternalBondRatingOutlooks beans) {
        List<ExternalBondRatingOutlook> values = new ArrayList<>();
        List<REDataBond.ExternalBondRatingOutlook> itemsList = beans.getItemsList();
        for (REDataBond.ExternalBondRatingOutlook item : itemsList) {
            values.add(new ExternalBondRatingOutlook().parserPbBean(item));
        }
        return values;
    }

    public static Map<String, List<ExternalBondRatingOutlook>> parserPbBean(Map<String, REDataBond.ExternalBondRatingOutlooks> bean) {
        Map<String, List<ExternalBondRatingOutlook>> value = new HashMap<>();
        for (Map.Entry<String, REDataBond.ExternalBondRatingOutlooks> entry : bean.entrySet()) {
            value.put(entry.getKey(), parserPbBean(entry.getValue()));
        }
        return value;
    }

}
