package com.sistema.blog.sistemablogspringbootapirest.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CommentDTO {
    private long id;
    private String name;
    private String email;
    private String content;
}
