package com.commu.backend.service;

import com.commu.backend.repository.community.BoardRepository;
import com.commu.backend.vo.Board;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BoardService {

    @Autowired
    BoardRepository boardRepository;
    // 게시판 리스트
    public List<Board> getBoardList() {
        return boardRepository.findAll();
    }
    // 게시판 단일
    public Optional<Board> getBoard(Long boardIdx) {return boardRepository.findByBoardIdx(boardIdx);}

    // 게시판 정보 변경
    public Board updateBoard(Long boardIdx) {
        Board board = this.boardRepository.findByBoardIdx(boardIdx).get();
        board.setBoardName("수정하기 테스트");
        if (board != null) {
            return this.boardRepository.save(board);
        }
        return null;
    }
}
