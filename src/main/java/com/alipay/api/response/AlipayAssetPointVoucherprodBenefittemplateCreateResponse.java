package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.asset.point.voucherprod.benefittemplate.create response.
 * 
 * @author auto create
 * @since 1.0, 2021-07-14 10:10:11
 */
public class AlipayAssetPointVoucherprodBenefittemplateCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 3211616381546913621L;

	/** 
	 * 资产id，即创建的权益模板的id
	 */
	@ApiField("asset_id")
	private String assetId;

	/** 
	 * 权益结算平台的流水号
	 */
	@ApiField("bill_no")
	private String billNo;

	public void setAssetId(String assetId) {
		this.assetId = assetId;
	}
	public String getAssetId( ) {
		return this.assetId;
	}

	public void setBillNo(String billNo) {
		this.billNo = billNo;
	}
	public String getBillNo( ) {
		return this.billNo;
	}

}
