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
        String message = buildUpdateNameMessage(klass);
        klass.inform(message);
    }

    private String buildUpdateNameMessage(Klass klass) {
        return super.introduce() + " I am a student of Class " + klass.getKlassNumber() + " now.";
    }

    void updateKlassTo(Klass klass) {
        String message = buildUpdateNameMessage(klass);
        this.klass.inform(message);

        this.klass.remove(this);
        setKlass(klass);
        klass.inform(message);
    }

    void receiveMessage(String message) {
        System.out.println(message);
    }
}
