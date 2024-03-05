package com.example.server.post;

import com.example.server.post.dto.PostCreateRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/posts")
public class PostController {
    private final PostService postService;

    @GetMapping("/{postId}")
    public Post getPostById(@PathVariable Long postId) {
        return postService.getPost(postId);
    }

    @PostMapping("")
    public Post setPost(@RequestBody PostCreateRequest postCreateRequest) {
        return postService.setPost(postCreateRequest);
    }


}
