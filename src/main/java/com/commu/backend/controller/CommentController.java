package com.commu.backend.controller;

import com.commu.backend.service.BoardService;
import com.commu.backend.vo.Board;
import com.commu.backend.vo.Comment;
import com.commu.backend.vo.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class CommentController {
    @Autowired
    BoardService boardService;

    @GetMapping(value="/test11")
    public ModelAndView test11(ModelAndView modelAndView) {
        return modelAndView;
    }
}
