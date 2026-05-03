package com.example.crudtest.service;

import com.example.crudtest.entity.Board;
import com.example.crudtest.entity.Tag;
import com.example.crudtest.entity.BoardTag;
import com.example.crudtest.repository.BoardRepository;
import com.example.crudtest.repository.TagRepository;
import com.example.crudtest.repository.BoardTagRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TagService {

    private final BoardRepository boardRepository;
    private final TagRepository tagRepository;
    private final BoardTagRepository boardTagRepository;

    // 태그 추가
    public void addTag(Long boardId, String tagName) {

        Board board = ________________________________
                .orElseThrow(() -> new RuntimeException("게시글 없음"));

        Tag tag = tagRepository.findByName(tagName)
                .orElseGet(() -> {
                    Tag newTag = new Tag();
                    newTag.setName(tagName);
                    return ________________________________;
                });

        BoardTag boardTag = new BoardTag();
        boardTag.setBoard(__________);
        boardTag.setTag(__________);

        ________________________________;
    }

    // 전체 태그 조회
    public List<Tag> getAllTags() {
        return ________________________________;
    }

    // 게시글별 태그 조회
    public List<String> getTagsByBoard(Long boardId) {
        return ________________________________
                .stream()
                .map(boardTag -> ________________________________)
                .toList();
    }
}