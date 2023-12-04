package com.myproject.pro;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;

import javax.servlet.http.HttpSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.myproject.model.BoardDTO;
import com.myproject.model.Criteria;
import com.myproject.model.MemberDTO;
import com.myproject.model.PageMakerDTO;
import com.pro.service.BoardService;
import com.pro.service.MemberService;

@Controller
public class BoardController {

	private static final Logger log = LoggerFactory.getLogger(BoardController.class);
	
	@Autowired
	BoardService bs;
	
	
	
	
	@RequestMapping(value = "board", method = RequestMethod.GET)
	public String zzzzzz(Model model, Criteria cri) {	
		
		model.addAttribute("boardlist", bs.boardpage(cri) );
		int total = bs.getTotal();
		PageMakerDTO pagemake = new PageMakerDTO(cri, total);
		model.addAttribute("pageMaker",pagemake);
		// model.addAttribute("pageMaker",new PageMakeDTO(cri, total);
		
return "board/board";
	}
	
	
	
	/*@RequestMapping(value = "board/board", method = RequestMethod.GET)
	public void zzzzzz() {	}*/
	@RequestMapping(value = "/write", method = RequestMethod.GET)
	public String write () {
		return "board/write";
	}
	
	@RequestMapping(value = "/write", method = RequestMethod.POST)
	public String write(BoardDTO write) {
		
		bs.boardwrite(write);
		return "redirect:/board";
	}
	
	@GetMapping("board/detail")
	public void detail(BoardDTO detail, Model model) {
		model.addAttribute("detail",bs.boarddetail(detail));
		bs.boarddetail(detail);
		
		//조회수
		bs.boardcnt(detail);
		
	}
	
	@PostMapping("board/boardremove")
	
			
	public String boardremove(BoardDTO remove) {
		
		bs.boardremove(remove);
		return "redirect:/board";
	}
	
	@PostMapping("board/boardmodify")
	public String boardmodify(BoardDTO modify) {
		bs.boardmodify(modify);
		return "redirect:/board";
	}
	
	
}
