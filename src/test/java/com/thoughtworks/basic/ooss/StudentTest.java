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
        String expected = "My name is Tim. I am 21 years old. I am a student of Class 2 now.";

        assertThat(mike.getNotifyMessage(), is(expected));
        assertThat(matt.getNotifyMessage(), is(expected));
    }

    @Test
    public void should_other_students_and_teacher_in_previus_and_current_klass_receive_message_when_student_change_klass() {
        //given
        Student tom = new Student("Tom", 21);
        Student mike = new Student("Mike", 21);
        Student lily = new Student("Lily", 21);
        Teacher matt = new Teacher("Matt", 30);
        Teacher johnny = new Teacher("Johnny", 30);
        Klass klass1 = new Klass(1);
        Klass klass2 = new Klass(2);

        tom.setKlass(klass1);
        mike.setKlass(klass1);
        lily.setKlass(klass2);
        klass1.assign(matt);
        klass2.assign(johnny);

        //when
        tom.updateKlassTo(klass2);

        //then
        String expected = "My name is Tom. I am 21 years old. I am a student of Class 2 now.";

        assertThat(mike.getNotifyMessage(), is(expected));
        assertThat(lily.getNotifyMessage(), is(expected));
        assertThat(matt.getNotifyMessage(), is(expected));
        assertThat(johnny.getNotifyMessage(), is(expected));
    }
}
