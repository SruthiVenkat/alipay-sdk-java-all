package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 政务快速接入同步接口
 *
 * @author auto create
 * @since 1.0, 2022-07-26 17:19:46
 */
public class AlipayEbppIndustryGovFastmodeSyncModel extends AlipayObject {

	private static final long serialVersionUID = 3124877155733827325L;

	/**
	 * 业务类型
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 是否包含敏感信息，例如身份证号码
	 */
	@ApiField("desensitization")
	private Boolean desensitization;

	/**
	 * 机构回传键值对参数
	 */
	@ApiListField("keyword_list")
	@ApiField("common_keyword")
	private List<CommonKeyword> keywordList;

	/**
	 * 机构编码，bizType的二级分类，不传默认为“normal”
	 */
	@ApiField("org_code")
	private String orgCode;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getBizType() {
		return this.bizType;
	}
	public void setBizType(String bizType) {
		this.bizType = bizType;
	}

	public Boolean getDesensitization() {
		return this.desensitization;
	}
	public void setDesensitization(Boolean desensitization) {
		this.desensitization = desensitization;
	}

	public List<CommonKeyword> getKeywordList() {
		return this.keywordList;
	}
	public void setKeywordList(List<CommonKeyword> keywordList) {
		this.keywordList = keywordList;
	}

	public String getOrgCode() {
		return this.orgCode;
	}
	public void setOrgCode(String orgCode) {
		this.orgCode = orgCode;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
