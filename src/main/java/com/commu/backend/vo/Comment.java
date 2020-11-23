package com.commu.backend.vo;

import java.util.Date;

import lombok.Data;
import lombok.ToString;

import javax.persistence.*;

@Data
@Entity
@ToString(exclude = "post")
@Table(name="comments")
public class Comment {

	@Id
	@GeneratedValue
	@Column(name = "comment_idx")
	private long commentIdx;

	@Column(name = "board_idx")
	private long boardIdx;

	@Column(name = "post_idx", insertable = false, updatable = false)
	private long postIdx;

	@Column(name = "comment_contents")
	private String commentContents;

	@Column(name = "comment_creator")
	private String commentCreator;

	@Column(name = "created_at")
	private Date createdAt;

	@Column(name = "updated_at")
	private Date updatedAt;

	@ManyToOne(optional = false)
	@JoinColumn(name="post_idx")
	private Post post;
}
