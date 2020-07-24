package com.yxun8.service.impl;

import com.yxun8.mapper.BookMapper;
import com.yxun8.pojo.Books;
import com.yxun8.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional
public class BookServiceImpl implements BookService {
    @Autowired
    private BookMapper bookMapper;

    @Override
    public void addBook(Books books) {
        bookMapper.addBook(books);
    }

    @Override
    public void deleteBook(int id) {
        bookMapper.deleteBook(id);
    }

    @Override
    public Books updateBookUI(int id) {
        Books books = bookMapper.updateBookUI(id);
        return books;
    }

    @Override
    public void updateBook(Books books) {
        bookMapper.updateBook(books);
    }

    @Override
    public List<Books> allBooks() {
        List<Books> books = bookMapper.allBooks();
        return books;
    }
}
