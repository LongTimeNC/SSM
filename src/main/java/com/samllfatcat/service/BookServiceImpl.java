package com.samllfatcat.service;

import com.samllfatcat.mapper.BookMapper;
import com.samllfatcat.pojo.Book;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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

    @Autowired
    private BookMapper bookMapper;

    public List<Book> findAll() {
        List<Book> bookList = bookMapper.findAll();
        return bookList;
    }

    public void addBook(Book book) {
        bookMapper.addBook(book);
    }

    public int deleteBook(int id) {

        return 0;
    }
}
