package com.commu.backend.repository.community;

import com.commu.backend.vo.Board;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface BoardRepository extends JpaRepository<Board, Long> {
    
    // 전체 조회
    public List<Board> findAll();
    // 단일 조회
    public Optional<Board> findByBoardIdx(Long boardIdx);
}
