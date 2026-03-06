package com.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    @Test
    public void testAdd(){
        Calculator calculator = new Calculator();
        int x =  5;
        int y = 3;
        int result = calculator.add(x, y);
        Assertions.assertEquals(8,result, "Result should be 8");
    }
    @Test
    public void testSubtract(){
        Calculator calculator = new Calculator();
        int x =  5;
        int y = 3;
        int result = calculator.sub(x, y);
        Assertions.assertEquals(2,result, "Result should be 2");
    }
    @Test
    public void testMultiply(){
        Calculator calculator = new Calculator();
        int x =  5;
        int y = 3;
        int result = calculator.mul(x, y);
        Assertions.assertEquals(15,result, "Result should be 15");
    }
    @Test
    public void testDivide(){
        Calculator calculator = new Calculator();
        int x =  15;
        int y = 3;
        int result = calculator.div(x, y);
        Assertions.assertEquals(5,result, "Result should be 5");
    }
}
