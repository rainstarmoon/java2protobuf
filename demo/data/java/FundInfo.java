package com.iquantex.ts.cre.data.model;

import com.iquantex.ts.cre.data.process.message.protobuf.REDataFund;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;
import java.util.Map;

@Getter
@Setter
public class FundInfo {

    private String fundCode;

    @Deprecated
    private String iaCode;

    private String parent;

    private String name;

    private String assetUnitCode;

    private String companyCode;

    private Date startDate;

    private Date valueDate;

    private boolean isMoneyFund;

    private boolean isPublicFund;

    private boolean isSocialFund;

    private String custodianBank;

    private List<FundSharesOnDate> listOfShares;

    /**
     * 产品存款利率
     */
    private Double depositeRate;

    /**
     * 是否禁投BB池     IA_BOND_POOL_CONFIG
     */
    @Deprecated
    private boolean isIABBPool;

    /**
     * 是否禁投BB池风险等级     IA_IIT_FC_ART_BATCH_TYPE
     * 是否低风险
     */
    @Deprecated
    private boolean isIALowRisk;

    /**
     * 组合风险级别
     */
    private String riskLevel;

    /**
     * 前10大持有人份额占有比例（前一日）
     */
    private Double top10RatioYesterday;

    /**
     * 当天前10大持有人份额占有比例
     */
    private Double top10RatioToday;

    /**
     * 产品状态
     * 0 - 正常开放
     * 1 - 周期性封闭
     * 2 - 停止申购，仅允许赎回
     * 3 - 停止赎回，仅允许申购
     * 4 - 终止
     * 5 - 正在发行
     * 6 - 发行失败
     */
    private Integer prodStatus;

    /**
     * 当前阶段的开始日期
     */
    private Date beginDate;

    /**
     * 当前阶段的结束日期
     */
    private Date endDate;

    /**
     * 中债登持有人账号
     */
    private String ibAccountNum;

    /**
     * 中债登DVP收款人账号
     */
    private String ibDvpPayeeNum;

    /**
     * 上清所只有人账号
     */
    private String shchAccountNum;

    /**
     * 上清所DVP资金清算账号
     */
    private String shchDvpPayeeNum;

    /**
     * 产品要素
     */
    private Map<String, String> mFundElements;

    public FundInfo parserPbBean(REDataFund.FundInfo bean) {
        FundInfo value = this;
        value.setFundCode(bean.getFundCode());
        value.setIaCode(bean.getIaCode());
        value.setParent(bean.getParent());
        value.setName(bean.getName());
        value.setAssetUnitCode(bean.getAssetUnitCode());
        value.setCompanyCode(bean.getCompanyCode());
        value.setStartDate(new Date(bean.getStartDate()));
        value.setValueDate(new Date(bean.getValueDate()));
        value.setMoneyFund(bean.getIsMoneyFund());
        value.setPublicFund(bean.getIsPublicFund());
        value.setSocialFund(bean.getIsSocialFund());
        value.setCustodianBank(bean.getCustodianBank());
        value.setListOfShares(FundSharesOnDate.parserPbBean(bean.getListOfSharesList()));
        value.setDepositeRate(bean.getDepositeRate());
        value.setIABBPool(bean.getIsIABBPool());
        value.setIALowRisk(bean.getIsIALowRisk());
        value.setRiskLevel(bean.getRiskLevel());
        value.setTop10RatioYesterday(bean.getTop10RatioYesterday());
        value.setTop10RatioToday(bean.getTop10RatioToday());
        value.setProdStatus(bean.getProdStatus());
        value.setBeginDate(new Date(bean.getBeginDate()));
        value.setEndDate(new Date(bean.getEndDate()));
        value.setIbAccountNum(bean.getIbAccountNum());
        value.setIbDvpPayeeNum(bean.getIbDvpPayeeNum());
        value.setShchAccountNum(bean.getShchAccountNum());
        value.setShchDvpPayeeNum(bean.getShchDvpPayeeNum());
        value.setMFundElements(bean.getMFundElementsMap());
        return value;
    }

}
