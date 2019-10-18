package com.iquantex.ts.cre.data.model;

import com.iquantex.ts.cre.data.process.message.protobuf.REDataPool;
import lombok.Getter;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by devin on 2017/9/26.
 */
@Getter
@Setter
public class SecuPool {

    private String poolId;

    private Set<String> codeList;

    public SecuPool parserPbBean(REDataPool.SecuPool bean) {
        SecuPool value = this;
        value.setPoolId(bean.getPoolId());
        value.setCodeList(new HashSet<>(bean.getCodeListList()));
        return value;
    }

}
