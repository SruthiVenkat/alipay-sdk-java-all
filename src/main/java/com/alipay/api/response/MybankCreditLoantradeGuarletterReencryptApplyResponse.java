package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: mybank.credit.loantrade.guarletter.reencrypt.apply response.
 * 
 * @author auto create
 * @since 1.0, 2022-08-24 17:38:06
 */
public class MybankCreditLoantradeGuarletterReencryptApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 3394968425857666516L;

	/** 
	 * 重新加密保函申请单号
	 */
	@ApiField("apply_no")
	private String applyNo;

	public void setApplyNo(String applyNo) {
		this.applyNo = applyNo;
	}
	public String getApplyNo( ) {
		return this.applyNo;
	}

}
