package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 宠物身份核验
 *
 * @author auto create
 * @since 1.0, 2021-11-30 15:38:38
 */
public class AlipayInsScenePetprofilePlatformprofileIdentifyModel extends AlipayObject {

	private static final long serialVersionUID = 2834384375814481761L;

	/**
	 * 宠物ID
	 */
	@ApiField("pet_id")
	private String petId;

	/**
	 * 宠物照片列表，正脸和鼻纹都不能为空
	 */
	@ApiListField("photos")
	@ApiField("pet_photo")
	private List<PetPhoto> photos;

	public String getPetId() {
		return this.petId;
	}
	public void setPetId(String petId) {
		this.petId = petId;
	}

	public List<PetPhoto> getPhotos() {
		return this.photos;
	}
	public void setPhotos(List<PetPhoto> photos) {
		this.photos = photos;
	}

}
