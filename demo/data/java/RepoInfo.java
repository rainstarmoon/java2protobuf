package com.iquantex.ts.cre.data.model;

import com.iquantex.ts.cre.data.process.message.protobuf.REDataRepo;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RepoInfo {
    private String secuCode;
    private String marketCode;
    private String secuName;
    private String cname;
    private String combSymbol;

    public RepoInfo parserPbBean(REDataRepo.RepoInfo bean) {
        RepoInfo value = this;
        value.setSecuCode(bean.getSecuCode());
        value.setMarketCode(bean.getMarketCode());
        value.setSecuName(bean.getSecuName());
        value.setCname(bean.getCname());
        value.setCombSymbol(bean.getCombSymbol());
        return value;
    }

}
