package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 特价券详情
 *
 * @author auto create
 * @since 1.0, 2022-08-24 17:05:34
 */
public class SpecialVoucherInfo extends AlipayObject {

	private static final long serialVersionUID = 8521192798267237557L;

	/**
	 * 门槛金额。
	 */
	@ApiField("floor_amount")
	private String floorAmount;

	/**
	 * 特价，即：原价-特价=优惠金额。
	 */
	@ApiField("special_amount")
	private String specialAmount;

	public String getFloorAmount() {
		return this.floorAmount;
	}
	public void setFloorAmount(String floorAmount) {
		this.floorAmount = floorAmount;
	}

	public String getSpecialAmount() {
		return this.specialAmount;
	}
	public void setSpecialAmount(String specialAmount) {
		this.specialAmount = specialAmount;
	}

}
