package com.commu.backend.repository.community;

import com.commu.backend.vo.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {
    // 게시판 기준 게시물 조회
    public List<Post> findByBoardIdx(long boardIdx);
    // 게시판 기준 단일 게시물 조회
    public Optional<Post> findByBoardIdxAndPostIdx(long boardIdx, long postIdx);
    
    // 전체 게시판 전체 게시물 조회
    public List<Post> findAll();
}
