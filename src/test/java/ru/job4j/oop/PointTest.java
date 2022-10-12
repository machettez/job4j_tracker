package ru.job4j.oop;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.offset;

public class PointTest {

    @Test
    public void when00to20then2() {
        double expected = 2;
        Point a = new Point(0, 0);
        Point b = new Point(2, 0);
        double dist = a.distance(b);
        assertThat(dist).isCloseTo(expected, offset(0.001));
    }

    @Test
    public void when01to01then0() {
        double expected = 0;
        Point a = new Point(0, 1);
        Point b = new Point(0, 1);
        double dist = a.distance(b);
        assertThat(dist).isCloseTo(expected, offset(0.001));
    }

    @Test
    public void when22to12then1() {
        double expected = 1;
        Point a = new Point(2, 2);
        Point b = new Point(1, 2);
        double dist = a.distance(b);
        assertThat(dist).isCloseTo(expected, offset(0.001));
    }

    @Test
    public void when101to121then2() {
        double expected = 2;
        Point a = new Point(1, 0, 1);
        Point b = new Point(1, 2, 1);
        double dist = a.distance3d(b);
        assertThat(dist).isCloseTo(expected, offset(0.001));
    }

}