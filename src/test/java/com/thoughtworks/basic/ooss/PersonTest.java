package com.thoughtworks.basic.ooss;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class PersonTest {
    @Test
    public void should_return_introduce_message_given_person_with_name_and_age() {
        //given
        Person tom = new Person("Tom", 21);

        //when
        String message = tom.introduce();

        //then
        String expected = "My name is Tom. I am 21 years old.";
        assertThat(message, is(expected));
    }
}
