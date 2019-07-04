package com.taobushi;

import com.taobushi.service.HelloService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class NeTest {
    @Resource
    private HelloService helloService;
    @Test
    public void ui(){
        System.out.println(helloService.sayHello("小炮"));
    }
}
