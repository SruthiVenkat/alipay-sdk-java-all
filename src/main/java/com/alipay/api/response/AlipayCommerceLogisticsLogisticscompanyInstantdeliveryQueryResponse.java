package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.LogisticsCompanyResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.logistics.logisticscompany.instantdelivery.query response.
 * 
 * @author auto create
 * @since 1.0, 2020-09-27 22:01:17
 */
public class AlipayCommerceLogisticsLogisticscompanyInstantdeliveryQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1482821991537455437L;

	/** 
	 * 即时配送公司列表
	 */
	@ApiListField("logistics_companies")
	@ApiField("logistics_company_result")
	private List<LogisticsCompanyResult> logisticsCompanies;

	public void setLogisticsCompanies(List<LogisticsCompanyResult> logisticsCompanies) {
		this.logisticsCompanies = logisticsCompanies;
	}
	public List<LogisticsCompanyResult> getLogisticsCompanies( ) {
		return this.logisticsCompanies;
	}

}