package com.commu.backend.vo;

import java.util.Date;

import lombok.Data;

@Data
public class BoardsVO {

	private long board_idx;
	private String board_name;
	private int board_creator;
	private Date created_at ;
	private Date updated_at;
}
