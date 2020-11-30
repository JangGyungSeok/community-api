package com.commu.backend.dto;

import java.util.Date;

import com.commu.backend.vo.PostsVO;

import lombok.Getter;

@Getter
public class PostResponseDto {
	
	private Long board_idx;
	private String post_title;
	private String post_contents;
	private String post_creator;
	private Date created_at ;
	private Date updated_at;

	public PostResponseDto (PostsVO vo) {
		this.board_idx = vo.getBoard_idx();
		this.post_title = vo.getPost_title();
		this.post_contents = vo.getPost_contents();
		this.post_creator = vo.getPost_creator();
		this.created_at = vo.getCreated_at();
		this.updated_at = vo.getUpdated_at();
	}
}
