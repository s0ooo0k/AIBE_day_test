package io.github.s0ooo0k.day49.service;

import io.github.s0ooo0k.day49.model.vo.KeywordSearch;
import org.springframework.stereotype.Service;

import javax.naming.directory.SearchResult;
import java.util.List;


public interface SearchService {
    List<KeywordSearch> searchByKeyword(String keyword) throws Exception;
}