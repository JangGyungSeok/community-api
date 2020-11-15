package com.commu.backend.vo;

import java.util.Date;

import lombok.Data;

@Data
public class CommentsVO {

	private long comment_idx;
	private long board_idx;
	private long post_idx;
	private String comment_contents;
	private String comment_creator;
	private Date created_at;
	private Date updated_at;
}
