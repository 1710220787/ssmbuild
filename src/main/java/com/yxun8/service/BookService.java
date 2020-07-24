package com.yxun8.service;

import com.yxun8.pojo.Books;

import java.util.List;

public interface BookService {
    /*增加图书*/
    public void addBook(Books books);

    /*删除图书*/
    public void deleteBook(int id);

    /*根据id获取一个图书*/
    public Books updateBookUI(int id);

    /*根据id修改图书*/
    public void updateBook(Books books);

    /*全部图书*/
    public List<Books> allBooks();
}
