package io.github.s0ooo0k.day49.model.mapper;

import io.github.s0ooo0k.day49.model.vo.KeywordSearch;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookmarkMapper {
    int insertBookmark(KeywordSearch keywordSearch);
    List<KeywordSearch> selectAll();
}