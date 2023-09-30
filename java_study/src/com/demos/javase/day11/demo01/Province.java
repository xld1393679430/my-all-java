package com.demos.javase.day11.demo01;

public class Province {
    private String name;                        // 名称
    private String shortName;                    // 简称
    private String location;                    // 所属区域

    public Province() {
    }

    public Province(String name, String shortName, String location) {
        this.name = name;
        this.shortName = shortName;
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "Province{" +
                "name='" + name + '\'' +
                ", shortName='" + shortName + '\'' +
                ", location='" + location + '\'' +
                '}';
    }
}
