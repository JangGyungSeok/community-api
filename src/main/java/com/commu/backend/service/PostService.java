package com.commu.backend.service;

<<<<<<< HEAD
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
=======
import com.commu.backend.repository.community.PostRepository;
import com.commu.backend.vo.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PostService {
    @Autowired
    PostRepository postRepository;

    public List<Post> getPostList(long boardIdx) {
        return this.postRepository.findByBoardIdx(boardIdx);
    }
    public Optional<Post> getPost(long boardIdx, long postIdx) {return this.postRepository.findByBoardIdxAndPostIdx(boardIdx, postIdx);}
>>>>>>> 3b33cf69f934770e688c20cb57facecfbe59440b
}
