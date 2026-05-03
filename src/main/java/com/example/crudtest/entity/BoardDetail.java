package com.example.crudtest.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class BoardDetail {

    @Id
    @GeneratedValue(strategy = __________)
    private Long id;

    private int viewCount;
    private int likeCount;

    @OneToOne
    @JoinColumn(name = "__________")
    private Board board;
}