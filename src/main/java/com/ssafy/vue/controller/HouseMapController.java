package com.ssafy.vue.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ssafy.vue.model.SidoGugunDongDto;
import com.ssafy.vue.model.service.HouseMapService;
import com.ssafy.vue.model.BoardDto;
import com.ssafy.vue.model.DealInfoDto;
import com.ssafy.vue.model.FavAreaDto;
import com.ssafy.vue.model.HouseInfoDto;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

@RestController
@RequestMapping("/house")
@Api("House 컨트롤러  API V1")
public class HouseMapController {
	
	private final Logger logger = LoggerFactory.getLogger(HouseMapController.class);

	@Autowired
	private HouseMapService haHouseMapService;
	
	@ApiOperation(value = "시도 정보", notes = "전국의 시도를 반환한다.", response = List.class)
	@GetMapping("/sido")
	public ResponseEntity<List<SidoGugunDongDto>> sido() throws Exception {
		logger.info("sido - 호출");
		return new ResponseEntity<List<SidoGugunDongDto>>(haHouseMapService.getSido(), HttpStatus.OK);
	}
	
	@ApiOperation(value = "구군 정보", notes = "전국의 구군을 반환한다.", response = List.class)
	@GetMapping("/gugun")
	public ResponseEntity<List<SidoGugunDongDto>> gugun(@RequestParam("sido") @ApiParam(value = "시도코드.", required = true) String sido) throws Exception {
		logger.info("gugun - 호출");
		return new ResponseEntity<List<SidoGugunDongDto>>(haHouseMapService.getGugunInSido(sido), HttpStatus.OK);
	}
	
	@ApiOperation(value = "동 정보", notes = "전국의 동을 반환한다.", response = List.class)
	@GetMapping("/dong")
	public ResponseEntity<List<HouseInfoDto>> dong(@RequestParam("gugun") String gugun) throws Exception {
		logger.info("dong - 호출");
		return new ResponseEntity<List<HouseInfoDto>>(haHouseMapService.getDongInGugun(gugun), HttpStatus.OK);
	}
	
	@ApiOperation(value = "아파트 정보", notes = "해당되는 아파트를 반환한다.", response = List.class)
	@GetMapping("/apt")
	public ResponseEntity<List<HouseInfoDto>> apt(@RequestParam("dong") String dong) throws Exception {
		logger.info("apt - 호출");
		return new ResponseEntity<List<HouseInfoDto>>(haHouseMapService.getAptInDong(dong), HttpStatus.OK);
	}
	
	@ApiOperation(value = "아파트 거래 정보", notes = "해당되는 거래정보를 반환한다.", response = List.class)
	@GetMapping("/deal")
	public ResponseEntity<List<DealInfoDto>> deal(@RequestParam("dong") String dong, @RequestParam("apt") String apt) throws Exception {
		logger.info("deal - 호출");
		return new ResponseEntity<List<DealInfoDto>>(haHouseMapService.getHouseDeal(dong, apt), HttpStatus.OK);
	}
	
	@ApiOperation(value = "관심지역 정보", notes = "해당되는 관심지역을 설정한다.", response = String.class)
	@PostMapping("/fav/{id}/{dong}")
	public String setFavArea(@PathVariable("id") @ApiParam(value = "회원아이디", required = true) String id,
			@PathVariable("dong") @ApiParam(value = "동 코드", required = true) String dong) throws Exception {
		logger.info("post fav - 호출");
		logger.info("id : " + id + " dong : " + dong);
		haHouseMapService.setFavArea(id, dong);
		return "";
	}
	
	@ApiOperation(value = "관심지역 정보", notes = "해당되는 관심지역을 반환한다.", response = List.class)
	@GetMapping("/fav/{id}")
	public ResponseEntity<List<FavAreaDto>> fav(@PathVariable("id") @ApiParam(value = "회원아이디", required = true) String id) throws Exception {
		logger.info("get fav - 호출");
		return new ResponseEntity<List<FavAreaDto>>(haHouseMapService.getFavArea(id), HttpStatus.OK);
	}
	
	@ApiOperation(value = "관심지역 정보", notes = "해당되는 관심지역을 삭제한다.", response = String.class)
	@DeleteMapping("/fav/{id}/{dong}")
	public String delFavArea(@PathVariable("id") @ApiParam(value = "회원아이디", required = true) String id,
			@PathVariable("dong") @ApiParam(value = "동 코드", required = true) String dong) throws Exception {
		logger.info("del fav - 호출");
		logger.info("id : " + id + " dong : " + dong);
		haHouseMapService.delFavArea(id, dong);
		return "";
	}
	
	@ApiOperation(value = "관심지역 정보", notes = "가장 많이등록한 관심지역을 반환한다.", response = List.class)
	@GetMapping("/topfav")
	public ResponseEntity<List<FavAreaDto>> topfav() throws Exception {
		logger.info("get topfav - 호출");
		return new ResponseEntity<List<FavAreaDto>>(haHouseMapService.getTopFavArea(), HttpStatus.OK);
	}
}
