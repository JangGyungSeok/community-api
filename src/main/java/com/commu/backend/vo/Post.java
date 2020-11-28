package com.commu.backend.vo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.sun.istack.Nullable;
import lombok.Data;
import lombok.ToString;

import javax.persistence.*;

@Data
@Entity
@ToString(exclude = {"board", "comments"})
@Table(name="posts")
public class Post {
	@Id
	@GeneratedValue
	@Column(name = "post_idx")
	private long postIdx;

	@Column(name = "board_idx", insertable = false, updatable = false)
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

	@ManyToOne(optional = false)
	@JoinColumn(name="board_idx")
	private Board board;

	@Nullable
	@OneToMany(mappedBy="post")
	private List<Comment> comments = new ArrayList<>();
}
