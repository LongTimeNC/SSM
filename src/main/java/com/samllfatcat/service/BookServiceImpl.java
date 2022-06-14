package com.samllfatcat.service;

import com.samllfatcat.mapper.BookMapper;
import com.samllfatcat.pojo.Book;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @author zsz
 * @Description
 * @date 2022/6/14
 */
@Service("bookService")
public class BookServiceImpl implements BookService {

    public List<Book> findAll() {
        try {
            InputStream resourceAsStream = Resources.getResourceAsStream("mybatis-config.xml");
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
            SqlSession sqlSession = sqlSessionFactory.openSession();
            BookMapper mapper = sqlSession.getMapper(BookMapper.class);
            List<Book> bookList = mapper.findAll();
            sqlSession.close();
            return bookList;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public int addBook(Book book) {

        return 0;
    }

    public int deleteBook(int id) {

        return 0;
    }
}
