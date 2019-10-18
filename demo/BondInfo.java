package com.iquantex.ruleengine.data.bean;

import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * Created by zero on 2017/7/27.
 */
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
	private Boolean isPublicIssued;

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
	 * 
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
	private Boolean isRightInvolved;

	/**
	 * 选择权类型
	 */
	private List<String> optionTypes;

	/**
	 * 是否城投债
	 */
	private Boolean isCityBond;

	/**
	 * 是否ABS优先级
	 */
	private Boolean isABSSup;

	/**
	 * ABS级别
	 */
	private String ABSLevel;

	/**
	 * 是否永续债
	 */
	private Boolean isPerpetualBond;

	/**
	 * 是否短融券
	 */
	private Boolean isShortTermBond;

	/**
	 * 是否最后一个利率调整期
	 */
	private Boolean isLastTerm;

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
	private Boolean isIANotInvest;

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

	public String getSecuCode() {
		return secuCode;
	}

	public void setSecuCode(String secuCode) {
		this.secuCode = secuCode;
	}

	public String getSecuName() {
		return secuName;
	}

	public void setSecuName(String secuName) {
		this.secuName = secuName;
	}

	public String getBondMHCode() {
		return bondMHCode;
	}

	public void setBondMHCode(String bondMHCode) {
		this.bondMHCode = bondMHCode;
	}

	public String getClass1() {
		return class1;
	}

	public void setClass1(String class1) {
		this.class1 = class1;
	}

	public String getClass2() {
		return class2;
	}

	public void setClass2(String class2) {
		this.class2 = class2;
	}

	public String getClass3() {
		return class3;
	}

	public void setClass3(String class3) {
		this.class3 = class3;
	}

	public String getClass4() {
		return class4;
	}

	public void setClass4(String class4) {
		this.class4 = class4;
	}

	public String getMarket() {
		return market;
	}

	public void setMarket(String market) {
		this.market = market;
	}

	public Double getIssueAmt() {
		return issueAmt;
	}

	public void setIssueAmt(Double issue_amt) {
		this.issueAmt = issue_amt;
	}

	public String getIssuer() {
		return issuer;
	}

	public void setIssuer(String issuer) {
		this.issuer = issuer;
	}

	public String getBeneficiary() {
		return beneficiary;
	}

	public void setBeneficiary(String beneficiary) {
		this.beneficiary = beneficiary;
	}

	public List<String> getBeneficiaries() {
		return beneficiaries;
	}

	public void setBeneficiaries(List<String> beneficiaries) {
		this.beneficiaries = beneficiaries;
	}
	
//	public String getExternalRatingParty() {
//		return externalRatingParty;
//	}
//
//	public void setExternalRatingParty(String externalRatingParty) {
//		this.externalRatingParty = externalRatingParty;
//	}
//
//	public String getExternalRating() {
//		return externalRating;
//	}
//
//	public void setExternalRating(String externalRating) {
//		this.externalRating = externalRating;
//	}
//
//	public String getInternalRating() {
//		return internalRating;
//	}
//
//	public void setInternalRating(String internalRating) {
//		this.internalRating = internalRating;
//	}
//
//	public String getExternalRatingOutlook() {
//		return externalRatingOutlook;
//	}
//
//	public void setExternalRatingOutlook(String externalRatingOutlook) {
//		this.externalRatingOutlook = externalRatingOutlook;
//	}
//
//	public String getInternalRatingOutlook() {
//		return internalRatingOutlook;
//	}
//
//	public void setInternalRatingOutlook(String internalRatingOutlook) {
//		this.internalRatingOutlook = internalRatingOutlook;
//	}

	public String getCIICRating() {
		return CIICRating;
	}

	public void setCIICRating(String cIICRating) {
		CIICRating = cIICRating;
	}

	public Double getChinaBondCleanPrice() {
		return ChinaBondCleanPrice;
	}

	public void setChinaBondCleanPrice(Double chinaBondCleanPrice) {
		ChinaBondCleanPrice = chinaBondCleanPrice;
	}

	public Double getChinaBondFullPrice() {
		return ChinaBondFullPrice;
	}

	public void setChinaBondFullPrice(Double chinaBondFullPrice) {
		ChinaBondFullPrice = chinaBondFullPrice;
	}

	public Double getChinaBondYield() {
		return ChinaBondYield;
	}

	public void setChinaBondYield(Double chinaBondYield) {
		ChinaBondYield = chinaBondYield;
	}

	public Double getChinaBondDuration() {
		return ChinaBondDuration;
	}

	public void setChinaBondDuration(Double chinaBondDuration) {
		ChinaBondDuration = chinaBondDuration;
	}

	public Double getCSDCNetPrice() {
		return CSDCNetPrice;
	}

	public void setCSDCNetPrice(Double CSDCNetPrice) {
		this.CSDCNetPrice = CSDCNetPrice;
	}

	public Double getCSDCFullPrice() {
		return CSDCFullPrice;
	}

	public void setCSDCFullPrice(Double CSDCFullPrice) {
		this.CSDCFullPrice = CSDCFullPrice;
	}

	public Double getCSDCYield() {
		return CSDCYield;
	}

	public void setCSDCYield(Double CSDCYield) {
		this.CSDCYield = CSDCYield;
	}

	public Double getCSDCDuration() {
		return CSDCDuration;
	}

	public void setCSDCDuration(Double CSDCDuration) {
		this.CSDCDuration = CSDCDuration;
	}

	public Boolean isRightInvolved() {
		return isRightInvolved;
	}

	public void setRightInvolved(Boolean isRightInvolved) {
		this.isRightInvolved = isRightInvolved;
	}

	public List<String> getOptionTypes() {
		return optionTypes;
	}

	public void setOptionTypes(List<String> optionTypes) {
		this.optionTypes = optionTypes;
	}

	public Date getDueDate() {
		return dueDate;
	}

	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}

	public Date getLatestEDay() {
		return latestEDay;
	}

	public void setLatestEDay(Date latestEDay) {
		this.latestEDay = latestEDay;
	}

	public Map<Date, BondCashFlow> getCashFlow() {
		return cashFlow;
	}

	public void setCashFlow(Map<Date, BondCashFlow> cashFlows) {
		this.cashFlow = cashFlows;
	}

	public void addCashFlow(BondCashFlow cashFlow) {
		if (this.cashFlow == null) {
			this.cashFlow = Collections.emptyMap();
		}
		this.cashFlow.put(cashFlow.getSatrtDate(), cashFlow);
	}

	public Boolean isCityBond() {
		return isCityBond;
	}

	public void setCityBond(Boolean isCityBond) {
		this.isCityBond = isCityBond;
	}

	public Boolean isABSSup() {
		return isABSSup;
	}

	public void setABSSup(Boolean isABSSup) {
		this.isABSSup = isABSSup;
	}

	public String getABSLevel() {
		return ABSLevel;
	}

	public void setABSLevel(String ABSLevel) {
		this.ABSLevel = ABSLevel;
	}

	public List<String> getUnderwriter() {
		return underwriter;
	}

	public void setUnderwriter(List<String> underwriter) {
		this.underwriter = underwriter;
	}

	public Boolean isPublicIssued() {
		return isPublicIssued;
	}

	public void setPublicIssued(Boolean isPublicIssued) {
		this.isPublicIssued = isPublicIssued;
	}

	public Boolean isPerpetualBond() {
		return isPerpetualBond;
	}

	public void setPerpetualBond(Boolean isPerpetualBond) {
		this.isPerpetualBond = isPerpetualBond;
	}

	public Boolean isShortTermBond() {
		return isShortTermBond;
	}

	public void setShortTermBond(Boolean shortTermBond) {
		isShortTermBond = shortTermBond;
	}

	public Double getParIr() {
		return parIr;
	}

	public void setParIr(Double parIr) {
		this.parIr = parIr;
	}

	public List<String> getGuarantee() {
		return guarantee;
	}

	public void setGuarantee(List<String> guarantee) {
		this.guarantee = guarantee;
	}

	public Integer getTerm() {
		return term;
	}

	public void setTerm(Integer term) {
		this.term = term;
	}

	public Map<String, List<ExternalBondRating>> getExternalBondRatingAll() {
		return externalBondRatingAll;
	}

	public void setExternalBondRatingAll(Map<String, List<ExternalBondRating>> externalBondRatingAll) {
		this.externalBondRatingAll = externalBondRatingAll;
	}

	public List<InternalBondRating> getInternalBondRatingAll() {
		return internalBondRatingAll;
	}

	public void setInternalBondRatingAll(List<InternalBondRating> internalBondRatingAll) {
		this.internalBondRatingAll = internalBondRatingAll;
	}
	
	public List<NewInternalBondRating> getNewInternalBondRatingAll() {
		return newInternalBondRatingAll;
	}

	public void setNewInternalBondRatingAll(List<NewInternalBondRating> newInternalBondRatingAll) {
		this.newInternalBondRatingAll = newInternalBondRatingAll;
	}

	public Map<String, List<ExternalBondRatingOutlook>> getExternalBondRatingOutlookAll() {
		return externalBondRatingOutlookAll;
	}

	public void setExternalBondRatingOutlookAll(Map<String, List<ExternalBondRatingOutlook>> externalBondRatingOutlookAll) {
		this.externalBondRatingOutlookAll = externalBondRatingOutlookAll;
	}

	public List<InternalBondRatingOutlook> getInternalBondRatingOutlookAll() {
		return internalBondRatingOutlookAll;
	}

	public void setInternalBondRatingOutlookAll(List<InternalBondRatingOutlook> internalBondRatingOutlookAll) {
		this.internalBondRatingOutlookAll = internalBondRatingOutlookAll;
	}

	public Double getParValue() {
		return parValue;
	}

	public void setParValue(Double parValue) {
		this.parValue = parValue;
	}

	public Double getIssuePrice() {
		return issuePrice;
	}

	public void setIssuePrice(Double issuePrice) {
		this.issuePrice = issuePrice;
	}

	public String getPayinterestFreq() {
		return payinterestFreq;
	}

	public void setPayinterestFreq(String payinterestFreq) {
		this.payinterestFreq = payinterestFreq;
	}

	public Date getValueDate() {
		return valueDate;
	}

	public void setValueDate(Date valueDate) {
		this.valueDate = valueDate;
	}

	public String getInterestPmtType() {
		return interestPmtType;
	}

	public void setInterestPmtType(String interestPmtType) {
		this.interestPmtType = interestPmtType;
	}

	public String getInterestType() {
		return interestType;
	}

	public void setInterestType(String interestType) {
		this.interestType = interestType;
	}

	public Date getNextCouponDate() {
		return nextCouponDate;
	}

	public void setNextCouponDate(Date nextCouponDate) {
		this.nextCouponDate = nextCouponDate;
	}

	public String getBaseIRType() {
		return baseIRType;
	}

	public void setBaseIRType(String baseIRType) {
		this.baseIRType = baseIRType;
	}

	public Boolean getIsLastTerm() {
		return isLastTerm;
	}

	public void setIsLastTerm(Boolean isLastTerm) {
		this.isLastTerm = isLastTerm;
	}

	public String getIAType() {
		return IAType;
	}

	public void setIAType(String IAType) {
		this.IAType = IAType;
	}

	public String getCombSymbol() {
		return combSymbol;
	}

	public void setCombSymbol(String combSymbol) {
		this.combSymbol = combSymbol;
	}

	public Long getJyMainCode() {
		return jyMainCode;
	}

	public void setJyMainCode(Long jyMainCode) {
		this.jyMainCode = jyMainCode;
	}

	public String getJyInnerCode() {
		return jyInnerCode;
	}

	public void setJyInnerCode(String jyInnerCode) {
		this.jyInnerCode = jyInnerCode;
	}

	public Double getUpRatio() {
		return upRatio;
	}

	public void setUpRatio(Double upRatio) {
		this.upRatio = upRatio;
	}

	public Boolean getIANotInvest() {
		return isIANotInvest;
	}

	public void setIANotInvest(Boolean IANotInvest) {
		isIANotInvest = IANotInvest;
	}

	public String getSettingHcode() {
		return settingHcode;
	}

	public void setSettingHcode(String settingHcode) {
		this.settingHcode = settingHcode;
	}

	public String getSecuType() {
		return secuType;
	}

	public void setSecuType(String secuType) {
		this.secuType = secuType;
	}

	public Date getListDate() {
		return listDate;
	}

	public void setListDate(Date listDate) {
		this.listDate = listDate;
	}

	public String getRedemMethod() {
		return redemMethod;
	}

	public void setRedemMethod(String redemMethod) {
		this.redemMethod = redemMethod;
	}
}
