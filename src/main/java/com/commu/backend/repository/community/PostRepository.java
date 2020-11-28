package com.commu.backend.repository.community;

import com.commu.backend.vo.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {
    public Optional<Post> findById(Long postIdx);
    public List<Post> findByBoardIdx(long boardIdx);
    public Optional<Post> findByBoardIdxAndPostIdx(long boardIdx, long postIdx);
    public List<Post> findAll();
}
