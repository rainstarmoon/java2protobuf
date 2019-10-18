package com.iquantex.ts.cre.data.model;

import com.iquantex.ts.cre.data.process.message.protobuf.REDataParty;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Getter
@Setter
public class ExternalPartyRatingOutlook extends ExternalRating {

    private String partyCode;

    public ExternalPartyRatingOutlook parserPbBean(REDataParty.ExternalPartyRatingOutlook bean) {
        ExternalPartyRatingOutlook value = this;
        super.parserPbBean(bean.getParent());
        value.setPartyCode(bean.getPartyCode());
        return value;
    }

    public static List<ExternalPartyRatingOutlook> parserPbBean(REDataParty.ExternalPartyRatingOutlooks beans) {
        List<ExternalPartyRatingOutlook> values = new ArrayList<>();
        List<REDataParty.ExternalPartyRatingOutlook> itemsList = beans.getItemsList();
        for (REDataParty.ExternalPartyRatingOutlook item : itemsList) {
            values.add(new ExternalPartyRatingOutlook().parserPbBean(item));
        }
        return values;
    }

    public static Map<String, List<ExternalPartyRatingOutlook>> parserPbBean(Map<String, REDataParty.ExternalPartyRatingOutlooks> bean) {
        Map<String, List<ExternalPartyRatingOutlook>> value = new HashMap<>();
        for (Map.Entry<String, REDataParty.ExternalPartyRatingOutlooks> entry : bean.entrySet()) {
            value.put(entry.getKey(), parserPbBean(entry.getValue()));
        }
        return value;
    }

}
