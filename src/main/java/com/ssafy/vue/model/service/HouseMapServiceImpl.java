package com.ssafy.vue.model.service;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssafy.vue.model.DealInfoDto;
import com.ssafy.vue.model.FavAreaDto;
import com.ssafy.vue.model.HouseInfoDto;
import com.ssafy.vue.model.SidoGugunDongDto;
import com.ssafy.vue.model.mapper.HouseMapMapper;

@Service
public class HouseMapServiceImpl implements HouseMapService {
	
	@Autowired
	private SqlSession sqlSession;

	@Override
	public List<SidoGugunDongDto> getSido() throws Exception {
		return sqlSession.getMapper(HouseMapMapper.class).getSido();
	}

	@Override
	public List<SidoGugunDongDto> getGugunInSido(String sido) throws Exception {
		return sqlSession.getMapper(HouseMapMapper.class).getGugunInSido(sido);
	}

	@Override
	public List<HouseInfoDto> getDongInGugun(String gugun) throws Exception {
		return sqlSession.getMapper(HouseMapMapper.class).getDongInGugun(gugun);
	}

	@Override
	public List<HouseInfoDto> getAptInDong(String dong) throws Exception {
		return sqlSession.getMapper(HouseMapMapper.class).getAptInDong(dong);
	}

	@Override
	public List<DealInfoDto> getHouseDeal(String dong, String apt) throws Exception {
		HashMap<String, String> map = new HashMap<>();
		map.put("aptname", apt);
		map.put("dongcode", dong);
		return sqlSession.getMapper(HouseMapMapper.class).getHouseDeal(map);
	}
	
	@Override
	public void setFavArea(String id, String dong) throws Exception{
		HashMap<String, String> map = new HashMap<>();
		map.put("userid", id);
		map.put("dongcode", dong);
		sqlSession.getMapper(HouseMapMapper.class).setFavArea(map);
	}
	
	@Override
	public List<FavAreaDto> getFavArea(String id) throws Exception{
		return sqlSession.getMapper(HouseMapMapper.class).getFavArea(id);
	}
	
	@Override
	public void delFavArea(String id, String dong) throws Exception{
		HashMap<String, String> map = new HashMap<>();
		map.put("userid", id);
		map.put("dongcode", dong);
		sqlSession.getMapper(HouseMapMapper.class).delFavArea(map);
	}
	
	@Override
	public List<FavAreaDto> getTopFavArea() throws Exception{
		return sqlSession.getMapper(HouseMapMapper.class).getTopFavArea();
	}
}
