package com.iquantex.ts.cre.data.model;

import com.iquantex.ts.cre.data.process.message.protobuf.REDataBond;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * Created by zero on 2017/7/27.
 */
@Getter
@Setter
public class BondInfo {
    /**
     * 证券代码
     */
    private String secuCode;
    /**
     * 证券代码
     */
    private String bondMHCode;
    /**
     * 证券名称
     */
    private String secuName;
    /**
     * 证券类型
     */
    private String secuType;
    /**
     * 分类1
     */
    private String class1;
    /**
     * 分类2
     */
    private String class2;
    /**
     * 分类3
     */
    private String class3;
    /**
     * 分类4
     */
    private String class4;
    /**
     * 市場
     */
    private String market;
    /**
     * 票面年利率
     */
    private Double parIr;
    /**
     * 债券面值
     */
    private Double parValue;
    /**
     * 发行价格
     */
    private Double issuePrice;
    /**
     * 发行规模
     */
    private Double issueAmt;
    /**
     * 发行人
     */
    private String issuer;
    /**
     * 承销人
     */
    private List<String> underwriter;

    /**
     * 担保人
     */
    private List<String> guarantee;

    /**
     * ABS原始权益人
     */
    private String beneficiary;

    /**
     * ABS原始权益人(多个)
     */
    private List<String> beneficiaries;

    /**
     * 是否公开发行
     */
    private boolean isPublicIssued;

    /**
     * IA TYPE
     */
    @Deprecated
    private String IAType;

    /**
     * 聚源Maincode
     */
    @Deprecated
    private Long jyMainCode;

    /**
     * 聚源innercode
     */
    @Deprecated
    private String jyInnerCode;

    /**
     * 债券公司整体持仓上线
     */
    private Double upRatio;

    // 评级信息
    /**
     * 最近五年债券所有外部评级<评级机构，具体评级>
     */
    private Map<String, List<ExternalBondRating>> externalBondRatingAll;

    /**
     * 最近五年债券所有内部评级
     */
    private List<InternalBondRating> internalBondRatingAll;

    /**
     * 最近五年债券所有内部评级(新体系)
     */
    private List<NewInternalBondRating> newInternalBondRatingAll;

    /**
     * 最近五年债券所有外部评级展望<评级机构，具体评级>
     */
    private Map<String, List<ExternalBondRatingOutlook>> externalBondRatingOutlookAll;

    /**
     * 最近五年债券所有内部评级展望
     */
    private List<InternalBondRatingOutlook> internalBondRatingOutlookAll;

//	/**
//	 * 外部默认债项评级的机构
//	 *
//	 */
//	private String externalRatingParty;
//	/**
//	 * 外部默认债项评级
//	 *
//	 */
//	private String externalRating;
//	/**
//	 * 内部默认债项评级
//	 *
//	 */
//	private String internalRating;
//	/**
//	 * 外部债项展望
//	 *
//	 */
//	private String externalRatingOutlook;
//	/**
//	 * 内部债项展望
//	 *
//	 */
//	private String internalRatingOutlook;
    /**
     * 中金债项评级
     */
    private String CIICRating;
    /**
     * 中债登估值净价
     */
    private Double ChinaBondCleanPrice;
    /**
     * 中债登估值全价
     */
    private Double ChinaBondFullPrice;
    /**
     * 中债登估价收益率
     */
    private Double ChinaBondYield;
    /**
     * 中债登推荐久期
     */
    private Double ChinaBondDuration;
    /**
     * 中证登估价净价
     */
    private Double CSDCNetPrice;
    /**
     * 中证登估价全价
     */
    private Double CSDCFullPrice;
    /**
     * 中证登估价收益率
     */
    private Double CSDCYield;
    /**
     * 中证登估价修正久期
     */
    private Double CSDCDuration;

    /**
     * 起息日
     */
    private Date valueDate;
    /**
     * 到期日
     */
    private Date dueDate;
    /**
     * 付息频率
     */
    private String payinterestFreq;
    /**
     * 息票类型
     */
    private String interestPmtType;
    /**
     * 利率类型
     */
    private String interestType;
    /**
     * 债券期限(天)
     */
    private Integer term;

    /**
     * 最近行权日
     */
    private Date latestEDay;

    /**
     * 下一个付息日
     */
    private Date nextCouponDate;

    /**
     * 债券现金流
     */
    @Deprecated
    private Map<Date, BondCashFlow> cashFlow;

    /**
     * 是否含权
     */
    private boolean isRightInvolved;

    /**
     * 选择权类型
     */
    private List<String> optionTypes;

    /**
     * 是否城投债
     */
    private boolean isCityBond;

    /**
     * 是否ABS优先级
     */
    private boolean isABSSup;

    /**
     * ABS级别
     */
    private String ABSLevel;

    /**
     * 是否永续债
     */
    private boolean isPerpetualBond;

    /**
     * 是否短融券
     */
    private boolean isShortTermBond;

    /**
     * 是否最后一个利率调整期
     */
    private boolean isLastTerm;

    /**
     * 浮息债的基准利率类型
     */
    private String baseIRType;

    /**
     * 证券编码（symbol+market）
     */
    private String combSymbol;

    /**
     * 债项投资推荐评级表 IA_RATING_BOND_INVEST_RCMD
     * 不能新增买入
     */
    @Deprecated
    private boolean isIANotInvest;

    /**
     * 清算场所<>001=1=中债登&002=2=上清所&003=3=中债登上海分公司&004=4=中债登深圳分公司
     */
    private String settingHcode;

    /**
     * 上市日期
     */
    private Date listDate;

    /**
     * 本金偿还方式
     */
    private String redemMethod;

    //上清所
    public static final String SETTING_HCODE_SH = "SH";
    //中债登
    public static final String SETTING_HCODE_IB = "IB";

    public BondInfo parserPbBean(REDataBond.BondInfo bean) {
        BondInfo value = this;
        value.setSecuCode(bean.getSecuCode());
        value.setBondMHCode(bean.getBondMHCode());
        value.setSecuName(bean.getSecuName());
        value.setSecuType(bean.getSecuType());
        value.setClass1(bean.getClass1());
        value.setClass2(bean.getClass2());
        value.setClass3(bean.getClass3());
        value.setClass4(bean.getClass4());
        value.setMarket(bean.getMarket());
        value.setParIr(bean.getParIr());
        value.setParValue(bean.getParValue());
        value.setIssuePrice(bean.getIssuePrice());
        value.setIssueAmt(bean.getIssueAmt());
        value.setIssuer(bean.getIssuer());
        value.setUnderwriter(bean.getUnderwriterList());
        value.setGuarantee(bean.getGuaranteeList());
        value.setBeneficiary(bean.getBeneficiary());
        value.setBeneficiaries(bean.getBeneficiariesList());
        value.setPublicIssued(bean.getIsPublicIssued());
        value.setIAType(bean.getIAType());
        value.setJyMainCode(bean.getJyMainCode());
        value.setJyInnerCode(bean.getJyInnerCode());
        value.setUpRatio(bean.getUpRatio());
        value.setExternalBondRatingAll(ExternalBondRating.parserPbBean(bean.getExternalBondRatingAllMap()));
        value.setInternalBondRatingAll(InternalBondRating.parserPbBean(bean.getInternalBondRatingAllList()));
        value.setNewInternalBondRatingAll(NewInternalBondRating.parserPbBean(bean.getNewInternalBondRatingAllList()));
        value.setExternalBondRatingOutlookAll(ExternalBondRatingOutlook.parserPbBean(bean.getExternalBondRatingOutlookAllMap()));
        value.setInternalBondRatingOutlookAll(InternalBondRatingOutlook.parserPbBean(bean.getInternalBondRatingOutlookAllList()));
        value.setCIICRating(bean.getCIICRating());
        value.setChinaBondCleanPrice(bean.getChinaBondCleanPrice());
        value.setChinaBondFullPrice(bean.getChinaBondFullPrice());
        value.setChinaBondYield(bean.getChinaBondYield());
        value.setChinaBondDuration(bean.getChinaBondDuration());
        value.setCSDCNetPrice(bean.getCSDCNetPrice());
        value.setCSDCFullPrice(bean.getCSDCFullPrice());
        value.setCSDCYield(bean.getCSDCYield());
        value.setCSDCDuration(bean.getCSDCDuration());
        value.setValueDate(new Date(bean.getValueDate()));
        value.setDueDate(new Date(bean.getDueDate()));
        value.setPayinterestFreq(bean.getPayinterestFreq());
        value.setInterestPmtType(bean.getInterestPmtType());
        value.setInterestType(bean.getInterestType());
        value.setTerm(bean.getTerm());
        value.setLatestEDay(new Date(bean.getLatestEDay()));
        value.setNextCouponDate(new Date(bean.getNextCouponDate()));
        value.setCashFlow(BondCashFlow.parserPbBean(bean.getCashFlowMap()));
        value.setRightInvolved(bean.getIsRightInvolved());
        value.setOptionTypes(bean.getOptionTypesList());
        value.setCityBond(bean.getIsCityBond());
        value.setABSSup(bean.getIsABSSup());
        value.setABSLevel(bean.getABSLevel());
        value.setPerpetualBond(bean.getIsPerpetualBond());
        value.setShortTermBond(bean.getIsShortTermBond());
        value.setLastTerm(bean.getIsLastTerm());
        value.setBaseIRType(bean.getBaseIRType());
        value.setCombSymbol(bean.getCombSymbol());
        value.setIANotInvest(bean.getIsIANotInvest());
        value.setSettingHcode(bean.getSettingHcode());
        value.setListDate(new Date(bean.getListDate()));
        value.setRedemMethod(bean.getRedemMethod());
        return value;
    }

}
