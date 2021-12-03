package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 电子小票同步接口
 *
 * @author auto create
 * @since 1.0, 2021-10-26 14:53:02
 */
public class AlipayCommerceReceiptSyncModel extends AlipayObject {

	private static final long serialVersionUID = 4164395757423116768L;

	/**
	 * 订单信息,最大限制10条
	 */
	@ApiListField("order_list")
	@ApiField("receipt_simple_order_d_t_o")
	private List<ReceiptSimpleOrderDTO> orderList;

	public List<ReceiptSimpleOrderDTO> getOrderList() {
		return this.orderList;
	}
	public void setOrderList(List<ReceiptSimpleOrderDTO> orderList) {
		this.orderList = orderList;
	}

}