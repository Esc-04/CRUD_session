package com.example.crudtest.controller;

import com.example.crudtest.service.BoardLikeService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/likes")
@RequiredArgsConstructor
public class BoardLikeController {
    private BoardLikeService boardLikeService;
    @PostMapping
    public void addLike(@RequestParam Long boardId, @RequestParam Long userId){
        boardLikeService.addLike(boardId,userId);
    }

    //게시글 당 좋아요 수
    @GetMapping("/{id}")
    public Long countLike(@RequestParam Long id){
        return boardLikeService.getLikes(id);
    }
    //게시글에 좋아요 누른 사람 '이름!'
    @GetMapping("/{boardId}")
    public List<String> getLikedUserList(@RequestParam Long boardId){
        return boardLikeService.getLikeUsers(boardId);
    }
}
