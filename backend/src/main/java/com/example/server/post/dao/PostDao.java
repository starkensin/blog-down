package com.example.server.post.dao;

import com.example.server.post.Post;
import com.example.server.post.exception.PostNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
@RequiredArgsConstructor
public class PostDao {

    private final PostRepository postRepository;

    public Post findById(final Long id) {
        final Optional<Post> post = postRepository.findById(id);
        post.orElseThrow(() -> new PostNotFoundException(id));
        return post.get();
    }
}
