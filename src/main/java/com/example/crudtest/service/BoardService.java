package com.example.crudtest.service;

import com.example.crudtest.entity.Board;
import com.example.crudtest.repository.BoardRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoardService {

    private final BoardRepository boardRepository;

    public BoardService(BoardRepository boardRepository) {
        this.boardRepository = boardRepository;
    }

    // CREATE
    public Board createBoard(Board board) {
        return ________________________________;
    }

    // READ (전체 조회)
    public List<Board> gotAllBoards() {
        return ________________________________;
    }

    // READ (단건 조회)
    public Board gotBoardById(Long id) {
        return ________________________________;
    }

    // 작성자 조회
    public List<Board> gotBoardByWriter(String writer) {
        return ________________________________;
    }

    // 검색
    public List<Board> searchBoards(String keyword) {
        return ________________________________;
    }

    // UPDATE
    public Board updateBoard(Long id, Board newboard) {
        Board existingBoard = ________________________________;

        existingBoard.setTitle(__________________);
        existingBoard.setContent(__________________);
        existingBoard.setWriter(__________________);
        existingBoard.setPassword(__________________);

        return ________________________________;
    }

    // DELETE
    public boolean deleteBoard(Long id) {
        Board existingBoard = ________________________________;

        if (existingBoard != null) {
            ________________________________;
            return true;
        }
        return false;
    }
}