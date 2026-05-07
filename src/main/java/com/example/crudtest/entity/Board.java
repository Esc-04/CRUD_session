package com.example.crudtest.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
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
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private String content;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @Column(nullable = true)
    private String password;

    // 1:N 관계
    @OneToMany(mappedBy = "board", cascade = CascadeType.ALL)
    private java.util.List<Comment> comments;

    // 1:1 관계
    @OneToOne(mappedBy = "board", cascade = CascadeType.ALL)
    private BoardDetail boardDetail;

    // N:M → 중간테이블
    @OneToMany(mappedBy = "board" , cascade = CascadeType.ALL)
    private java.util.List<BoardTag> boardTags;
}