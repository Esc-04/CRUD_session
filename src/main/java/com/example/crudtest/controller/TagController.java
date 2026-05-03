package com.example.crudtest.controller;

import com.example.crudtest.entity.Tag;
import com.example.crudtest.service.TagService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("______________")
@RequiredArgsConstructor
public class TagController {

    private final TagService tagService;

    // 태그 추가
    @PostMapping("/_______")
    public void addTag(@PathVariable Long boardId,
                       @RequestParam String name) {
        ________________________________;
    }

    // 전체 태그 조회
    @GetMapping
    public List<Tag> getAllTags() {
        return ________________________________;
    }

    // 게시글별 태그 조회
    @GetMapping("/_______")
    public List<String> getTagsByBoard(@PathVariable Long boardId) {
        return ________________________________;
    }
}