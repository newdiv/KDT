package com.pro.service;

import com.pro.service.ReplyService;

import com_pro_mapper.ReplyMapper;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myproject.model.ReplyPageVO;
import com.myproject.model.ReplyVO;

@Service




public class ReplyServiceImpl implements ReplyService {

	@Autowired
	ReplyMapper rm;
	
	public int rewrite(ReplyVO reply) {
		
		return rm.rewrite(reply);
	}
	
	public ArrayList<ReplyVO> list(int bno){
		return rm.list(bno);
		
	}
	public int update(ReplyVO reply) {
		
		return rm.update(reply);
	}
	// 댓글 삭제를 위한 설계
	public int remove(ReplyVO reply) {
		return rm.remove(reply);	
	}
	
}
