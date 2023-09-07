package cn.adminlog.config.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;


@Component
@Aspect
public class MyAdvice {

    @Pointcut("execution(void cn.adminlog.dao.BookDao.update()))")
    private void pt(){}

    @Before("pt()")
    public void method(){
        System.out.println(System.currentTimeMillis());
    }

    @Pointcut("execution(void cn.adminlog.dao.BookDao.update()))")
    private void hello(){}
    @After("hello()")
    public void method2(){
        System.out.println("hello");
    }
}
