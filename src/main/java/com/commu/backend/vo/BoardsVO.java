package com.commu.backend.vo;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "boards")
public class BoardsVO {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long board_idx;
	
	private String board_name;
	private int board_creator;
	private Date created_at ;
	private Date updated_at;
	
	@Builder
	public BoardsVO (Long board_idx, String board_name, int board_creator, Date created_at, Date updated_at) {
		this.board_idx = board_idx;
		this.board_name = board_name;
		this.board_creator = board_creator;
		this.created_at = created_at;
		this.updated_at = updated_at;
	}
}
