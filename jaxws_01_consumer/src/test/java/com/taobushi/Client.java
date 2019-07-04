package com.taobushi;

import com.taobushi.service.HelloService;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

public class Client {
    public static void main(String[] args) {
        //访问地址http://localhost:8000/ws/hello
        JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();
        //这是远程访问服务地址
        factory.setAddress("http://localhost:8000/ws/hello");
        //设置接口类型
        factory.setServiceClass(HelloService.class);
        //代理对象对象
        HelloService helloService = factory.create(HelloService.class);
        System.out.println(helloService.sayHello("小猪"));

    }
}
