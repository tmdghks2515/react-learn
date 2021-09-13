package com.anan.reactback.domain.repository;

import com.anan.reactback.domain.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PostRepository extends JpaRepository<Post, Long> {
    List<Post> findByType(int tp);
}
