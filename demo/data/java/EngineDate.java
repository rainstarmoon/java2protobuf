package com.iquantex.ts.cre.data.model;

import com.iquantex.ts.cre.data.process.message.protobuf.REDataEngine;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class EngineDate {

    private Date curDate;

    public EngineDate parserPbBean(REDataEngine.EngineDate bean) {
        EngineDate value = this;
        value.setCurDate(new Date(bean.getCurDate()));
        return value;
    }

}
