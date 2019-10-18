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
public class ExternalBondRating extends ExternalRating {

    private String bondCode;

    private boolean isShortTermRating;

    public ExternalBondRating parserPbBean(REDataBond.ExternalBondRating bean) {
        ExternalBondRating value = this;
        super.parserPbBean(bean.getParent());
        value.setBondCode(bean.getBondCode());
        value.setShortTermRating(bean.getIsShortTermRating());
        return value;
    }

    public static List<ExternalBondRating> parserPbBean(REDataBond.ExternalBondRatings beans) {
        List<ExternalBondRating> values = new ArrayList<>();
        List<REDataBond.ExternalBondRating> itemsList = beans.getItemsList();
        for (REDataBond.ExternalBondRating item : itemsList) {
            values.add(new ExternalBondRating().parserPbBean(item));
        }
        return values;
    }

    public static Map<String, List<ExternalBondRating>> parserPbBean(Map<String, REDataBond.ExternalBondRatings> bean) {
        Map<String, List<ExternalBondRating>> value = new HashMap<>();
        for (Map.Entry<String, REDataBond.ExternalBondRatings> entry : bean.entrySet()) {
            value.put(entry.getKey(), parserPbBean(entry.getValue()));
        }
        return value;
    }

}
