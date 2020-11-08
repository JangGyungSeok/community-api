package com.commu.backend.vo;

import java.util.Date;

import lombok.Data;

@Data
public class PostsVO {

	private long post_idx;
	private long board_idx;
	private String post_title;
	private String post_contents;
	private String post_creator;
	private Date created_at ;
	private Date updated_at;
}
