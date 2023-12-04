package com_pro_mapper;

import java.util.ArrayList;
import com.myproject.model.Criteria;
import com.myproject.model.BoardDTO;

public interface BoardMapper {
	public ArrayList<BoardDTO> boardlist(BoardDTO list);
	public ArrayList<BoardDTO> boardpage(Criteria cri);
	public void boardwrite(BoardDTO write);
	public BoardDTO boarddetail(BoardDTO detail);
	public void boardremove(BoardDTO remove);
	public void boardmodify(BoardDTO modify);
	public void boardcnt(BoardDTO count);
	public int getTotal();
	
}
