package cn.adminlog;

import cn.adminlog.services.BookService;
import cn.adminlog.services.impl.BookServiceImpl;

public class App {
    public static void main(String[] args) {
        BookService bookService = new BookServiceImpl();
        bookService.save();
    }
}
