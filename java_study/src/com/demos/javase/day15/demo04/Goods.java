package com.demos.javase.day15.demo04;

import java.io.Serializable;

public class Goods implements Serializable {
    public String title;

    private Double price;

    private transient Integer store;

    public Goods() {
    }

    public Goods(String title, Double price, Integer store) {
        this.title = title;
        this.price = price;
        this.store = store;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getStore() {
        return store;
    }

    public void setStore(Integer store) {
        this.store = store;
    }

    @Override
    public String toString() {
        return "Goods{" +
                "title='" + title + '\'' +
                ", price=" + price +
                ", store=" + store +
                '}';
    }
}
