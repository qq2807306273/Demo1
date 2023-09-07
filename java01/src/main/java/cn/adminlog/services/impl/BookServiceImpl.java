package cn.adminlog.services.impl;

import cn.adminlog.dao.impl.BookDao;
import cn.adminlog.dao.impl.BookDaoImpl;
import cn.adminlog.services.BookService;

public class BookServiceImpl implements BookService {
    private BookDao bookDao;

    public void save(){
        System.out.println("book service save ...");
        bookDao.save();

    }
    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }
}
