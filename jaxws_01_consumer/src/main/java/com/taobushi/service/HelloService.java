package com.taobushi.service;

import javax.jws.WebService;

/*
* 接收的接口*/
@WebService
public interface HelloService {
//    对外发布服务的方法
String sayHello(String name);
}
