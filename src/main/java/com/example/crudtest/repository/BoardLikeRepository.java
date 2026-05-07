package com.example.crudtest.repository;

import com.example.crudtest.entity.BoardLike;
import com.example.crudtest.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BoardLikeRepository extends JpaRepository<BoardLike,Long> {
    //좋아요 추가 save
    //특정 게시글의 좋아요 수
    Long countByboardId(Long boardId);
    //특정 게시글에 좋아요 누른 사람
    List<BoardLike> findAllByBoardId(Long boardId);
}
