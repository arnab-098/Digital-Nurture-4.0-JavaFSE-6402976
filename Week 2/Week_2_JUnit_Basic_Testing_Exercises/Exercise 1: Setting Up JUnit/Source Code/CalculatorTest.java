package org.example;

import org.junit.Test;
import org.junit.Assert;

public class CalculatorTest {
    @Test
    public void testAdd() {
        Calculator calc = new Calculator();
        int result = calc.add(3, 4);
        Assert.assertEquals(7, result);
    }
}
