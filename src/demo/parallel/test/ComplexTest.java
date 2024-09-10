package demo.parallel.test;

import static org.junit.Assert.assertEquals;

import demo.parallel.Complex;
import org.junit.jupiter.api.Test;

class ComplexTest {

    private static final double DELTA = 1e-9; // Точность для сравнения вещественных чисел

    @Test
    void testMinusPositiveNumbers() {
        Complex a = new Complex(5.0, 3.0);
        Complex b = new Complex(2.0, 1.0);

        a.minus(b);

        assertEquals(3.0, a.re, DELTA);
        assertEquals(2.0, a.im, DELTA);
    }

    @Test
    void testMinusNegativeNumbers() {
        Complex a = new Complex(-3.0, -5.0);
        Complex b = new Complex(-1.0, -2.0);

        a.minus(b);

        assertEquals(-2.0, a.re, DELTA);
        assertEquals(-3.0, a.im, DELTA);
    }

    @Test
    void testMinusMixedNumbers() {
        Complex a = new Complex(3.0, -4.0);
        Complex b = new Complex(-2.0, 6.0);

        a.minus(b);

        assertEquals(5.0, a.re, DELTA);
        assertEquals(-10.0, a.im, DELTA);
    }

    @Test
    void testMinusZero() {
        Complex a = new Complex(3.0, 4.0);
        Complex b = new Complex(0.0, 0.0);

        a.minus(b);

        assertEquals(3.0, a.re, DELTA);
        assertEquals(4.0, a.im, DELTA);
    }

    @Test
    void testMinusSelf() {
        Complex a = new Complex(3.0, 4.0);

        a.minus(a);  // Вычитание из себя

        assertEquals(0.0, a.re, DELTA);
        assertEquals(0.0, a.im, DELTA);
    }
}
