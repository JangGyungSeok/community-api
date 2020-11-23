package com.commu.backend.controller;

import com.commu.backend.service.BoardService;
import com.commu.backend.service.PostService;
import com.commu.backend.vo.Board;
import com.commu.backend.vo.Comment;
import com.commu.backend.vo.Post;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Optional;

@Controller
public class BoardController {

    @Autowired
    BoardService boardService;

    PostService postService;

    // 게시판 목록 출력
    @GetMapping(value="/board")
    public ModelAndView showBoardList(ModelAndView modelAndView) {
        List<Board> boardList = this.boardService.getBoardList();

        modelAndView.setViewName("board/board-list");
        modelAndView.addObject("boardList", boardList);
        for (Board board : boardList) {
            System.out.println(board.getBoardIdx());
            for(Post post : board.getPosts()){
                System.out.println(post.getPostTitle());
            }
        }

        return modelAndView;
    }

    //게시판 출력
    @GetMapping(value="/board/{boardIdx}")
    public ModelAndView showBoard(ModelAndView modelAndView, @PathVariable("boardIdx") long boardIdx) {
        List<Post> postListA = this.postService.getPostList(boardIdx);

        modelAndView.setViewName("post/post-list");
        modelAndView.addObject("postListA", postListA);


        System.out.println(postListA);


        return modelAndView;
    }

    // 게시판 추가 // 추후에 특정 페이지에서 호출하게 하도록 (Parameter와 함께)
    @PostMapping(value="/board")
    public ModelAndView insertBoard(ModelAndView modelAndView) {

        return modelAndView;
    }

    // 게시판 수정
    @PutMapping(value="/board/{boardIdx}")
    public ModelAndView updateBoard(ModelAndView modelAndView, @PathVariable("boardIdx") long boardIdx) {

        return modelAndView;
    }

    @GetMapping(value="/board/{boardIdx}/edit")
    public ModelAndView editBoardPage(ModelAndView modelAndView, @PathVariable("boardIdx") long boardIdx) {

        return modelAndView;
    }

    // 게시판 삭제
    @DeleteMapping(value="/board/{boardIdx}")
    public ModelAndView deleteBoard(ModelAndView modelAndView, @PathVariable("boardIdx") long boardIdx) {

        return modelAndView;
    }
}
