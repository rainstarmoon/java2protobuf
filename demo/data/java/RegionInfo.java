package com.iquantex.ts.cre.data.model;

import com.iquantex.ts.cre.data.process.message.protobuf.REDataRegion;
import lombok.Getter;
import lombok.Setter;

/**
 * 地域信息
 * <p>
 * Created by devin on 2018/8/22.
 */
@Getter
@Setter
public class RegionInfo {

    private String code;

    private String parentCode;

    private String level;

    private String cname;

    private String csname;

    private String ename;

    private String esname;

    public RegionInfo parserPbBean(REDataRegion.RegionInfo bean) {
        RegionInfo value = this;
        value.setCode(bean.getCode());
        value.setParentCode(bean.getParentCode());
        value.setLevel(bean.getLevel());
        value.setCname(bean.getCname());
        value.setCsname(bean.getCsname());
        value.setEname(bean.getEname());
        value.setEsname(bean.getEsname());
        return value;
    }

}
