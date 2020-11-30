 package com.commu.backend.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.commu.backend.dto.BoardResponseDto;
import com.commu.backend.service.BoardService;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
public class BoardApiController {
	
	private final BoardService boardService;
	
	@GetMapping("/board/{board_idx}")
	public BoardResponseDto findById(@PathVariable Long board_idx) {
		return boardService.findById(board_idx);	
	}
	
	@GetMapping("/board/all")
	public List<BoardResponseDto> findAll(){
		return boardService.findAll();
	}

}
