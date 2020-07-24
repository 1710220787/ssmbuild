package com.yxun8.controller;

import com.yxun8.pojo.Books;
import com.yxun8.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/book")
public class BookController {
    @Autowired
    private BookService bookService;

    @RequestMapping("/listBook")
    public String listBook(){
        List<Books> books = bookService.allBooks();
        for (Books book : books) {
            System.out.println(book);
        }
        return "list";
    }
}
