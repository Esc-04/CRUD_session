package com.example.crudtest.service;

import com.example.crudtest.entity.Board;
import com.example.crudtest.entity.BoardLike;
import com.example.crudtest.entity.User;
import com.example.crudtest.repository.BoardLikeRepository;
import com.example.crudtest.repository.BoardRepository;
import com.example.crudtest.repository.UserRepository;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@NoArgsConstructor
public class BoardLikeService {
    private BoardLikeRepository boardLikeRepository;
    private BoardRepository boardRepository;
    private UserRepository userRepository;
    //좋아요 등록
    public void addLike(Long boardId, Long userId){
        BoardLike like=new BoardLike();
        like.setBoard(boardRepository.findById(boardId).
                orElseThrow(()->new RuntimeException("해당하는 게시글이없습니다.")));
        like.setUser(userRepository.findById(userId)
                .orElseThrow(()->new RuntimeException("해당하는 유저가 없습니다.")));

        //저장
        boardLikeRepository.save(like);

    }
    //조건 boardID로 검색

    //좋아요 수
    public Long getLikes(Long boardId){
        // 예외처리
        Board board=boardRepository.findById(boardId)
                .orElseThrow(()-> new RuntimeException("해당하는 게시글이 없습니다."));
        return boardLikeRepository.countByboardId(boardId);
    }
    //좋아요 한 사람
    public List<String> getLikeUsers(Long boardId){
        Board board=boardRepository.findById(boardId)
                .orElseThrow(()->new RuntimeException("해당하는 게실글이 없습니다."));
        return boardLikeRepository.findAllByBoardId(boardId)
                .stream()
                .map(u->u.getName())
                .toList();
    }
}
