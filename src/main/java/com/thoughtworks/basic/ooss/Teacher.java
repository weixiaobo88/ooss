package com.thoughtworks.basic.ooss;

public class Teacher extends Person {
    private String job = "Teacher";
    private String message;

    public Teacher(String name, int age) {
        super(name, age);
    }

    private String getJob() {
        return job;
    }

    String introduce() {
        return super.introduce() + " I am a " + getJob() + ".";
    }

    void receiveMessage(String message) {
        this.message = message;
    }

    String getNotifyMessage() {
        return message;
    }
}
