package com.iquantex.ts.cre.data.model;

import com.iquantex.ts.cre.data.process.message.protobuf.REDataParty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.Map;

/**
 * Created by zero on 2017/7/27.
 */
@Getter
@Setter
public class PartyInfo {
    /**
     * 主体内部编码
     */
    private String code;

    /**
     * 中文名称
     */
    private String cname;

    /**
     * 注册地编码
     */
    private String regRegionCode;

    /**
     * 申万行业分类一级
     */
    private String swIndustryClass1;

    /**
     * 申万行业分类二级
     */
    private String swIndustryClass2;

    /**
     * 申万行业三级分类级
     */
    private String swIndustryClass3;

    /**
     * 经济性质
     */
    private String ecoType;

    /**
     * 机构性质
     */
    private String partyType;

    /**
     * 聚源的机构代码
     */
    @Deprecated
    private String jyCode;

    /**
     * 主体标签
     */
    private List<String> labels;

    /**
     * 主体所有外部评级<评级机构，具体评级>
     */
    private Map<String, List<ExternalPartyRating>> externalPartyRatingAll;

    /**
     * 主体所有内部评级
     */
    private List<InternalPartyRating> internalPartyRatingAll;

    /**
     * 主体所有内部评级(新体系)
     */
    private List<NewInternalPartyRating> newInternalPartyRatingAll;

    /**
     * 主体所有外部评级展望
     */
    private Map<String, List<ExternalPartyRatingOutlook>> externalPartyRatingOutlookAll;

    /**
     * 主体所有内部评级展望
     */
    private List<InternalPartyRatingOutlook> internalPartyRatingOutlookAll;

//	/**
//	 * 外部默认主体评级的机构
//	 * 
//	 */
//	private String externalRatingParty;
//
//	/**
//	 * 外部默认评级
//	 */
//	private String externalRating;
//
//	/**
//	 * 外部默认评级展望
//	 */
//	private String externalOutlook;
//
//	/**
//	 * 内部默认评级（内部评级有长短之分）
//	 */
//	private String internalRating;
//
//	/**
//	 * 内部默认评级展望
//	 */
//	private String internalOutlook;

    /**
     * 中金主体评级
     */
    private String CIICPartyRating;

    /**
     * 所有发行债券总规模
     */
    private Double totalBondAmt;

    /**
     * 作为原始权益人的ABS发行
     */
    private Double totalOriginBondAmt;

    /**
     * 净资产
     */
    private Double netAsset;

    /**
     * 总资产
     */
    private Double aggregatedAsset;

    /**
     * 资产充足率
     */
    private Double assetAdequacy;

    /**
     * 存款总规模
     */
    private Double totalDeposit;

    /**
     * 拨备覆盖率
     */
    private Double provisionCoverage;

    /**
     * 资产负债率
     */
    private Double debt2Assets;

    /**
     * 是否地方政府融资平台
     */
    private boolean isGovFiPlatform;

    /**
     * 是否上市
     */
    private boolean isListed;

    /**
     * 是否股份制
     */
    private boolean isShareHoldingCompany;

    /**
     * 是否具有基金托管资格
     */
    private boolean hasFundCustodyPerm;

    /**
     * 是否全国银行间债券市场国债承购包销团成员
     */
    private boolean isIBBondMarketMember;

    /**
     * 是否中国人民银行公开市场业务一级交易商成员
     */
    private boolean isPBCOpenMarkeyMember;

    /**
     * IA里CD允许的银行  iit.ib_bank_range
     */
    @Deprecated
    private boolean isIACDBank;

    /**
     * 该主体作为发行人发行的所有债券
     */
    private List<String> issuedBonds;

    /**
     * 该主体作为原始权益人发起的所有债券
     */
    private List<String> originatedBonds;

    /**
     * 违约债券发行人
     */
    private boolean isBondDefalutParty;

    public PartyInfo parserPbBean(REDataParty.PartyInfo bean) {
        PartyInfo value = this;
        value.setCode(bean.getCode());
        value.setCname(bean.getCname());
        value.setRegRegionCode(bean.getRegRegionCode());
        value.setSwIndustryClass1(bean.getSwIndustryClass1());
        value.setSwIndustryClass2(bean.getSwIndustryClass2());
        value.setSwIndustryClass3(bean.getSwIndustryClass3());
        value.setEcoType(bean.getEcoType());
        value.setPartyType(bean.getPartyType());
        value.setJyCode(bean.getJyCode());
        value.setLabels(bean.getLabelsList());
        value.setExternalPartyRatingAll(ExternalPartyRating.parserPbBean(bean.getExternalPartyRatingAllMap()));
        value.setInternalPartyRatingAll(InternalPartyRating.parserPbBean(bean.getInternalPartyRatingAllList()));
        value.setNewInternalPartyRatingAll(NewInternalPartyRating.parserPbBean(bean.getNewInternalPartyRatingAllList()));
        value.setExternalPartyRatingOutlookAll(ExternalPartyRatingOutlook.parserPbBean(bean.getExternalPartyRatingOutlookAllMap()));
        value.setInternalPartyRatingOutlookAll(InternalPartyRatingOutlook.parserPbBean(bean.getInternalPartyRatingOutlookAllList()));
        value.setCIICPartyRating(bean.getCIICPartyRating());
        value.setTotalBondAmt(bean.getTotalBondAmt());
        value.setTotalOriginBondAmt(bean.getTotalOriginBondAmt());
        value.setNetAsset(bean.getNetAsset());
        value.setAggregatedAsset(bean.getAggregatedAsset());
        value.setAssetAdequacy(bean.getAssetAdequacy());
        value.setTotalDeposit(bean.getTotalDeposit());
        value.setProvisionCoverage(bean.getProvisionCoverage());
        value.setDebt2Assets(bean.getDebt2Assets());
        value.setGovFiPlatform(bean.getIsGovFiPlatform());
        value.setListed(bean.getIsListed());
        value.setShareHoldingCompany(bean.getIsShareHoldingCompany());
        value.setHasFundCustodyPerm(bean.getHasFundCustodyPerm());
        value.setIBBondMarketMember(bean.getIsIBBondMarketMember());
        value.setPBCOpenMarkeyMember(bean.getIsPBCOpenMarkeyMember());
        value.setIACDBank(bean.getIsIACDBank());
        value.setIssuedBonds(bean.getIssuedBondsList());
        value.setOriginatedBonds(bean.getOriginatedBondsList());
        value.setBondDefalutParty(bean.getIsBondDefalutParty());
        return value;
    }

}
