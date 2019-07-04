package com.taobushi;

import com.taobushi.service.impl.UserServiceImpl;
import org.apache.cxf.interceptor.LoggingInInterceptor;
import org.apache.cxf.interceptor.LoggingOutInterceptor;
import org.apache.cxf.jaxrs.JAXRSServerFactoryBean;

public class Server {
    public static void main(String[] args) {
        JAXRSServerFactoryBean factory= new JAXRSServerFactoryBean();
        factory.setAddress("http://localhost:8011/ws/");
        //设置服务类
        factory.setServiceBean( new UserServiceImpl());
        factory.getInInterceptors().add(new LoggingInInterceptor());
        factory.getOutInterceptors().add(new LoggingOutInterceptor());
        //发布服务
        factory.create();
        System.out.println("发布成功 8011");
    }
}
