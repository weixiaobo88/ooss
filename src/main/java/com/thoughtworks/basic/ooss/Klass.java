package com.thoughtworks.basic.ooss;

import java.util.ArrayList;
import java.util.List;

class Klass {
    private int number;
    private List<Student> students = new ArrayList<>();
    private Teacher teacher;

    Klass(int number) {
        this.number = number;
    }

    int getKlassNumber() {
        return number;
    }

    void notify(String message) {
        students.forEach(student -> student.receiveMessage(message));
        teacher.receiveMessage(message);
    }

    void add(Student student) {
        students.add(student);
    }

    void assign(Teacher teacher) {
        this.teacher = teacher;
    }

    void remove(Student student) {
        students.removeIf(existedStudent -> existedStudent.getName().equals(student.getName()));
    }
}
