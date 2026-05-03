package com.example.crudtest.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class BoardTag {

    @Id
    @GeneratedValue(strategy = __________)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "__________")
    private Board board;

    @ManyToOne
    @JoinColumn(name = "__________")
    private Tag tag;
}