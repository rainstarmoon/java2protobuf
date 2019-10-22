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

    public REDataFund.FundInfo convertPbBean() {
        FundInfo value = this;
        REDataFund.FundInfo.Builder builder = REDataFund.FundInfo.newBuilder();
        if (value.getFundCode() != null) {
            builder.setFundCode(value.getFundCode());
        }
        if (value.getIaCode() != null) {
            builder.setIaCode(value.getIaCode());
        }
        if (value.getParent() != null) {
            builder.setParent(value.getParent());
        }
        if (value.getName() != null) {
            builder.setName(value.getName());
        }
        if (value.getAssetUnitCode() != null) {
            builder.setAssetUnitCode(value.getAssetUnitCode());
        }
        if (value.getCompanyCode() != null) {
            builder.setCompanyCode(value.getCompanyCode());
        }
        if (value.getStartDate() != null) {
            builder.setStartDate(value.getStartDate().getTime());
        }
        if (value.getValueDate() != null) {
            builder.setValueDate(value.getValueDate().getTime());
        }
        builder.setIsMoneyFund(value.isMoneyFund());
        builder.setIsPublicFund(value.isPublicFund());
        builder.setIsSocialFund(value.isSocialFund());
        if (value.getCustodianBank() != null) {
            builder.setCustodianBank(value.getCustodianBank());
        }
        if (value.getListOfShares() != null) {
            builder.addAllListOfShares(value.getListOfShares());
        }
        if (value.getDepositeRate() != null) {
            builder.setDepositeRate(value.getDepositeRate());
        }
        builder.setIsIABBPool(value.isIABBPool());
        builder.setIsIALowRisk(value.isIALowRisk());
        if (value.getRiskLevel() != null) {
            builder.setRiskLevel(value.getRiskLevel());
        }
        if (value.getTop10RatioYesterday() != null) {
            builder.setTop10RatioYesterday(value.getTop10RatioYesterday());
        }
        if (value.getTop10RatioToday() != null) {
            builder.setTop10RatioToday(value.getTop10RatioToday());
        }
        if (value.getProdStatus() != null) {
            builder.setProdStatus(value.getProdStatus());
        }
        if (value.getBeginDate() != null) {
            builder.setBeginDate(value.getBeginDate().getTime());
        }
        if (value.getEndDate() != null) {
            builder.setEndDate(value.getEndDate().getTime());
        }
        if (value.getIbAccountNum() != null) {
            builder.setIbAccountNum(value.getIbAccountNum());
        }
        if (value.getIbDvpPayeeNum() != null) {
            builder.setIbDvpPayeeNum(value.getIbDvpPayeeNum());
        }
        if (value.getShchAccountNum() != null) {
            builder.setShchAccountNum(value.getShchAccountNum());
        }
        if (value.getShchDvpPayeeNum() != null) {
            builder.setShchDvpPayeeNum(value.getShchDvpPayeeNum());
        }
        if (value.getMFundElements() != null) {
            builder.putAllMFundElements(value.getMFundElements());
        }
        return builder.build();
    }

}
