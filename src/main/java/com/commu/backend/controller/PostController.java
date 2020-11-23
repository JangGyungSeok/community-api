package com.commu.backend.controller;

import com.commu.backend.service.PostService;
import com.commu.backend.vo.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Optional;

@Controller
public class PostController {
    @Autowired
    PostService postService;

    @GetMapping(value="/board/{boardIdx}/{postIdx}")
    public ModelAndView showPost(ModelAndView modelAndView, @PathVariable("boardIdx") long boardIdx, @PathVariable("postIdx") long postIdx) {
        Optional<Post> post = this.postService.getPost(boardIdx, postIdx);

        modelAndView.setViewName("post/post-contents");
        modelAndView.addObject("post", post.get());

        return modelAndView;
    }

    @PostMapping(value="/board/{boardIdx}/{postIdx}")
    public ModelAndView insertPost(ModelAndView modelAndView, @PathVariable("boardIdx") long boardIdx, @PathVariable("postIdx") long postIdx) {
        Optional<Post> post = this.postService.getPost(boardIdx, postIdx);

        modelAndView.setViewName("post/post-contents");
        modelAndView.addObject("post", post.get());

        return modelAndView;
    }

    @PutMapping(value="/board/{boardIdx}/{postIdx}")
    public ModelAndView updatePost(ModelAndView modelAndView, @PathVariable("boardIdx") long boardIdx, @PathVariable("postIdx") long postIdx) {
        Optional<Post> post = this.postService.getPost(boardIdx, postIdx);

        modelAndView.setViewName("post/post-contents");
        modelAndView.addObject("post", post.get());

        return modelAndView;
    }

    @GetMapping(value="board/{boardIdx}/{postIdx}/edit")
    public ModelAndView editPostPage(ModelAndView modelAndView, @PathVariable("boardIdx") long boardIdx, @PathVariable("postIdx") long postIdx) {

        return modelAndView;
    }

    @DeleteMapping(value="/board/{boardIdx}/{postIdx}")
    public ModelAndView deletePost(ModelAndView modelAndView, @PathVariable("boardIdx") long boardIdx, @PathVariable("postIdx") long postIdx) {
        Optional<Post> post = this.postService.getPost(boardIdx, postIdx);

        modelAndView.setViewName("post/post-contents");
        modelAndView.addObject("post", post.get());

        return modelAndView;
    }
}
