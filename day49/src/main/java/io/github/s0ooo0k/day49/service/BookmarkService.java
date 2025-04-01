package io.github.s0ooo0k.day49.service;

import io.github.s0ooo0k.day49.config.MyBatisConfig;
import io.github.s0ooo0k.day49.model.mapper.BookmarkMapper;
import io.github.s0ooo0k.day49.model.vo.KeywordSearch;
import io.github.s0ooo0k.day49.util.MyLogger;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookmarkService {
    final public MyLogger logger = new MyLogger(this.getClass().getName());

    public void createBookmark(KeywordSearch keywordSearch) {
        try (SqlSession session = MyBatisConfig.getSqlSessionFactory().openSession()) {
            BookmarkMapper mapper = session.getMapper(BookmarkMapper.class);
            int count = mapper.insertBookmark(keywordSearch);
            logger.info(count + " bookmark inserted");
            session.commit();
        }
    }
    public List<KeywordSearch> getAllBookmarks() {
        try (SqlSession session = MyBatisConfig.getSqlSessionFactory().openSession()) {
            BookmarkMapper mapper = session.getMapper(BookmarkMapper.class);
            return mapper.selectAll();
        }
    }
}