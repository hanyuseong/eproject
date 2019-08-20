package com.eproject;


import javax.annotation.Resource;
 
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
 
import com.eproject.board.mapper.BoardMapper;
 
@Controller
public class JspTest {
 
    @Resource(name="com.eproject.board.mapper.BoardMapper")
    BoardMapper mBoardMapper;
    
    @RequestMapping("/test")
    private String jspTest() throws Exception{
        
        System.out.println(mBoardMapper.boardCount()); // <<<<TEST
        
        return "index"; 
    }
}
