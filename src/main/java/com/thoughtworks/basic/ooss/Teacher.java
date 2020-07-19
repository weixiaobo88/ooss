package com.thoughtworks.basic.ooss;

public class Teacher extends Person {
    private String job = "Teacher";

    public Teacher(String name, int age) {
        super(name, age);
    }

    private String getJob() {
        return job;
    }

    String introduce() {
        return super.introduce() + " I am a " + getJob() + ".";
    }

    String receiveMessage(String message) {
        return message;
    }
}
