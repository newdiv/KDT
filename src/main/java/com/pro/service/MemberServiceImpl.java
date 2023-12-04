package com.pro.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myproject.model.MemberDTO;

import com_pro_mapper.MemberMapper;

@Service
public class MemberServiceImpl implements MemberService {
	
	@Autowired
	MemberMapper mm; // MemberMapper mm = new MamberMapper();
	
	
	public void write(MemberDTO member) {
		
		//회원가입 되게 해라.
		mm.write(member);
	}
	public void modify() {
		//회원정보수정
	}
	public ArrayList<MemberDTO> list() {
		//회원 목록 리스트
		return mm.list();
	}
	
	public MemberDTO detail(MemberDTO member) {
		//회원상세내용
		return mm.detail(member);
		
	}
	
	public void modify(MemberDTO member) {
		mm.modify(member);
	}
	public void remove(MemberDTO member) {
		mm.remove(member);
	}
	public MemberDTO login(MemberDTO member) {
		return mm.login(member);
	}
}
