package com.commu.backend.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.commu.backend.dto.PostResponseDto;
import com.commu.backend.service.PostService;
import com.commu.backend.vo.PostsVO;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@RequiredArgsConstructor
@RestController
@Log4j2
public class PostApiController {

	private final PostService postService;
	
	@GetMapping("/board/post/{post_idx}")
	public PostResponseDto findById(@PathVariable Long post_idx) {
		return postService.findById(post_idx);
	}
	
	@GetMapping("/board/post/all")
	public ModelAndView findAll(ModelAndView mav){
		log.info("---------------log start----------------");
		postService.findAll().forEach(post -> {
			log.info(post.toString());
		});
		
		mav.addObject("postList", postService.findAll());
		mav.setViewName("index");
		
		return mav;
	}
}
