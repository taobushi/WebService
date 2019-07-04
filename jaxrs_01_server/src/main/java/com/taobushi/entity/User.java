package com.taobushi.entity;

import javax.xml.bind.annotation.XmlRootElement;
import java.lang.reflect.Array;
import java.util.ArrayList;
//基于jaxrs resutful 可以使xml或者json格式数据
/*
* <User>
*     <id></id>
*     <username ......
* </User>
* json:
* {"User":{"id":10,"username":"zhangsan",....}}
* */
@XmlRootElement(name= "User")
public class User {
    private Integer id;
    private String username;
    private String city;
    private ArrayList<Car> cars ;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", city='" + city + '\'' +
                ", cars=" + cars +
                '}';
    }

    public ArrayList<Car> getCars() {
        return cars;
    }

    public void setCars(ArrayList<Car> cars) {
        this.cars = cars;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
