package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 优惠信息
 *
 * @author auto create
 * @since 1.0, 2022-08-24 17:10:43
 */
public class DeductInfo extends AlipayObject {

	private static final long serialVersionUID = 7626384229937796293L;

	/**
	 * 自定义优惠规则
	 */
	@ApiField("customer_define_deduct_rule")
	private CustomerDefineDeductRule customerDefineDeductRule;

	public CustomerDefineDeductRule getCustomerDefineDeductRule() {
		return this.customerDefineDeductRule;
	}
	public void setCustomerDefineDeductRule(CustomerDefineDeductRule customerDefineDeductRule) {
		this.customerDefineDeductRule = customerDefineDeductRule;
	}

}