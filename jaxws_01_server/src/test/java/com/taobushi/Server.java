package com.taobushi;

import com.taobushi.service.impl.HelloServiceImpl;
import org.apache.cxf.jaxws.JaxWsServerFactoryBean;

public class Server {
    public static void main(String[] args) {
//        发起服务的工厂
        JaxWsServerFactoryBean factory = new JaxWsServerFactoryBean();
//设置服务地址
        factory.setAddress("http://localhost:8000/ws/hello");
        //设置服务类
        factory.setServiceBean(new HelloServiceImpl());
        //发布服务
        factory.create();
    }
}
