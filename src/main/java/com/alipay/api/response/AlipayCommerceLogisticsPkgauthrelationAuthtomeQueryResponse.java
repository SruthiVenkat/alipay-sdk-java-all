package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.PkgAuthRelation;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.logistics.pkgauthrelation.authtome.query response.
 * 
 * @author auto create
 * @since 1.0, 2020-07-02 10:05:24
 */
public class AlipayCommerceLogisticsPkgauthrelationAuthtomeQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1342466827336439158L;

	/** 
	 * 授权关系列表
	 */
	@ApiListField("pkg_auth_relations")
	@ApiField("pkg_auth_relation")
	private List<PkgAuthRelation> pkgAuthRelations;

	public void setPkgAuthRelations(List<PkgAuthRelation> pkgAuthRelations) {
		this.pkgAuthRelations = pkgAuthRelations;
	}
	public List<PkgAuthRelation> getPkgAuthRelations( ) {
		return this.pkgAuthRelations;
	}

}