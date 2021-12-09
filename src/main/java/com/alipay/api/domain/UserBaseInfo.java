package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用户基础信息封装模型
 *
 * @author auto create
 * @since 1.0, 2021-12-03 16:23:10
 */
public class UserBaseInfo extends AlipayObject {

	private static final long serialVersionUID = 1418515268368759529L;

	/**
	 * 证件有效期截止日期，法定代表人、单位负责人、经办人、受益人、实控人必填
	 */
	@ApiField("cert_date_invalid")
	private String certDateInvalid;

	/**
	 * 证件有效期起始日期，法定代表人、单位负责人、经办人、受益人、实控人必填
	 */
	@ApiField("cert_date_valid")
	private String certDateValid;

	/**
	 * 证件影印件反面，法定代表人、单位负责人、经办人、受益人、实控人必填
	 */
	@ApiField("cert_file_back")
	private String certFileBack;

	/**
	 * 证件影印件正面，法定代表人、单位负责人、经办人、受益人、实控人必填
	 */
	@ApiField("cert_file_front")
	private String certFileFront;

	/**
	 * 证件号码，法定代表人、单位负责人、经办人、受益人、实控人必填
	 */
	@ApiField("cert_no")
	private String certNo;

	/**
	 * 证件类型，目前支持：IT01-居民身份证。法定代表人、单位负责人、经办人、受益人、实控人必填
	 */
	@ApiField("cert_type")
	private String certType;

	/**
	 * 电子邮箱，经办人必填
	 */
	@ApiField("email")
	private String email;

	/**
	 * 手机号码，经办人必填
	 */
	@ApiField("mobile")
	private String mobile;

	/**
	 * 姓名，法定代表人、单位负责人、经办人、受益人、实控人必填
	 */
	@ApiField("name")
	private String name;

	/**
	 * 座机号码
	 */
	@ApiField("phone")
	private String phone;

	public String getCertDateInvalid() {
		return this.certDateInvalid;
	}
	public void setCertDateInvalid(String certDateInvalid) {
		this.certDateInvalid = certDateInvalid;
	}

	public String getCertDateValid() {
		return this.certDateValid;
	}
	public void setCertDateValid(String certDateValid) {
		this.certDateValid = certDateValid;
	}

	public String getCertFileBack() {
		return this.certFileBack;
	}
	public void setCertFileBack(String certFileBack) {
		this.certFileBack = certFileBack;
	}

	public String getCertFileFront() {
		return this.certFileFront;
	}
	public void setCertFileFront(String certFileFront) {
		this.certFileFront = certFileFront;
	}

	public String getCertNo() {
		return this.certNo;
	}
	public void setCertNo(String certNo) {
		this.certNo = certNo;
	}

	public String getCertType() {
		return this.certType;
	}
	public void setCertType(String certType) {
		this.certType = certType;
	}

	public String getEmail() {
		return this.email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobile() {
		return this.mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return this.phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}

}
