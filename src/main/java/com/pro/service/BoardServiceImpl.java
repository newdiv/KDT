package com.pro.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myproject.model.BoardDTO;

import com_pro_mapper.BoardMapper;
import com.myproject.model.Criteria;

@Service

public class BoardServiceImpl implements BoardService{

	@Autowired
	BoardMapper bm;
	
	public ArrayList<BoardDTO> boardlist(BoardDTO list) {
		return bm.boardlist(list);
	};
	public void boardwrite(BoardDTO write) {
		bm.boardwrite(write);
	};
	public BoardDTO boarddetail(BoardDTO detail) {
	 return bm.boarddetail(detail);
	};
	public void boardremove(BoardDTO remove) {
		bm.boardremove(remove);
	}
	public void boardcnt(BoardDTO count) {
		bm.boardcnt(count);
	}
	
	public void boardmodify(BoardDTO modify) {
		bm.boardmodify(modify);
	}
	
	public ArrayList<BoardDTO> boardpage(Criteria cri){
		return bm.boardpage(cri);
	}
	public int getTotal() {
		return bm.getTotal();
	}
	
	
}
