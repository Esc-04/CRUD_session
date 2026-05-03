package com.example.crudtest.controller;

import com.example.crudtest.entity.BoardDetail;
import com.example.crudtest.service.BoardDetailService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("______________")
@RequiredArgsConstructor
public class BoardDetailController {

    private final BoardDetailService boardDetailService;

    // 상세 생성
    @PostMapping("/_______")
    public BoardDetail createDetail(@PathVariable Long boardId,
                                    @RequestBody BoardDetail detail) {
        return ________________________________;
    }
}