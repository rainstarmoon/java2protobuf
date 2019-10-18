package com.iquantex.ts.cre.data.model;

import com.iquantex.ts.cre.data.process.message.protobuf.REDataIBCounter;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 交易对手池
 *
 * @author Carl
 */
@Getter
@Setter
public class IBCounterPool {

    private String ibcounterPoolId;

    private Set<String> ibcounterCodeList;

    private List<CounterClsItem> clsItems;

    @Getter
    @Setter
    public static class CounterClsItem {
        private String clsName;

        private List<String> counterClses;

        private List<String> counterLabels;

        private List<String> partyLabels;

        private List<String> partyCounters;

        private List<String> fundCounters;

        public CounterClsItem() {
        }

        public CounterClsItem(String clsName, List<String> counterClses, List<String> counterLabels, List<String> partyLabels, List<String> partyCounters, List<String> fundCounters) {
            this.clsName = clsName;
            this.counterClses = counterClses;
            this.counterLabels = counterLabels;
            this.partyLabels = partyLabels;
            this.partyCounters = partyCounters;
            this.fundCounters = fundCounters;
        }

        public CounterClsItem parserPbBean(REDataIBCounter.CounterClsItem bean) {
            CounterClsItem value = this;
            value.setClsName(bean.getClsName());
            value.setCounterClses(bean.getCounterClsesList());
            value.setCounterLabels(bean.getCounterLabelsList());
            value.setPartyLabels(bean.getPartyLabelsList());
            value.setPartyCounters(bean.getPartyCountersList());
            value.setFundCounters(bean.getFundCountersList());
            return value;
        }

        public static List<CounterClsItem> parserPbBean(List<REDataIBCounter.CounterClsItem> beans) {
            List<CounterClsItem> values = new ArrayList<>();
            for (REDataIBCounter.CounterClsItem item : beans) {
                values.add(new CounterClsItem().parserPbBean(item));
            }
            return values;
        }

    }

    public IBCounterPool parserPbBean(REDataIBCounter.IBCounterPool bean) {
        IBCounterPool value = this;
        value.setIbcounterPoolId(bean.getIbcounterPoolId());
        value.setIbcounterCodeList(new HashSet<>(bean.getIbcounterCodeListList()));
        value.setClsItems(IBCounterPool.CounterClsItem.parserPbBean(bean.getClsItemsList()));
        return value;
    }

}
