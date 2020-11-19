package com.commu.backend.controller;

import com.commu.backend.repository.community.BoardRepository;
import com.commu.backend.service.BoardService;
import com.commu.backend.service.PostService;
import com.commu.backend.vo.Board;
import com.commu.backend.vo.Post;
import io.swagger.models.Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class BoardController {

    @Autowired
    BoardService boardService;

    @Autowired
    PostService postService;

    @RequestMapping(value="/test", method = RequestMethod.GET)
    public ModelAndView abc(ModelAndView modelAndView) {
        modelAndView.setViewName("abc");
        modelAndView.addObject("test1", "test2");

        return modelAndView;
    }

    @RequestMapping(value="/board", method = RequestMethod.GET)
    public ModelAndView test(ModelAndView modelAndView) {
        List<Board> boardList = this.boardService.getBoardList();

        modelAndView.setViewName("board/board-list");
        modelAndView.addObject("boardList", boardList);

        return modelAndView;
    }

    @RequestMapping(value="/board/{boardName}", method = RequestMethod.GET)
    public ModelAndView test2(ModelAndView modelAndView, @PathVariable("boardName") String boardName) {
        List<Post> postListA = this.postService.getPostList("testBoard1");
        List<Post> postListB = this.postService.getPostList("testBoard2");

        modelAndView.setViewName("post/post-list");
        modelAndView.addObject("postListA", postListA);
        modelAndView.addObject("postListB", postListB);
        System.out.println(boardName);
        return modelAndView;
    }
}
