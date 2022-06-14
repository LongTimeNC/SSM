package com.samllfatcat.controller;

import com.samllfatcat.pojo.Book;
import com.samllfatcat.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author zsz
 * @Description
 * @date 2022/6/14
 */
@Controller
@RequestMapping("/book")
public class BookController {

    @Autowired
    private BookService bookService;
    //查询
    @RequestMapping("/findall")
    public ModelAndView findAll(Book book){
        ModelAndView modelAndView = new ModelAndView();
        List<Book> bookList = bookService.findAll();
        modelAndView.addObject("bookList",bookList);
        modelAndView.setViewName("show");
        return modelAndView;
    }

    @RequestMapping("/addbook")
    @ResponseBody
    public String addBook(Book book){
        bookService.addBook(book);
        return "添加成功!";
    }

}
