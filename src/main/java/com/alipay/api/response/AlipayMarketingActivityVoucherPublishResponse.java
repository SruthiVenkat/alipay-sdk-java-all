package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.activity.voucher.publish response.
 * 
 * @author auto create
 * @since 1.0, 2022-09-07 17:57:12
 */
public class AlipayMarketingActivityVoucherPublishResponse extends AlipayResponse {

	private static final long serialVersionUID = 3726643193156485731L;

	/** 
	 * 预充值链接

限制:
链接有效时间3天
	 */
	@ApiField("recharge_url")
	private String rechargeUrl;

	public void setRechargeUrl(String rechargeUrl) {
		this.rechargeUrl = rechargeUrl;
	}
	public String getRechargeUrl( ) {
		return this.rechargeUrl;
	}

}
