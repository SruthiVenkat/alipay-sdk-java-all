package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.search.boxactivity.apply response.
 * 
 * @author auto create
 * @since 1.0, 2022-04-22 11:21:45
 */
public class AlipayOpenSearchBoxactivityApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 5337116715265186231L;

	/** 
	 * 搜索直达活动ID
	 */
	@ApiField("box_activity_id")
	private String boxActivityId;

	public void setBoxActivityId(String boxActivityId) {
		this.boxActivityId = boxActivityId;
	}
	public String getBoxActivityId( ) {
		return this.boxActivityId;
	}

}