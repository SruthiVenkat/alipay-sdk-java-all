package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.activity.voucher.create response.
 * 
 * @author auto create
 * @since 1.0, 2022-09-07 17:44:09
 */
public class AlipayMarketingActivityVoucherCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 4454464511634563591L;

	/** 
	 * 活动id
	 */
	@ApiField("activity_id")
	private String activityId;

	public void setActivityId(String activityId) {
		this.activityId = activityId;
	}
	public String getActivityId( ) {
		return this.activityId;
	}

}
