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
@Table(name = "posts")
public class PostsVO {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long post_idx;
	
	private Long board_idx;
	private String post_title;
	private String post_contents;
	private String post_creator;
	private Date created_at ;
	private Date updated_at;
	
	@Builder
	public PostsVO (
			Long post_idx, Long board_idx, String post_title, 
			String post_contents, String post_creator, Date created_at, Date updated_at) {
		this.post_idx = post_idx;
		this.board_idx = board_idx;
		this.post_title = post_title;
		this.post_contents = post_contents;
		this.post_creator = post_creator;
		this.created_at = created_at;
		this.updated_at = updated_at;
		
	}
}
