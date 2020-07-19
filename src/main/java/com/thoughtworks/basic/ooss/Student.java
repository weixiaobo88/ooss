package com.thoughtworks.basic.ooss;

public class Student extends Person {
    private Klass klass;

    public Student(String name, int age) {
        super(name, age);
    }

    String introduce() {
        return super.introduce() + "I am a Student of Class " + klass.getKlassNumber() + ".";
    }

    void setKlass(Klass klass) {
        this.klass = klass;
        klass.add(this);
    }

    void updateTo(String name) {
        super.setName(name);
        String message = buildUpdateNameMessage();
        klass.notify(message);
    }

    private String buildUpdateNameMessage() {
        return super.introduce() + "I am a Student of Class " + klass.getKlassNumber() + "now.";
    }

    String receiveMessage(String message) {
        return message;
    }
}
