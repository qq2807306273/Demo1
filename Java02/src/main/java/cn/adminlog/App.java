package cn.adminlog;

import cn.adminlog.config.SpringConfig;
import cn.adminlog.dao.BookDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.awt.print.Book;
import java.lang.reflect.AnnotatedArrayType;

public class App {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
        BookDao bookdao = ctx.getBean(BookDao.class);
        bookdao.save();
        System.out.println("= = = = = = = = = = 分割线 = = = = = = = = = =");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        bookdao.update();
    }
}
