package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.pcredit.huabei.pcreditbenefit.item.sync response.
 * 
 * @author auto create
 * @since 1.0, 2022-08-18 17:01:52
 */
public class AlipayPcreditHuabeiPcreditbenefitItemSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 6186131845432457888L;

	/** 
	 * 操作结果
	 */
	@ApiField("result")
	private Boolean result;

	public void setResult(Boolean result) {
		this.result = result;
	}
	public Boolean getResult( ) {
		return this.result;
	}

}
