package com_pro_mapper;

import java.util.ArrayList;

import com.myproject.model.ReplyVO;

public interface ReplyMapper {
	public int rewrite(ReplyVO reply);
	// 
		public ArrayList<ReplyVO> list(int bno);
		public int update(ReplyVO reply);
		
		public int remove(ReplyVO reply);
}
