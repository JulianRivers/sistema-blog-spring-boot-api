package com.sistema.blog.sistemablogspringbootapirest.respository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sistema.blog.sistemablogspringbootapirest.model.entity.Post;

public interface PostRepository extends JpaRepository<Post, Long> {
    
}
