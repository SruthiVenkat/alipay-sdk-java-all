package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询单车骑行能量开关状态
 *
 * @author auto create
 * @since 1.0, 2022-08-04 19:47:14
 */
public class AlipayCommerceTransportBikeEnergyQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4772111971287189475L;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
