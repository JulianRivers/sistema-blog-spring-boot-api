package com.sistema.blog.sistemablogspringbootapirest.service;

import com.sistema.blog.sistemablogspringbootapirest.model.dto.CommentDTO;

public interface ICommentService {
    public CommentDTO creaComment(long postId, CommentDTO commentDTO);
}
