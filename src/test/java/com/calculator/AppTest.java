package com.calculator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AppTest {

    @Test
    public void testAdd() {
        assertEquals(5.0, App.add(2.0, 3.0));
    }

    @Test
    public void testSubtract() {
        assertEquals(1.0, App.subtract(5.0, 4.0));
    }

    @Test
    public void testMultiply() {
        assertEquals(6.0, App.multiply(2.0, 3.0));
    }

    @Test
    public void testDivide() {
        assertEquals(2.0, App.divide(6.0, 3.0));
    }

    @Test
    public void testDivideByZero() {
        assertThrows(ArithmeticException.class, () -> App.divide(5.0, 0));
    }
}
