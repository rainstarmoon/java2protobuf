package com.iquantex.ts.cre.data.model;

import com.iquantex.ts.cre.data.process.message.protobuf.REDataParty;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class InternalPartyRating extends InternalRating {

    private String partyCode;

    public InternalPartyRating parserPbBean(REDataParty.InternalPartyRating bean) {
        InternalPartyRating value = this;
        super.parserPbBean(bean.getParent());
        value.setPartyCode(bean.getPartyCode());
        return value;
    }

    public static List<InternalPartyRating> parserPbBean(List<REDataParty.InternalPartyRating> beans) {
        List<InternalPartyRating> values = new ArrayList<>();
        for (REDataParty.InternalPartyRating bean : beans) {
            values.add(new InternalPartyRating().parserPbBean(bean));
        }
        return values;
    }

}
