package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * IoT设备档案管理
 *
 * @author auto create
 * @since 1.0, 2021-07-28 11:09:19
 */
public class AlipayCommerceIotDeviceRecordsSetModel extends AlipayObject {

	private static final long serialVersionUID = 7194236133552513942L;

	/**
	 * 设备档案文件
	 */
	@ApiListField("device_record_files")
	@ApiField("device_record_file")
	private List<DeviceRecordFile> deviceRecordFiles;

	/**
	 * 设备档案拓展信息
	 */
	@ApiField("ext_params")
	private DeviceExtParams extParams;

	/**
	 * 设备档案管理场景
IOT_DEVICE_RECORDS_G1(极简绑定)
IOT_DEVICE_RECORDS_G3_INDIRECT(间连三绑定)
 IOT_DEVICE_RECORDS_G3_DIRECT(直连三绑定)
IOT_DEVICE_RECORDS_DELETE(解绑)
IOT_DEVICE_RECORDS_QUERY（绑定查询）
	 */
	@ApiField("scene_code")
	private String sceneCode;

	/**
	 * CREATE
UPDATE
DEFAULT
	 */
	@ApiField("scene_params")
	private String sceneParams;

	/**
	 * 设备序列号
	 */
	@ApiField("sn")
	private String sn;

	/**
	 * 设备供应商ID
	 */
	@ApiField("supplier_id")
	private String supplierId;

	public List<DeviceRecordFile> getDeviceRecordFiles() {
		return this.deviceRecordFiles;
	}
	public void setDeviceRecordFiles(List<DeviceRecordFile> deviceRecordFiles) {
		this.deviceRecordFiles = deviceRecordFiles;
	}

	public DeviceExtParams getExtParams() {
		return this.extParams;
	}
	public void setExtParams(DeviceExtParams extParams) {
		this.extParams = extParams;
	}

	public String getSceneCode() {
		return this.sceneCode;
	}
	public void setSceneCode(String sceneCode) {
		this.sceneCode = sceneCode;
	}

	public String getSceneParams() {
		return this.sceneParams;
	}
	public void setSceneParams(String sceneParams) {
		this.sceneParams = sceneParams;
	}

	public String getSn() {
		return this.sn;
	}
	public void setSn(String sn) {
		this.sn = sn;
	}

	public String getSupplierId() {
		return this.supplierId;
	}
	public void setSupplierId(String supplierId) {
		this.supplierId = supplierId;
	}

}
