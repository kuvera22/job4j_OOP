package ru.job4j.module5exeptions;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.Matchers.is;

public class FactTest {
    @Test(expected = IllegalArgumentException.class)
    public void whenArgumentLessThan0() {
        new Fact().calc(-3);
    }

    @Test(expected = IllegalArgumentException.class)
    public void whenZero() {
        new Fact().calc(0);
    }

    @Test
    public void when3then6() {
        int rsl = new Fact().calc(3);
        assertThat(rsl, is(6));
    }
}