package com.thoughtworks.basic.ooss;

public class Teacher extends Person {
    private String job = "Teacher";
    private Klass klass;

    public Teacher(String name, int age) {
        super(name, age);
    }

    private String getJob() {
        return job;
    }

    void assignTo(Klass klass) {
        this.klass = klass;
    }

    String introduce() {
        return super.introduce() + " I am a " + getJob() + ".";
    }
}
