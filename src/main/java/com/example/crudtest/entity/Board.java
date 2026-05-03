package com.example.crudtest.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Board {

    @Id
    @GeneratedValue(strategy = __________)
    private Long id;

    @Column(nullable = ______)
    private String title;

    @Column(nullable = ______)
    private String content;

    @Column(nullable = ______)
    private String writer;

    @Column(nullable = ______)
    private String password;

    // 1:N 관계
    @OneToMany(mappedBy = "_______", cascade = __________)
    private java.util.List<Comment> comments;

    // 1:1 관계
    @OneToOne(mappedBy = "_______", cascade = __________)
    private BoardDetail boardDetail;

    // N:M → 중간테이블
    @OneToMany(mappedBy = "_______")
    private java.util.List<BoardTag> boardTags;
}