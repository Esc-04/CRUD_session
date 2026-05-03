package com.example.crudtest.controller;

import com.example.crudtest.entity.Board;
import com.example.crudtest.service.BoardService;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("______________")
public class BoardController {

    private final BoardService boardService;

    public BoardController(BoardService boardService) {
        this.boardService = boardService;
    }

    // CREATE (생성)
    @PostMapping
    public ResponseEntity<Board> createBoard(@RequestBody Board board) {
        Board createdBoard = ________________________________;
        return ResponseEntity.status(______________).body(createdBoard);
    }

    // READ (전체 조회)
    @GetMapping
    public ResponseEntity<List<Board>> getAllBoards() {
        List<Board> boards = ________________________________;
        return ResponseEntity.ok(boards);
    }

    // READ (단건 조회)
    @GetMapping("/_______")
    public ResponseEntity<Board> getBoardById(@PathVariable Long id) {
        Board board = ________________________________;
        return ResponseEntity.ok(board);
    }

    // 작성자 조회
    @GetMapping("/writer/{_______}")
    public ResponseEntity<List<Board>> gotBoardByWriter(@PathVariable String writer) {
        List<Board> boards = ________________________________;
        return ResponseEntity.ok(boards);
    }

    // 검색
    @GetMapping("/search")
    public ResponseEntity<List<Board>> searchBoards(@RequestParam String _______) {
        List<Board> boards = ________________________________;
        return ResponseEntity.ok(boards);
    }

    // UPDATE
    @PutMapping("/_______")
    public ResponseEntity<Board> updateBoard(@PathVariable Long id,
                                             @RequestBody Board board) {

        Board existingBoard = ________________________________;

        if (existingBoard != null) {
            Board updatedBoard = ________________________________;
            return ResponseEntity.ok(updatedBoard);
        } else {
            return ResponseEntity.___________().build();
        }
    }

    // DELETE
    @DeleteMapping("/_______")
    public ResponseEntity<Board> deleteBoard(@PathVariable Long id) {

        boolean deleted = ________________________________;

        if (deleted) {
            return ResponseEntity.___________().build();
        } else {
            return ResponseEntity.___________().build();
        }
    }
}