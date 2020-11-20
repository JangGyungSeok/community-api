package com.commu.backend.repository.community;

import com.commu.backend.vo.Board;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface BoardRepository extends JpaRepository<Board, Long> {

    public Optional<Board> findById(Long boardIdx);
    public List<Board> findAll();
}