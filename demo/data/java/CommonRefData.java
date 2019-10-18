package com.iquantex.ts.cre.data.model;

import com.iquantex.ts.cre.data.process.message.protobuf.REDataCommonRef;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * 公共咨询数据
 * 
 * @author Carl
 *
 */
@Getter
@Setter
public class CommonRefData {

	private Double threeMonthRate;
	
	private Double sixMonthRate;
	
	private Double oneYearRate;

	private Double twoYearRate;

	private Double threeYearRate;
	
	private Double fiveYearRate;

	private List<BondClass> bondClassList;

	public CommonRefData parserPbBean(REDataCommonRef.CommonRefData bean) {
		CommonRefData value = this;
		value.setThreeMonthRate(bean.getThreeMonthRate());
		value.setSixMonthRate(bean.getSixMonthRate());
		value.setOneYearRate(bean.getOneYearRate());
		value.setTwoYearRate(bean.getTwoYearRate());
		value.setThreeYearRate(bean.getThreeYearRate());
		value.setFiveYearRate(bean.getFiveYearRate());
		value.setBondClassList(BondClass.parserPbBean(bean.getBondClassListList()));
		return value;
	}

}
