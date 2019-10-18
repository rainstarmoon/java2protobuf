package com.iquantex.ts.cre.data.model;

import com.iquantex.ts.cre.data.process.message.protobuf.REDataParty;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class InternalPartyRatingOutlook extends InternalRating {

    private String partyCode;


    public InternalPartyRatingOutlook parserPbBean(REDataParty.InternalPartyRatingOutlook bean) {
        InternalPartyRatingOutlook value = this;
        super.parserPbBean(bean.getParent());
        value.setPartyCode(bean.getPartyCode());
        return value;
    }

    public static List<InternalPartyRatingOutlook> parserPbBean(List<REDataParty.InternalPartyRatingOutlook> beans) {
        List<InternalPartyRatingOutlook> values = new ArrayList<>();
        for (REDataParty.InternalPartyRatingOutlook bean : beans) {
            values.add(new InternalPartyRatingOutlook().parserPbBean(bean));
        }
        return values;
    }

}
