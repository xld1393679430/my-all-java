package com.demos.javase.day11.demo04;

import java.util.Objects;

public class City {
    private String name;            // 城市名称
    private String location;            // 所属地区

    public City() {

    }

    public City(String name, String location) {
        this.name = name;
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "City{" +
                "name='" + name + '\'' +
                ", location='" + location + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        City city = (City) o;
        return name.equals(city.name) && location.equals(city.location);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, location);
    }
}
