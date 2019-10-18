package com.iquantex.ts.cre.data.model;

import com.iquantex.ts.cre.data.process.message.protobuf.REDataBond;
import com.iquantex.ts.cre.data.process.message.protobuf.REDataCommon;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

/**
 * 内部债项评级(新体系)
 *
 * @author Carl
 */
@Getter
@Setter
public class NewInternalBondRating extends InternalRating {

    private String bondCode;

    public NewInternalBondRating parserPbBean(REDataBond.NewInternalBondRating bean) {
        NewInternalBondRating value = this;
        super.parserPbBean(bean.getParent());
        value.setBondCode(bean.getBondCode());
        return value;
    }

    public static List<NewInternalBondRating> parserPbBean(List<REDataBond.NewInternalBondRating> beans) {
        List<NewInternalBondRating> values = new ArrayList<>();
        for (REDataBond.NewInternalBondRating bean : beans) {
            values.add(new NewInternalBondRating().parserPbBean(bean));
        }
        return values;
    }

}
