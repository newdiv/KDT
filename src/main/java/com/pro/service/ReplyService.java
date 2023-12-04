package com.pro.service;

import java.util.ArrayList;


import com.myproject.model.ReplyVO;

public interface ReplyService {

	public int rewrite(ReplyVO reply);
	public ArrayList<ReplyVO> list(int bno);
	public int update(ReplyVO reply);
	
	public int remove(ReplyVO reply);
	
}
