package com.iquantex.ts.cre.data.model;

import com.iquantex.ts.cre.data.process.message.protobuf.REDataOpenFund;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

/**
 * Created by dingzj on 2018/7/16.
 */
@Getter
@Setter
public class OpenFundInfo {

    /**
     * 基金内部编码
     */
    private String fundHcode;

    /**
     * 基金全称
     */
    private String cname;

    /**
     * 前端申购代码
     */
    private String purchaseFrcode;

    /**
     * 发行日期
     */
    private Date issueStdate;

    /**
     * 资产规模
     */
    private Double asset;

    /**
     * 资产规模截止日
     */
    private Date assetEndDate;

    /**
     * 基金管理人
     */
    private String fundMgr;

    /**
     * 基金类型
     */
    private String fundClassInvest;

    /**
     * 成立日期
     */
    private Date setupDate;

    /**
     * 成立规模
     */
    private Double setupShares;

    /**
     * 基金托管人
     */
    private String fundCustod;

    /**
     * 申购状态
     */
    private String purchaseStatus;

    /**
     * 赎回状态
     */
    private String redeemStatus;

    /**
     * 是否货币基金
     */
    private boolean isMMF;

    /**
     * 交易场所
     */
    private String marketCode;

    /**
     * 运作模式
     */
    private String fundClassOper;

    /**
     * 募集类型
     */
    private String fundClassRaise;

    /**
     * 投资通道类型
     */
    private String fundClassChnl;

    public OpenFundInfo parserPbBean(REDataOpenFund.OpenFundInfo bean) {
        OpenFundInfo value = this;
        value.setFundHcode(bean.getFundHcode());
        value.setCname(bean.getCname());
        value.setPurchaseFrcode(bean.getPurchaseFrcode());
        value.setIssueStdate(new Date(bean.getIssueStdate()));
        value.setAsset(bean.getAsset());
        value.setAssetEndDate(new Date(bean.getAssetEndDate()));
        value.setFundMgr(bean.getFundMgr());
        value.setFundClassInvest(bean.getFundClassInvest());
        value.setSetupDate(new Date(bean.getSetupDate()));
        value.setSetupShares(bean.getSetupShares());
        value.setFundCustod(bean.getFundCustod());
        value.setPurchaseStatus(bean.getPurchaseStatus());
        value.setRedeemStatus(bean.getRedeemStatus());
        value.setMMF(bean.getIsMMF());
        value.setMarketCode(bean.getMarketCode());
        value.setFundClassOper(bean.getFundClassOper());
        value.setFundClassRaise(bean.getFundClassRaise());
        value.setFundClassChnl(bean.getFundClassChnl());
        return value;
    }

}
