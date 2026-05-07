package com.example.crudtest.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class BoardDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int viewCount;
    //과제 추가 구현
    @OneToMany(mappedBy = "user")
    private List<BoardLike> boardLikes;

    @JsonIgnore
    @OneToOne
    @JoinColumn(name = "board_id")
    private Board board;
}