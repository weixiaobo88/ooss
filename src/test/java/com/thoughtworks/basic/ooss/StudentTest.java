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
}
