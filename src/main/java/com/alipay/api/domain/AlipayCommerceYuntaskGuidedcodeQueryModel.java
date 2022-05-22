package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询导购员的推广码
 *
 * @author auto create
 * @since 1.0, 2022-05-17 20:28:47
 */
public class AlipayCommerceYuntaskGuidedcodeQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1345546417954129242L;

	/**
	 * 导购员ID
	 */
	@ApiField("hunter_id")
	private String hunterId;

	/**
	 * 零售商的pid
	 */
	@ApiField("merchant_pid")
	private String merchantPid;

	/**
	 * 任务id
	 */
	@ApiField("task_id")
	private String taskId;

	public String getHunterId() {
		return this.hunterId;
	}
	public void setHunterId(String hunterId) {
		this.hunterId = hunterId;
	}

	public String getMerchantPid() {
		return this.merchantPid;
	}
	public void setMerchantPid(String merchantPid) {
		this.merchantPid = merchantPid;
	}

	public String getTaskId() {
		return this.taskId;
	}
	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}

}
