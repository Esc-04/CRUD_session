package com.example.crudtest.repository;

import com.example.crudtest.entity.BoardDetail;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardDetailRepository extends JpaRepository<BoardDetail, Long> {
    // <엔티티이름 , id type>

}