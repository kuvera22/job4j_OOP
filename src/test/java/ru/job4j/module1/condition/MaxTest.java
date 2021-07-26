package ru.job4j.module1.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MaxTest {
    @Test
    public void max2() {
        int result = Max.max(28, 3);
        int expected = 28;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void max3() {
        int result = Max.max(6, 3, 7);
        int expected = 7;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void max4() {
        int result = Max.max(87, 23, 47, 6);
        int expected = 87;
        Assert.assertEquals(result, expected);
    }
}