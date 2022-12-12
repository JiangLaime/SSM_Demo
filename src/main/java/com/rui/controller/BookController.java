package com.rui.controller;


import com.rui.dao.BookMapper;
import com.rui.pojo.Book;
import com.rui.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/book")
public class BookController {
    @Autowired
    private BookService bookService ;

    @GetMapping("/all")
    public List<Book>  selectAllBook(Model model){
        List<Book> books = bookService.selectAllBook();
        System.out.println(books);
        return books;
    };
}
