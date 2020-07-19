package com.thoughtworks.basic.ooss;

public class Student extends Person {
    private int classNumber;

    public Student(String name, int age) {
        super(name, age);
    }

    void setClassNumber(int classNumber) {
        this.classNumber = classNumber;
    }

    String introduce() {
        return super.introduce() + "I am a Student of Class " + classNumber + ".";
    }
}
