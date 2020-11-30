package com.commu.backend.dto;

import java.util.Date;

import com.commu.backend.vo.BoardsVO;

import lombok.Getter;

@Getter
public class BoardResponseDto {
	
	private String board_name;
	private int board_creator;
	private Date created_at ;
	private Date updated_at;
	
	public BoardResponseDto(BoardsVO vo) {
		this.board_name = vo.getBoard_name();
		this.board_creator = vo.getBoard_creator();
		this.created_at = vo.getCreated_at();
		this.updated_at = vo.getUpdated_at();
	}
}
