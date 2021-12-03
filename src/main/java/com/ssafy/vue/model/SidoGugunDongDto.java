package com.ssafy.vue.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "SidoGugunDongDto : 시도, 구군, 동 정보", description = "시도, 구군, 동의 이름을 나타낸다.")
public class SidoGugunDongDto {

	@ApiModelProperty(value = "시도코드")
	private String sidoCode;
	@ApiModelProperty(value = "시도이름")
	private String sidoName;
	@ApiModelProperty(value = "구군코드")
	private String gugunCode;
	@ApiModelProperty(value = "구군이름")
	private String gugunName;
	@ApiModelProperty(value = "동코드")
	private String dongCode;
	@ApiModelProperty(value = "동이름")
	private String dongName;

	public String getSidoCode() {
		return sidoCode;
	}

	public void setSidoCode(String sidoCode) {
		this.sidoCode = sidoCode;
	}

	public String getSidoName() {
		return sidoName;
	}

	public void setSidoName(String sidoName) {
		this.sidoName = sidoName;
	}

	public String getGugunCode() {
		return gugunCode;
	}

	public void setGugunCode(String gugunCode) {
		this.gugunCode = gugunCode;
	}

	public String getGugunName() {
		return gugunName;
	}

	public void setGugunName(String gugunName) {
		this.gugunName = gugunName;
	}
	
	public String getDongName() {
		return dongName;
	}

	public void setDongName(String dongName) {
		this.dongName = dongName;
	}
}
