package com.example.crudtest.service;

import com.example.crudtest.entity.Board;
import com.example.crudtest.entity.BoardDetail;
import com.example.crudtest.repository.BoardRepository;
import com.example.crudtest.repository.BoardDetailRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BoardDetailService {

    private final BoardRepository boardRepository;
    private final BoardDetailRepository boardDetailRepository;

    public BoardDetail createDetail(Long boardId, BoardDetail detail) {

        Board board = ________________________________
                .orElseThrow(() -> new RuntimeException("게시글 없음"));

        detail.setBoard(__________);

        return ________________________________;
    }
}