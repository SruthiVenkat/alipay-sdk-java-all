package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 券可用范围
 *
 * @author auto create
 * @since 1.0, 2022-04-08 21:47:14
 */
public class VoucherAvailableScope extends AlipayObject {

	private static final long serialVersionUID = 2351139493958764242L;

	/**
	 * 券可用城市信息。 当voucher_available_type=CITY_CODE时，该字段必填。
	 */
	@ApiField("order_voucher_available_city_code")
	private OrderVoucherAvailableCityCode orderVoucherAvailableCityCode;

	/**
	 * 券可用门店信息。

当voucher_available_type=SHOP时，该字段必填。
	 */
	@ApiField("order_voucher_available_shop")
	private OrderVoucherAvailableShop orderVoucherAvailableShop;

	/**
	 * 可用范围类型。 枚举值： 
SHOP:可用门店
CITY_CODE:可用城市
	 */
	@ApiField("voucher_available_type")
	private String voucherAvailableType;

	public OrderVoucherAvailableCityCode getOrderVoucherAvailableCityCode() {
		return this.orderVoucherAvailableCityCode;
	}
	public void setOrderVoucherAvailableCityCode(OrderVoucherAvailableCityCode orderVoucherAvailableCityCode) {
		this.orderVoucherAvailableCityCode = orderVoucherAvailableCityCode;
	}

	public OrderVoucherAvailableShop getOrderVoucherAvailableShop() {
		return this.orderVoucherAvailableShop;
	}
	public void setOrderVoucherAvailableShop(OrderVoucherAvailableShop orderVoucherAvailableShop) {
		this.orderVoucherAvailableShop = orderVoucherAvailableShop;
	}

	public String getVoucherAvailableType() {
		return this.voucherAvailableType;
	}
	public void setVoucherAvailableType(String voucherAvailableType) {
		this.voucherAvailableType = voucherAvailableType;
	}

}