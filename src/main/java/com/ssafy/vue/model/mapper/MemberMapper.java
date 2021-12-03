package com.ssafy.vue.model.mapper;

import java.sql.SQLException;

import org.apache.ibatis.annotations.Mapper;

import com.ssafy.vue.model.MemberDto;

@Mapper
public interface MemberMapper {

	public MemberDto login(MemberDto memberDto) throws SQLException;
	public MemberDto userInfo(String userid) throws SQLException;
	void registerMember(MemberDto memberDto) throws Exception;
	void updateMember(MemberDto memberDto) throws Exception;
	void deleteMember(String userId) throws Exception;
}
