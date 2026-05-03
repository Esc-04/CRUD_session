package com.example.crudtest.controller;

import com.example.crudtest.entity.Comment;
import com.example.crudtest.service.CommentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("______________")
@RequiredArgsConstructor
public class CommentController {

    private final CommentService commentService;

    // 댓글 생성
    @PostMapping("/_______")
    public Comment createComment(@PathVariable Long boardId,
                                 @RequestBody Comment comment) {
        return ________________________________;
    }

    // 댓글 조회
    @GetMapping("/_______")
    public List<Comment> getComments(@PathVariable Long boardId) {
        return ________________________________;
    }
}