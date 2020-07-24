package com.yxun8.test;

import com.yxun8.pojo.Books;
import com.yxun8.service.BookService;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
import org.springframework.test.context.junit.jupiter.web.SpringJUnitWebConfig;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;
import java.util.List;


public class Test {
    /*测试查询全部内容66*/
    @org.junit.Test
    public void getAll(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        BookService bookService = (BookService) applicationContext.getBean("bookServiceImpl");
        List<Books> books = bookService.allBooks();
        for (Books book : books) {
            System.out.println(book);
        }
    }

    @org.junit.Test
    public void add() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        BookService bookService = (BookService) applicationContext.getBean("bookServiceImpl");
        Books books = new Books();
        books.setTName("图书ceshi");
        books.setTSize(66);
        books.setTDate(new Date());
        books.setTDesc("描述测试");
        bookService.addBook(books);
    }
}
