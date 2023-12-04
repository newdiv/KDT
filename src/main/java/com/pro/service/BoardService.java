package com.pro.service;

import java.util.ArrayList;



import com.myproject.model.BoardDTO;

import com.myproject.model.Criteria;



public interface BoardService {

	public ArrayList<BoardDTO> boardlist(BoardDTO list);
	public void boardwrite(BoardDTO write);
	public BoardDTO boarddetail(BoardDTO detail);
	public void boardremove(BoardDTO remove);
	public void boardmodify(BoardDTO modify);
	public void boardcnt(BoardDTO count);
	public ArrayList<BoardDTO> boardpage(Criteria cri);
	public int getTotal();
	
}
