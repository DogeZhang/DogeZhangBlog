package com.dogezhang.myBlogServer.repository;

import com.dogezhang.myBlogServer.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * Created by zhang on 2019/3/16.
 */
@Repository
public interface PostRepository extends JpaRepository<Post, Integer>{
}
