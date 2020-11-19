package com.commu.backend.service;

import com.commu.backend.repository.community.PostRepository;
import com.commu.backend.vo.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {
    @Autowired
    PostRepository postRepository;

    public List<Post> getPostList(String boardName) {
        return this.postRepository.findByBoardIdx(boardName);
    }
}
