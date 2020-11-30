package com.commu.backend.repository.community;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.commu.backend.vo.PostsVO;

@Repository
public interface PostRepository extends JpaRepository<PostsVO, Long>{

}
