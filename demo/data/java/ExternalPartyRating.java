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
public class ExternalPartyRating extends ExternalRating {

    private String partyCode;

    public ExternalPartyRating parserPbBean(REDataParty.ExternalPartyRating bean) {
        ExternalPartyRating value = this;
        super.parserPbBean(bean.getParent());
        value.setPartyCode(bean.getPartyCode());
        return value;
    }

    public static List<ExternalPartyRating> parserPbBean(REDataParty.ExternalPartyRatings beans) {
        List<ExternalPartyRating> values = new ArrayList<>();
        List<REDataParty.ExternalPartyRating> itemsList = beans.getItemsList();
        for (REDataParty.ExternalPartyRating item : itemsList) {
            values.add(new ExternalPartyRating().parserPbBean(item));
        }
        return values;
    }

    public static Map<String, List<ExternalPartyRating>> parserPbBean(Map<String, REDataParty.ExternalPartyRatings> bean) {
        Map<String, List<ExternalPartyRating>> value = new HashMap<>();
        for (Map.Entry<String, REDataParty.ExternalPartyRatings> entry : bean.entrySet()) {
            value.put(entry.getKey(), parserPbBean(entry.getValue()));
        }
        return value;
    }

}
