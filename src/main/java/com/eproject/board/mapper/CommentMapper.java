package com.eproject.board.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.eproject.board.domain.CommentVO;

@Repository("com.eproject.board.mapper.CommentMapper")
public interface CommentMapper {
	public int commentCount() throws Exception;
	
	public List<CommentVO> commentList() throws Exception;
	
	public int commentInsert(CommentVO comment) throws Exception;
	
	public int commentUpdate(CommentVO comment) throws Exception;
	
	public int commentDelete(int cno) throws Exception;
	

}
