package com.donica.wqacvr.dto;

import java.io.Serializable;

/**
 * @author jianghaifeng
 *
 * @version 创建时间： 2016年4月27日 下午6:58:05
 *
 *          终端信息持久类
 */
public class TerminalDTO implements Serializable {

	private static final long serialVersionUID = 1L;
	private Long terminalId; // 终端ID
	private String partId; // 件号
	private String unitTypeId; // 部件型号ID
	private String unitType; // 部件型号
	private String partSerialNumber; // 终端编号
	private String hardwareVersion; // 硬件版本号
	private String softwareVersion; // 软件版本号
	private String imsi; // IMSI
	private String imei; // IMEI
	private String simCardNumber; // SIM卡号码
	private String simCardIp; // SIM卡IP地址
	private String wifiModuleType; // WIFI模块型号
	private String wifiIp; // WIFIIP地址
	private String ethernetModuleType; // 以太网模块型号
	private String ethernetIp; // 以太网IP地址
	private String mainControlChipType; // 主控芯片型号
	private String module3gType; // 3G模块型号
	private String chip429Type; // 429芯片型号
	private String emmcType; // EMMC型号usingState
	private String sdCardType; // SD卡型号
	private String speechCodingChipType;// 语音编码芯片型号 USING_STATE
	private String usingState; // 0-未激活，1-已激活
	private String state; // 状态

	private String aircraftNumber;// 飞机注册号
	private String imgPath; // 图片路径

	public Long getTerminalId() {
		return terminalId;
	}

	public void setTerminalId(Long terminalId) {
		this.terminalId = terminalId;
	}

	public String getPartId() {
		return partId;
	}

	public void setPartId(String partId) {
		this.partId = partId;
	}

	public String getUnitTypeId() {
		return unitTypeId;
	}

	public void setUnitTypeId(String unitTypeId) {
		this.unitTypeId = unitTypeId;
	}

	public String getPartSerialNumber() {
		return partSerialNumber;
	}

	public void setPartSerialNumber(String partSerialNumber) {
		this.partSerialNumber = partSerialNumber;
	}

	public String getHardwareVersion() {
		return hardwareVersion;
	}

	public void setHardwareVersion(String hardwareVersion) {
		this.hardwareVersion = hardwareVersion;
	}

	public String getSoftwareVersion() {
		return softwareVersion;
	}

	public void setSoftwareVersion(String softwareVersion) {
		this.softwareVersion = softwareVersion;
	}

	public String getImsi() {
		return imsi;
	}

	public void setImsi(String imsi) {
		this.imsi = imsi;
	}

	public String getImei() {
		return imei;
	}

	public void setImei(String imei) {
		this.imei = imei;
	}

	public String getSimCardNumber() {
		return simCardNumber;
	}

	public void setSimCardNumber(String simCardNumber) {
		this.simCardNumber = simCardNumber;
	}

	public String getSimCardIp() {
		return simCardIp;
	}

	public void setSimCardIp(String simCardIp) {
		this.simCardIp = simCardIp;
	}

	public String getWifiModuleType() {
		return wifiModuleType;
	}

	public void setWifiModuleType(String wifiModuleType) {
		this.wifiModuleType = wifiModuleType;
	}

	public String getWifiIp() {
		return wifiIp;
	}

	public void setWifiIp(String wifiIp) {
		this.wifiIp = wifiIp;
	}

	public String getEthernetModuleType() {
		return ethernetModuleType;
	}

	public void setEthernetModuleType(String ethernetModuleType) {
		this.ethernetModuleType = ethernetModuleType;
	}

	public String getEthernetIp() {
		return ethernetIp;
	}

	public void setEthernetIp(String ethernetIp) {
		this.ethernetIp = ethernetIp;
	}

	public String getMainControlChipType() {
		return mainControlChipType;
	}

	public void setMainControlChipType(String mainControlChipType) {
		this.mainControlChipType = mainControlChipType;
	}

	public String getModule3gType() {
		return module3gType;
	}

	public void setModule3gType(String module3gType) {
		this.module3gType = module3gType;
	}

	public String getChip429Type() {
		return chip429Type;
	}

	public void setChip429Type(String chip429Type) {
		this.chip429Type = chip429Type;
	}

	public String getEmmcType() {
		return emmcType;
	}

	public void setEmmcType(String emmcType) {
		this.emmcType = emmcType;
	}

	public String getSdCardType() {
		return sdCardType;
	}

	public void setSdCardType(String sdCardType) {
		this.sdCardType = sdCardType;
	}

	public String getSpeechCodingChipType() {
		return speechCodingChipType;
	}

	public void setSpeechCodingChipType(String speechCodingChipType) {
		this.speechCodingChipType = speechCodingChipType;
	}

	public String getUsingState() {
		return usingState;
	}

	public void setUsingState(String usingState) {
		this.usingState = usingState;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getAircraftNumber() {
		return aircraftNumber;
	}

	public void setAircraftNumber(String aircraftNumber) {
		this.aircraftNumber = aircraftNumber;
	}

	public String getImgPath() {
		return imgPath;
	}

	public void setImgPath(String imgPath) {
		this.imgPath = imgPath;
	}

	public String getUnitType() {
		return unitType;
	}

	public void setUnitType(String unitType) {
		this.unitType = unitType;
	}
    
}
