package com.example.crudtest.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
// 엔티티의 변화 ( 생성 / 수정 ) 을 listenting
@EntityListeners(AuditingEntityListener.class)
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String name;

    @CreatedDate
    private LocalDateTime joinDate;

    @JsonIgnore
    @OneToMany(mappedBy = "user")
    private List<BoardLike> boardUser;

    @JsonIgnore
    @OneToMany(mappedBy = "user")
    private List<Comment> comments;

}
