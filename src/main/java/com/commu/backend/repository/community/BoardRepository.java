package com.commu.backend.repository.community;

<<<<<<< HEAD
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.commu.backend.vo.BoardsVO;

@Repository
public interface BoardRepository extends JpaRepository<BoardsVO, Long> {

=======
import com.commu.backend.vo.Board;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface BoardRepository extends JpaRepository<Board, Long> {

    public Optional<Board> findById(Long boardIdx);
    public List<Board> findAll();
>>>>>>> 3b33cf69f934770e688c20cb57facecfbe59440b
}
