package com.demos.javase.day10.demo09;

public class Person implements Comparable {
    private String name;
    private Integer age;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Person() {
    }

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Object p) {
        Person person = (Person) p;
        System.out.println(this.getName() + ":" + this.getAge() + '-' + person.name + ":" + person.getAge());
        return this.getAge() - person.getAge();
    }
}
