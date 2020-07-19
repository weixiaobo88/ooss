package com.thoughtworks.basic.ooss;

class Person {
    private String name;
    private final int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    String introduce() {
        return "My name is " + getName() +". I am " + getAge() + " years old.";
    }

    private String getName() {
        return name;
    }

    private int getAge() {
        return age;
    }

    protected void setName(String name) {
        this.name = name;
    }
}
