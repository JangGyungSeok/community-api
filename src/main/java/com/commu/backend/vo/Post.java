package com.commu.backend.vo;

import java.util.Date;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="posts")
public class Post {
	@Id
	@GeneratedValue
	@Column(name = "post_idx")
	private long postIdx;

	@Column(name = "board_idx")
	private long boardIdx;

	@Column(name = "post_title")
	private String postTitle;

	@Column(name = "post_contents")
	private String postContents;

	@Column(name = "post_creator")
	private String postCreator;

	@Column(name = "created_at")
	private Date createdAt ;

	@Column(name = "updated_at")
	private Date updatedAt;
}
