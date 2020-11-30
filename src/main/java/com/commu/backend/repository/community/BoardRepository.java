package com.commu.backend.repository.community;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.commu.backend.vo.BoardsVO;

@Repository
public interface BoardRepository extends JpaRepository<BoardsVO, Long> {

}
