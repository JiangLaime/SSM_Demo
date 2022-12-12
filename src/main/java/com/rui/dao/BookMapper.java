package com.rui.dao;

import com.rui.pojo.Book;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface BookMapper {

    List<Book> selectAllBook();
}
