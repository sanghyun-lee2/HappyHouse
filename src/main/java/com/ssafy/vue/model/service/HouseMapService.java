package com.ssafy.vue.model.service;

import java.util.List;

import com.ssafy.vue.model.DealInfoDto;
import com.ssafy.vue.model.FavAreaDto;
import com.ssafy.vue.model.HouseInfoDto;
import com.ssafy.vue.model.SidoGugunDongDto;

public interface HouseMapService {

	List<SidoGugunDongDto> getSido() throws Exception;
	List<SidoGugunDongDto> getGugunInSido(String sido) throws Exception;
	List<HouseInfoDto> getDongInGugun(String gugun) throws Exception;
	List<HouseInfoDto> getAptInDong(String dong) throws Exception;
	List<DealInfoDto> getHouseDeal(String dong, String apt) throws Exception;
	void setFavArea(String id, String dong) throws Exception;
	List<FavAreaDto> getFavArea(String id) throws Exception;
	void delFavArea(String id, String dong) throws Exception;
	List<FavAreaDto> getTopFavArea() throws Exception;
}
