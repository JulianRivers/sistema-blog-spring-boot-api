package com.sistema.blog.sistemablogspringbootapirest.respository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sistema.blog.sistemablogspringbootapirest.model.entity.Comment;

public interface CommentRepository extends JpaRepository<Comment, Long>{
    
}
