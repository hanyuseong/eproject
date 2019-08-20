package com.eproject.board.domain;
 
import java.util.Date;
 
public class BoardVO {
 
    private int bno;
    private String subject;
    private String content;
    private String writer;
    private Date reg_date;
    
	public int getBno() {
		return bno;
	}
	public String getSubject() {
		return subject;
	}
	public String getContent() {
		return content;
	}
	public String getWriter() {
		return writer;
	}
	public Date getReg_date() {
		return reg_date;
	}
	public void setBno(int bno) {
		this.bno = bno;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public void setReg_date(Date reg_date) {
		this.reg_date = reg_date;
	}
 
}
