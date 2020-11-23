package com.commu.backend.service;

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
}
