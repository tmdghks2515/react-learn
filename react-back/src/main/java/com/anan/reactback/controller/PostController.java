package com.anan.reactback.controller;

import com.anan.reactback.domain.dto.PostDto;
import com.anan.reactback.domain.entity.Post;
import com.anan.reactback.domain.repository.PostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/post")
public class PostController {

    private final PostRepository postRepository;

    @GetMapping("/posts/{tp}")
    public List<PostDto> getPostList(@PathVariable int tp) {
        List<Post> postList = postRepository.findByType(tp);
        List<PostDto> postDtos = new ArrayList<>();
        for (Post post : postList) {
          postDtos.add(post.convertToDto());
        }
        return postDtos;
    }

}
