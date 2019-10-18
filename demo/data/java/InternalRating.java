package com.iquantex.ts.cre.data.model;

import com.iquantex.ts.cre.data.process.message.protobuf.REDataCommon;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class InternalRating extends Rating {

    public InternalRating parserPbBean(REDataCommon.InternalRating bean) {
        InternalRating value = this;
        super.parserPbBean(bean.getParent());
        return value;
    }

}
