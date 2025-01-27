package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.eco.edu.kt.schoolinfo.modify response.
 * 
 * @author auto create
 * @since 1.0, 2022-09-05 20:42:46
 */
public class AlipayEcoEduKtSchoolinfoModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 6887874812192153684L;

	/** 
	 * 支付宝分配给学校的编码，作为学校在支付宝的标识
	 */
	@ApiField("school_no")
	private String schoolNo;

	/** 
	 * Y：代表成功；N：代表失败
	 */
	@ApiField("status")
	private String status;

	public void setSchoolNo(String schoolNo) {
		this.schoolNo = schoolNo;
	}
	public String getSchoolNo( ) {
		return this.schoolNo;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

}
