package com.samllfatcat.mapper;

import com.samllfatcat.pojo.Book;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author zsz
 * @Description
 * @date 2022/6/14
 */

public interface BookMapper {
    //查询方法
    public List<Book> findAll();

    //添加方法
    public int addBook(Book book);

    //删除方法
    public int deleteBook(int id);


}
