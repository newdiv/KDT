package com.myproject.pro;

import java.util.ArrayList;

import com.myproject.model.Criteria;
import com.myproject.model.ReplyPageVO;
import com.myproject.model.ReplyVO;
import com.pro.service.ReplyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller

public class ReplyController {

	@Autowired
	ReplyService rs;
	
	@RequestMapping(value = "/replies/new", method = RequestMethod.POST)
	public ResponseEntity<String> replywrite(@RequestBody ReplyVO reply){
		// insert가 성공했으면 result변수에 1저장
		// insert가 실패했으면 result변수에 0저장
		int result=rs.rewrite(reply);
		
		System.out.println(reply);
		// result가 1이면 HttpStatus.OK
		// result가 0이면 HttpStatus.INTERNAL_SERVER_ERROR
		return result==1? new ResponseEntity<>("success",HttpStatus.OK)
						: new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	@RequestMapping(value = "/replies/{bno}", method = RequestMethod.GET)
	public ResponseEntity<ArrayList<ReplyVO>> replylist(@PathVariable("bno") int bno){
		
		
		return new ResponseEntity<>(rs.list(bno),HttpStatus.OK);
		
	}
	
	@RequestMapping(value = "/replies/remove", method = RequestMethod.DELETE)
	public ResponseEntity<String> replyremove(@RequestBody ReplyVO reply){
		int result=rs.remove(reply);
		return result==1? new ResponseEntity<>("success",HttpStatus.OK)
				: new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		
		
	}
	
	@RequestMapping(value = "/replies/update", method = RequestMethod.PUT)
	public ResponseEntity<String> replymodify(@RequestBody ReplyVO reply){
		int result=rs.update(reply);
	
	return result==1? new ResponseEntity<>("success",HttpStatus.OK)
			: new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
}
}
