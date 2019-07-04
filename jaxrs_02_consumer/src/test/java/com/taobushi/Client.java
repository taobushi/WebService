package com.taobushi;

import com.taobushi.entity.User;
import org.apache.cxf.jaxrs.client.WebClient;
import org.junit.Test;

import javax.ws.rs.core.MediaType;
import java.util.ArrayList;
import java.util.Collection;

public class Client {
    @Test
    public void test1(){
        User user = new User();
        user.setId(1000);
        user.setUsername("张晓明");
        //通过WebCLIent对象调用远程服务
        Collection<? extends User> collection = WebClient
                .create("http://localhost:8011/ws/userService/user/1")
                .getCollection(User.class);
        System.out.println(collection);
    }
}
