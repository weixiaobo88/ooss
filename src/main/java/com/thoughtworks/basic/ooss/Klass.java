package com.thoughtworks.basic.ooss;

import java.util.ArrayList;
import java.util.List;

class Klass {
    private int number;
    private List<Student> students = new ArrayList<>();
    private Teacher teacher;
    private List<KlassObserver> observers = new ArrayList<>();

    Klass(int number) {
        this.number = number;
    }

    int getKlassNumber() {
        return number;
    }

    void notify(String message) {
        observers.forEach(observer -> observer.receiveMessage(message));
    }

    void add(Student student) {
        students.add(student);
        register(student);
    }

    void assign(Teacher teacher) {
        this.teacher = teacher;
        register(teacher);
    }

    private void register(KlassObserver observer) {
        observers.add(observer);
    }

    void remove(Student student) {
        students.removeIf(existedStudent -> existedStudent.getName().equals(student.getName()));
    }
}
