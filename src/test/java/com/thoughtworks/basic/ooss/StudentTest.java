package com.thoughtworks.basic.ooss;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class StudentTest {
    @Test
    public void should_return_introduce_message_given_student_with_name_and_age() {
        //given
        Student tom = new Student("Tom", 21);
        Klass klass = new Klass(2);
        tom.setKlass(klass);

        //when
        String message = tom.introduce();

        //then
        String expected = "My name is Tom. I am 21 years old.I am a Student of Class 2.";
        assertThat(message, is(expected));
    }

    @Test
    public void should_other_students_and_teacher_in_same_klass_receive_message_when_student_change_name() {
        //given
        Student tom = new Student("Tom", 21);
        Student mike = new Student("Mike", 21);
        Teacher matt = new Teacher("Matt", 30);
        Klass klass = new Klass(2);
        tom.setKlass(klass);
        mike.setKlass(klass);
        klass.assign(matt);

        //when
        tom.updateTo("Tim");

        //then
        String expected = "My name is Tom. I am 21 years old. I am a student of Class 2 now.";
        assertThat(mike.receiveMessage(expected), is(expected));
        assertThat(matt.receiveMessage(expected), is(expected));
    }
}
