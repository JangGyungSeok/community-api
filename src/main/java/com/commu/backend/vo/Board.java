package com.commu.backend.vo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.sun.istack.Nullable;
import lombok.Data;
import lombok.ToString;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;

@Data
@Entity
@ToString(exclude = "posts")
@Table(name="boards")
public class Board {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "board_idx")
	private long boardIdx;

	@Column(name = "board_name")
	private String boardName;

	@Column(name = "board_creator")
	private int boardCreator;

	@CreatedDate
	@Column(name = "created_at")
	private Date createdAt ;

	@LastModifiedDate
	@Column(name = "updated_at")
	private Date updatedAt;

	@Nullable
	@OneToMany(mappedBy="board")
	private List<Post> posts = new ArrayList<>();
}
