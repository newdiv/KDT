package com.myproject.model;

import java.sql.Date;

public class BoardDTO {
	// 게시판번호 (bno)
	private int bno;
	// 제목 (title)
	private String title;
	// 내용 (content)
	private String content;
	// 작성일자 (regdate)
	private Date regdate;

	// 조회수 (cnt)
	private int cnt;
	// 아이디 (id)
	private String id;
	
	
	
	
	public int getBno() {
		return bno;
	}
	public void setBno(int bno) {
		this.bno = bno;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Date getRegdate() {
		return regdate;
	}
	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}
	public int getCnt() {
		return cnt;
	}
	public void setCnt(int cnt) {
		this.cnt = cnt;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "BoardDTO [bno=" + bno + ", title=" + title + ", content=" + content + ", regdate=" + regdate + ", cnt="
				+ cnt + ", id=" + id + "]";
	}
	
	
}
