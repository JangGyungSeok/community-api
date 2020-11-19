package com.commu.backend.service;

import com.commu.backend.repository.community.BoardRepository;
import com.commu.backend.vo.Board;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoardService {

    @Autowired
    BoardRepository boardRepository;

    public List<Board> getBoardList() {
        return boardRepository.findAll();
    }
}
