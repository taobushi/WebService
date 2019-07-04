package com.taobushi.entity;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="Car")
public class Car {
    private Integer id;
    private String carName;
    private Double prices;

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", carName='" + carName + '\'' +
                ", prices=" + prices +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public Double getPrices() {
        return prices;
    }

    public void setPrices(Double prices) {
        this.prices = prices;
    }
}
