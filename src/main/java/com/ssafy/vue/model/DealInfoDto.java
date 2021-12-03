package com.ssafy.vue.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "DealInfoDto : 아파트 거래정보", description = "아파트의 거래 정보를 나타낸다.")
public class DealInfoDto {
	@ApiModelProperty(value = "번호")
	private int no; // 번호
	@ApiModelProperty(value = "아파트 코드")
	private int aptCode; // 아파트 코드
	@ApiModelProperty(value = "아파트 이름")
	private String aptName; // 아파트 이름
	@ApiModelProperty(value = "거래금액")
	private String dealAmount; // 거래금액
	@ApiModelProperty(value = "거래 년도")
	private int dealYear; // 거래 년도
	@ApiModelProperty(value = "거래 월")
	private int dealMonth; // 거래 월
	@ApiModelProperty(value = "거래 일")
	private int dealDay; // 거래 일
	@ApiModelProperty(value = "평수")
	private String area; // 평수
	@ApiModelProperty(value = "층")
	private String floor; // 층	
	@ApiModelProperty(value = "종류")
	private String type; // 종류	
	@ApiModelProperty(value = "대출금액")
	private String rentMoney; // 대출금액
	
	public DealInfoDto(){	
	}
	
	@Override
	public String toString() {
		return "HouseDealDto [no=" + no + ", aptCode=" + aptCode + ", dealAmount=" + dealAmount + ", dealYear="
				+ dealYear + ", dealMonth=" + dealMonth + ", dealDay=" + dealDay + ", area=" + area + ", floor=" + floor
				+ ", type=" + type + ", rentMoney=" + rentMoney + "]";
	}

	public String getAptName() {
		return aptName;
	}
	public void setAptName(String aptName) {
		this.aptName = aptName;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public int getAptCode() {
		return aptCode;
	}
	public void setAptCode(int aptCode) {
		this.aptCode = aptCode;
	}
	public String getDealAmount() {
		return dealAmount;
	}
	public void setDealAmount(String dealAmount) {
		this.dealAmount = dealAmount;
	}
	public int getDealYear() {
		return dealYear;
	}
	public void setDealYear(int dealYear) {
		this.dealYear = dealYear;
	}
	public int getDealMonth() {
		return dealMonth;
	}
	public void setDealMonth(int dealMonth) {
		this.dealMonth = dealMonth;
	}
	public int getDealDay() {
		return dealDay;
	}
	public void setDealDay(int dealDay) {
		this.dealDay = dealDay;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getFloor() {
		return floor;
	}
	public void setFloor(String floor) {
		this.floor = floor;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getRentMoney() {
		return rentMoney;
	}
	public void setRentMoney(String rentMoney) {
		this.rentMoney = rentMoney;
	}
}
