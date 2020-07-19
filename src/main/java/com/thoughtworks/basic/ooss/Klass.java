package com.thoughtworks.basic.ooss;

import java.util.ArrayList;
import java.util.List;

class Klass {
    private int number;
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

    void assign(Teacher teacher) {
        this.teacher = teacher;
        register(teacher);
    }

    void register(KlassObserver observer) {
        observers.add(observer);
    }

    void unRegister(KlassObserver observer) {
        observers.removeIf(existedObserver -> existedObserver.equals(observer));
    }
}
