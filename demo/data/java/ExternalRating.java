package com.iquantex.ts.cre.data.model;

import com.iquantex.ts.cre.data.process.message.protobuf.REDataCommon;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ExternalRating extends Rating {

    /**
     * 评级机构
     */
    private String party;

    /**
     * 是否证监会认可评级机构
     */
    private boolean isCSRCRecoed;

    /**
     * 是否交易商协会认可评级机构
     */
    private boolean isNAFMIIRecoed;

    /**
     * 是否发改委认可评级机构
     */
    private boolean isNDRCRecoed;

    public ExternalRating parserPbBean(REDataCommon.ExternalRating bean) {
        ExternalRating value = this;
        super.parserPbBean(bean.getParent());
        value.setParty(bean.getParty());
        value.setCSRCRecoed(bean.getIsCSRCRecoed());
        value.setNAFMIIRecoed(bean.getIsNAFMIIRecoed());
        value.setNDRCRecoed(bean.getIsNDRCRecoed());
        return value;
    }

}
