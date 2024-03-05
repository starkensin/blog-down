package com.example.server.post;

import com.example.server.post.dao.PostDao;
import com.example.server.post.dao.PostRepository;
import com.example.server.post.dto.PostCreateRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PostService {

    private final PostDao postDao;
    private final PostRepository postRepository;

    public Post getPost(Long postId) {
        return postDao.findById(postId);
    }

    public Post setPost(PostCreateRequest postCreateRequest) {
        return postRepository.save(postCreateRequest.toEntity());
    }
}
