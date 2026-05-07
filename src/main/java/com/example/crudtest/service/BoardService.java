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
        return boardRepository.save(board);
    }

    // READ (전체 조회)
    public List<Board> gotAllBoards() {
        return boardRepository.findAll();
    }

    // READ (단건 조회)
    public Board gotBoardById(Long id) {
        return boardRepository.findById(id).orElse(null);
    }

    // 작성자 조회
    public List<Board> gotBoardByWriter(String writer) {
        return boardRepository.findByWriter(writer);
    }

    // 검색
    public List<Board> searchBoards(String keyword) {
        return boardRepository.findByTitleContaining(keyword);
    }

    // UPDATE
    public Board updateBoard(Long id, Board newboard) {
        Board existingBoard = gotBoardById(id);

        existingBoard.setTitle(newboard.getTitle());
        existingBoard.setContent(newboard.getContent());
        existingBoard.setWriter(newboard.getWriter());
        existingBoard.setPassword(newboard.getPassword());

        return boardRepository.save(existingBoard);
    }

    // DELETE
    public boolean deleteBoard(Long id) {
        Board existingBoard = boardRepository.findById(id).orElse(null);

        if (existingBoard != null) {
            boardRepository.delete(existingBoard);
            return true;
        }
        return false;
    }
}