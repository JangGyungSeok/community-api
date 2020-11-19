package com.commu.backend.vo;

import java.util.Date;
import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.Table;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Data
@Entity
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
}
