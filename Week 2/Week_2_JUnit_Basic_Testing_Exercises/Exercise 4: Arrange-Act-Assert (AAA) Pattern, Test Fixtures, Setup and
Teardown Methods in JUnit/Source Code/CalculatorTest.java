package org.example;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;

public class CalculatorTest {
    private Calculator calc;

    @Before
    public void setUp() {
        calc = new Calculator();
        System.out.println("Setup complete");
    }

    @After
    public void tearDown() {
        calc = null;
        System.out.println("Teardown complete");
    }

    @Test
    public void testAdd() {
        Calculator calc = new Calculator();
        int result = calc.add(3, 4);
        Assert.assertEquals(7, result);
    }
    
    @Test
    public void testSubtract() {
        int result = calc.subtract(3, 4);
        Assert.assertEquals(-1, result);
    }
}
