package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fincore.fundds.account.witness.create response.
 * 
 * @author auto create
 * @since 1.0, 2022-05-20 17:26:46
 */
public class AlipayFincoreFunddsAccountWitnessCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 1159417457643456367L;

	/** 
	 * 开户账号
	 */
	@ApiField("account_no")
	private String accountNo;

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	public String getAccountNo( ) {
		return this.accountNo;
	}

}
