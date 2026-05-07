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
    @PostMapping("/{boardId}/{userId}") //restapi 설계 맞는지 모르겠음
    public void addLike(@PathVariable Long boardId, @PathVariable Long userId){
        boardLikeService.addLike(boardId,userId);
    }

    //게시글 당 좋아요 수
    @GetMapping("/{id}/count")
    public Long countLike(@PathVariable Long id){
        return boardLikeService.getLikes(id);
    }
    //게시글에 좋아요 누른 사람 '이름!'
    @GetMapping("/{boardId}/users")
    public List<String> getLikedUserList(@PathVariable Long boardId){
        return boardLikeService.getLikeUsers(boardId);
    }
}
