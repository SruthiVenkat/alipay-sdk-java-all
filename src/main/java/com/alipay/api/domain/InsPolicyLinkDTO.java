package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 场景开放平台对外开放场景链接
 *
 * @author auto create
 * @since 1.0, 2022-08-19 14:24:38
 */
public class InsPolicyLinkDTO extends AlipayObject {

	private static final long serialVersionUID = 8867651532972267133L;

	/**
	 * 授权token
	 */
	@ApiField("authed_token")
	private String authedToken;

	/**
	 * 已授权的保单url
	 */
	@ApiField("authed_url")
	private String authedUrl;

	/**
	 * 过期时间
	 */
	@ApiField("expiration")
	private Date expiration;

	/**
	 * 产品名称
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * 产品图标
	 */
	@ApiField("product_icon")
	private String productIcon;

	/**
	 * 产品名称
	 */
	@ApiField("product_name")
	private String productName;

	/**
	 * 产品方案id
	 */
	@ApiField("product_plan_id")
	private String productPlanId;

	public String getAuthedToken() {
		return this.authedToken;
	}
	public void setAuthedToken(String authedToken) {
		this.authedToken = authedToken;
	}

	public String getAuthedUrl() {
		return this.authedUrl;
	}
	public void setAuthedUrl(String authedUrl) {
		this.authedUrl = authedUrl;
	}

	public Date getExpiration() {
		return this.expiration;
	}
	public void setExpiration(Date expiration) {
		this.expiration = expiration;
	}

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getProductIcon() {
		return this.productIcon;
	}
	public void setProductIcon(String productIcon) {
		this.productIcon = productIcon;
	}

	public String getProductName() {
		return this.productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductPlanId() {
		return this.productPlanId;
	}
	public void setProductPlanId(String productPlanId) {
		this.productPlanId = productPlanId;
	}

}