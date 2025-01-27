package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.InterTradeConsultOpenApiResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.boss.contract.management.identify response.
 * 
 * @author auto create
 * @since 1.0, 2022-08-31 15:19:30
 */
public class AlipayBossContractManagementIdentifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 3452488446419624517L;

	/** 
	 * 识别结果
	 */
	@ApiField("result_set")
	private InterTradeConsultOpenApiResult resultSet;

	public void setResultSet(InterTradeConsultOpenApiResult resultSet) {
		this.resultSet = resultSet;
	}
	public InterTradeConsultOpenApiResult getResultSet( ) {
		return this.resultSet;
	}

}
