package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 电商商品模型
 *
 * @author auto create
 * @since 1.0, 2022-08-19 15:38:22
 */
public class EcomItemDTO extends AlipayObject {

	private static final long serialVersionUID = 1173221836473136767L;

	/**
	 * 类目历史30天完结父订单数
	 */
	@ApiField("cat_order_count")
	private Long catOrderCount;

	/**
	 * 类目历史30天完结父订单退换货率
	 */
	@ApiField("cat_order_refund_exchange_rate")
	private String catOrderRefundExchangeRate;

	/**
	 * 商品详情
	 */
	@ApiField("item_detail")
	private EcomItemExtendDetailDTO itemDetail;

	/**
	 * 商品id
	 */
	@ApiField("item_id")
	private String itemId;

	/**
	 * 商品图片
	 */
	@ApiField("item_pict_url")
	private String itemPictUrl;

	/**
	 * 商品单价
	 */
	@ApiField("item_price")
	private Long itemPrice;

	/**
	 * 商品标题
	 */
	@ApiField("item_title")
	private String itemTitle;

	/**
	 * 叶子类目id
	 */
	@ApiField("leaf_cat_id")
	private String leafCatId;

	/**
	 * 叶子类目名称
	 */
	@ApiField("leaf_cat_name")
	private String leafCatName;

	/**
	 * 根类目id
	 */
	@ApiField("root_cat_id")
	private String rootCatId;

	/**
	 * 根类目名称
	 */
	@ApiField("root_cat_name")
	private String rootCatName;

	/**
	 * sku个数
	 */
	@ApiField("sku_amount")
	private String skuAmount;

	/**
	 * sku最大价格
	 */
	@ApiField("sku_max_price")
	private Long skuMaxPrice;

	/**
	 * sku最小价格
	 */
	@ApiField("sku_min_price")
	private Long skuMinPrice;

	public Long getCatOrderCount() {
		return this.catOrderCount;
	}
	public void setCatOrderCount(Long catOrderCount) {
		this.catOrderCount = catOrderCount;
	}

	public String getCatOrderRefundExchangeRate() {
		return this.catOrderRefundExchangeRate;
	}
	public void setCatOrderRefundExchangeRate(String catOrderRefundExchangeRate) {
		this.catOrderRefundExchangeRate = catOrderRefundExchangeRate;
	}

	public EcomItemExtendDetailDTO getItemDetail() {
		return this.itemDetail;
	}
	public void setItemDetail(EcomItemExtendDetailDTO itemDetail) {
		this.itemDetail = itemDetail;
	}

	public String getItemId() {
		return this.itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public String getItemPictUrl() {
		return this.itemPictUrl;
	}
	public void setItemPictUrl(String itemPictUrl) {
		this.itemPictUrl = itemPictUrl;
	}

	public Long getItemPrice() {
		return this.itemPrice;
	}
	public void setItemPrice(Long itemPrice) {
		this.itemPrice = itemPrice;
	}

	public String getItemTitle() {
		return this.itemTitle;
	}
	public void setItemTitle(String itemTitle) {
		this.itemTitle = itemTitle;
	}

	public String getLeafCatId() {
		return this.leafCatId;
	}
	public void setLeafCatId(String leafCatId) {
		this.leafCatId = leafCatId;
	}

	public String getLeafCatName() {
		return this.leafCatName;
	}
	public void setLeafCatName(String leafCatName) {
		this.leafCatName = leafCatName;
	}

	public String getRootCatId() {
		return this.rootCatId;
	}
	public void setRootCatId(String rootCatId) {
		this.rootCatId = rootCatId;
	}

	public String getRootCatName() {
		return this.rootCatName;
	}
	public void setRootCatName(String rootCatName) {
		this.rootCatName = rootCatName;
	}

	public String getSkuAmount() {
		return this.skuAmount;
	}
	public void setSkuAmount(String skuAmount) {
		this.skuAmount = skuAmount;
	}

	public Long getSkuMaxPrice() {
		return this.skuMaxPrice;
	}
	public void setSkuMaxPrice(Long skuMaxPrice) {
		this.skuMaxPrice = skuMaxPrice;
	}

	public Long getSkuMinPrice() {
		return this.skuMinPrice;
	}
	public void setSkuMinPrice(Long skuMinPrice) {
		this.skuMinPrice = skuMinPrice;
	}

}
