package com.taobushi.service.impl;

import com.taobushi.service.HelloService;

public class HelloServiceImpl implements HelloService {
    @Override
    public String sayHello(String name) {
        return"你是狗"+name;
    }
}
