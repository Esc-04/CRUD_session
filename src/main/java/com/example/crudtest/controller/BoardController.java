package com.example.crudtest.controller;

import com.example.crudtest.entity.Board;
import com.example.crudtest.service.BoardService;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/boards")
public class BoardController {

    private final BoardService boardService;

    public BoardController(BoardService boardService) {
        this.boardService = boardService;
    }

    // CREATE (생성)
    @PostMapping
    public ResponseEntity<Board> createBoard(@RequestBody Board board) {
        Board createdBoard = boardService.createBoard(board);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdBoard);
    }

    // READ (전체 조회)
    @GetMapping
    public ResponseEntity<List<Board>> getAllBoards() {
        List<Board> boards = boardService.gotAllBoards();
        return ResponseEntity.ok(boards);
    }

    // READ (단건 조회)
    @GetMapping("/{id}")
    public ResponseEntity<Board> getBoardById(@PathVariable Long id) {
        Board board = boardService.gotBoardById(id);
        return ResponseEntity.ok(board);
    }

    // 작성자 조회
    @GetMapping("/writer/{writer}")
    public ResponseEntity<List<Board>> gotBoardByWriter(@PathVariable String writer) {
        List<Board> boards = boardService.gotBoardByWriter(writer);
        return ResponseEntity.ok(boards);
    }

    // 검색
    @GetMapping("/search")
    public ResponseEntity<List<Board>> searchBoards(@RequestParam String keyword) {
        List<Board> boards = boardService.searchBoards(keyword);
        return ResponseEntity.ok(boards);
    }

    // UPDATE
    @PutMapping("/{id}")
    public ResponseEntity<Board> updateBoard(@PathVariable Long id,
                                             @RequestBody Board board) {

        Board existingBoard = boardService.gotBoardById(id);

        if (existingBoard != null) {
            Board updatedBoard = boardService.updateBoard(id,board);
            return ResponseEntity.ok(updatedBoard);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    // DELETE
    @DeleteMapping("/{id}")
    public ResponseEntity<Board> deleteBoard(@PathVariable Long id) {

        boolean deleted = boardService.deleteBoard(id);

        if (deleted) {
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}