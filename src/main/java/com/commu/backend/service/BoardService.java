package com.commu.backend.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.commu.backend.dto.BoardResponseDto;
import com.commu.backend.repository.community.BoardRepository;
import com.commu.backend.vo.BoardsVO;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class BoardService {
	
	private final BoardRepository boardRepository;
	
	public BoardResponseDto findById(Long board_idx) {
		BoardsVO vo = boardRepository.findById(board_idx)
				.orElseThrow(() -> new IllegalArgumentException("해당 게시판이 없습니다."));
		return new BoardResponseDto(vo);
	}

	public ArrayList<BoardResponseDto> findAll() {
		List<BoardsVO> boardList = boardRepository.findAll();
		return new ArrayList(boardList);
	}
}
