package com.thoughtworks.basic.ooss;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TeacherTest {
    @Test
    public void should_return_introduce_message_given_teacher_with_name_and_age() {
        //given
        Teacher matt = new Teacher("Matt", 30);

        //when
        String message = matt.introduce();

        //then
        String expected = "My name is Matt. I am 30 years old. I am a Teacher.";
        assertThat(message, is(expected));
    }
}
