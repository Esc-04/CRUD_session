package com.example.crudtest.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Comment {

    @Id
    @GeneratedValue(strategy = __________)
    private Long id;

    private String content;
    private String writer;

    @ManyToOne
    @JoinColumn(name = "__________")
    private Board board;
}