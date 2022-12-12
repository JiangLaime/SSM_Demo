package com.rui.service;

import com.rui.dao.BookMapper;
import com.rui.pojo.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class BookService {
    @Autowired
    private BookMapper bookMapper;

    public List<Book> selectAllBook(){
        List<Book> books = bookMapper.selectAllBook();
        return books;
    };
}
