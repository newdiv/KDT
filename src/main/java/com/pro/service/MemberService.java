package com.pro.service;

import java.util.ArrayList;

import com.myproject.model.MemberDTO;

public interface MemberService {
//회원가입
	public void write(MemberDTO member);
	
	//회원정보수정
	public void modify();
	
	//회원목록리스트
	public ArrayList<MemberDTO> list();
	
	
	//회원상세내용(관리자)
	public MemberDTO detail(MemberDTO member);
public void modify(MemberDTO member);
public void remove(MemberDTO member);	
public MemberDTO login(MemberDTO member); 
}

