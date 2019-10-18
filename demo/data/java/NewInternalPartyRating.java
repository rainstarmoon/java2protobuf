package com.iquantex.ts.cre.data.model;

import com.iquantex.ts.cre.data.process.message.protobuf.REDataParty;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

/**
 * 主体内部评级(新体系)
 *
 * @author Carl
 */
@Getter
@Setter
public class NewInternalPartyRating extends InternalRating {

    private String partyCode;

    public NewInternalPartyRating parserPbBean(REDataParty.NewInternalPartyRating bean) {
        NewInternalPartyRating value = this;
        super.parserPbBean(bean.getParent());
        value.setPartyCode(bean.getPartyCode());
        return value;
    }

    public static List<NewInternalPartyRating> parserPbBean(List<REDataParty.NewInternalPartyRating> beans) {
        List<NewInternalPartyRating> values = new ArrayList<>();
        for (REDataParty.NewInternalPartyRating bean : beans) {
            values.add(new NewInternalPartyRating().parserPbBean(bean));
        }
        return values;
    }

}
