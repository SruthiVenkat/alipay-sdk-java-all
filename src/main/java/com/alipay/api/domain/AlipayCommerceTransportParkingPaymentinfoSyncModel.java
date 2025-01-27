package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 停车支付信息同步接口
 *
 * @author auto create
 * @since 1.0, 2022-08-17 21:29:14
 */
public class AlipayCommerceTransportParkingPaymentinfoSyncModel extends AlipayObject {

	private static final long serialVersionUID = 7725166211875574681L;

	/**
	 * 停车场内缴费后，允许出场的免费时长分钟数
	 */
	@ApiField("free_exit_minutes")
	private String freeExitMinutes;

	/**
	 * 车牌是否加密，true为加密，false为不加密，默认为false
	 */
	@ApiField("is_encrypt_plate_no")
	private Boolean isEncryptPlateNo;

	/**
	 * 外部停车流水号(用于串通进场与出场信息)
	 */
	@ApiField("out_serial_no")
	private String outSerialNo;

	/**
	 * 场内缴费时间，格式"YYYY-MM-DD HH:mm:ss"，24小时制，请保证服务器时间准确，场内缴费不应晚于当前网络时间
	 */
	@ApiField("payment_time")
	private Date paymentTime;

	/**
	 * 车牌颜色，车牌颜色，枚举支持：
*BLUE：蓝。
*GREEN：绿。
*YELLOW：黄。
*WHITE：白。
*BLACK：黑。
*LIMEGREEN：黄绿色。
	 */
	@ApiField("plate_color")
	private String plateColor;

	/**
	 * 车牌号（支持加密格式）
	 */
	@ApiField("plate_no")
	private String plateNo;

	/**
	 * 停车缴费/停车订单的服务页面地址。必须是支付宝小程序URL（无需转换https），详见：https://opendocs.alipay.com/support/01rb18#URL%20%E6%A0%BC%E5%BC%8F
	 */
	@ApiField("service_url")
	private String serviceUrl;

	public String getFreeExitMinutes() {
		return this.freeExitMinutes;
	}
	public void setFreeExitMinutes(String freeExitMinutes) {
		this.freeExitMinutes = freeExitMinutes;
	}

	public Boolean getIsEncryptPlateNo() {
		return this.isEncryptPlateNo;
	}
	public void setIsEncryptPlateNo(Boolean isEncryptPlateNo) {
		this.isEncryptPlateNo = isEncryptPlateNo;
	}

	public String getOutSerialNo() {
		return this.outSerialNo;
	}
	public void setOutSerialNo(String outSerialNo) {
		this.outSerialNo = outSerialNo;
	}

	public Date getPaymentTime() {
		return this.paymentTime;
	}
	public void setPaymentTime(Date paymentTime) {
		this.paymentTime = paymentTime;
	}

	public String getPlateColor() {
		return this.plateColor;
	}
	public void setPlateColor(String plateColor) {
		this.plateColor = plateColor;
	}

	public String getPlateNo() {
		return this.plateNo;
	}
	public void setPlateNo(String plateNo) {
		this.plateNo = plateNo;
	}

	public String getServiceUrl() {
		return this.serviceUrl;
	}
	public void setServiceUrl(String serviceUrl) {
		this.serviceUrl = serviceUrl;
	}

}
