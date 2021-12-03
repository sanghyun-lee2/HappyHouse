package com.ssafy.vue.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "FavAreaDto : 아파트 즐겨찾기 정보", description = "아파트 즐겨찾기 정보를 나타낸다.")
public class FavAreaDto {
	@ApiModelProperty(value = "시도 코드")
	private String sidoCode; // 시도 코드
	@ApiModelProperty(value = "시도 이름")
	private String sidoName; // 시도 이름
	@ApiModelProperty(value = "구군 코드")
	private String gugunCode; // 구군 코드
	@ApiModelProperty(value = "구군 이름")
	private String gugunName; // 구군 이름
	@ApiModelProperty(value = "동 코드")
	private String dongCode; // 동 코드
	@ApiModelProperty(value = "동 이름")
	private String dongName; // 동 이름
	@ApiModelProperty(value = "아파트 코드")
	private String aptCode; // 아파트 코드
	@ApiModelProperty(value = "아파트 이름")
	private String aptName; // 아파트 이름
	@ApiModelProperty(value = "등록 갯수")
	private String favCnt; // 등록 갯수
	
	public FavAreaDto(){	
	}
	
	@Override
	public String toString() {
		return "FavAreaDto [sidoCode=" + sidoCode + ", sidoName=" + sidoName + ", gugunCode=" + gugunCode
				+ ", gugunName=" + gugunName + ", dongCode=" + dongCode + ", dongName=" + dongName + ", aptCode="
				+ aptCode + ", aptName=" + aptName + "]";
	}

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

	public String getDongCode() {
		return dongCode;
	}

	public void setDongCode(String dongCode) {
		this.dongCode = dongCode;
	}

	public String getDongName() {
		return dongName;
	}

	public void setDongName(String dongName) {
		this.dongName = dongName;
	}

	public String getAptCode() {
		return aptCode;
	}

	public void setAptCode(String aptCode) {
		this.aptCode = aptCode;
	}

	public String getAptName() {
		return aptName;
	}

	public void setAptName(String aptName) {
		this.aptName = aptName;
	}
	
	public String getFavCnt() {
		return favCnt;
	}

	public void setFavCnt(String favCnt) {
		this.favCnt = favCnt;
	}
}
