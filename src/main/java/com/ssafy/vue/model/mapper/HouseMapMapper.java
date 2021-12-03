package com.ssafy.vue.model.mapper;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.ssafy.vue.model.DealInfoDto;
import com.ssafy.vue.model.FavAreaDto;
import com.ssafy.vue.model.HouseInfoDto;
import com.ssafy.vue.model.SidoGugunDongDto;

@Mapper
public interface HouseMapMapper {

	List<SidoGugunDongDto> getSido() throws SQLException;
	List<SidoGugunDongDto> getGugunInSido(String sido) throws SQLException;
	List<HouseInfoDto> getDongInGugun(String gugun) throws SQLException;
	List<HouseInfoDto> getAptInDong(String dong) throws SQLException;
	List<DealInfoDto> getHouseDeal(HashMap<String, String> map) throws SQLException;
	int setFavArea(HashMap<String, String> map) throws SQLException;
	List<FavAreaDto> getFavArea(String id) throws SQLException;
	int delFavArea(HashMap<String, String> map) throws SQLException;
	List<FavAreaDto> getTopFavArea() throws SQLException;
}
