package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ant.ocr.idcard.identify response.
 * 
 * @author auto create
 * @since 1.0, 2022-07-04 13:56:29
 */
public class AntOcrIdcardIdentifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 8374425583276433988L;

	/** 
	 * 识别结果
	 */
	@ApiField("result")
	private String result;

	public void setResult(String result) {
		this.result = result;
	}
	public String getResult( ) {
		return this.result;
	}

}
