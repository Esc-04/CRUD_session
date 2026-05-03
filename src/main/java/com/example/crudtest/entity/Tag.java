package com.example.crudtest.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Tag {

    @Id
    @GeneratedValue(strategy = __________)
    private Long id;

    @Column(nullable = ______, unique = ______)
    private String name;

    @OneToMany(mappedBy = "_______")
    private List<BoardTag> boardTags;
}