package com.ssafy.vue.model.service;

import com.ssafy.vue.model.MemberDto;

public interface MemberService {

	public MemberDto login(MemberDto memberDto) throws Exception;
	public MemberDto userInfo(String userid) throws Exception;
	void registerMember(MemberDto memberDto) throws Exception;
	void updateMember(MemberDto memberDto) throws Exception;
	void deleteMember(String userId) throws Exception;
}
