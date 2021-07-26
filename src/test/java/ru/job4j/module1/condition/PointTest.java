package ru.job4j.module1.condition;

import org.junit.Test;

import static org.hamcrest.Matchers.closeTo;
import static org.junit.Assert.*;

public class PointTest {
    @Test
    public void checkDistance3d() {
        Point point1 = new Point(1, 6, 0);
        Point point2 = new Point(2, 0, 0);
        double result = point1.distance3d(point2);
        double expected = 6.082;
        assertThat(result, closeTo(expected, 0.001));
    }
}