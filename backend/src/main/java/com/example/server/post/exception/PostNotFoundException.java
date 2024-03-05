package com.example.server.post.exception;


import javax.persistence.EntityNotFoundException;

public class PostNotFoundException extends EntityNotFoundException {
    public PostNotFoundException(Long id) {
        super("ID: " + id + " is not found");
    }
}
