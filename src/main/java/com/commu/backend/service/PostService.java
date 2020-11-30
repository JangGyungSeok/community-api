package com.commu.backend.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.commu.backend.dto.PostResponseDto;
import com.commu.backend.repository.community.PostRepository;
import com.commu.backend.vo.PostsVO;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class PostService {

	private final PostRepository postRepository;
	
	public PostResponseDto findById(Long post_idx) {
		PostsVO vo = postRepository.findById(post_idx)
				.orElseThrow(() -> new IllegalArgumentException("포스트 오류"));
		return new PostResponseDto(vo);
	}

	public List<PostsVO> findAll() {
		List<PostsVO> postList = postRepository.findAll();
		
		return postList;
	}
}
