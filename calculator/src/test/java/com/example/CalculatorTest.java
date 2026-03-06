package com.example;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

/*
* @TestInstance(TestInstance.Lifecycle.PER_CLASS) Creates only one instant of the test class for all methods (beforeAll and afterAll can be static or not)
* @TestInstance(TestInstance.Lifecycle.PER_METHOD) [DEFAULT] Creates an instant of the test class for each test method (beforeAll and afterAll must be static)
*
* */
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class CalculatorTest {
    public CalculatorTest() {
        System.out.println("CalculatorTest Constructor");
    }

    @BeforeAll
    public void beforeAll() {
        System.out.println("Before All");
    }
    @AfterAll
    public void afterAll() {
        System.out.println("After All");
    }
    @BeforeEach
    public void beforeEach() {
        System.out.println("Before Each");
    }
    @AfterEach
    public void afterEach() {
        System.out.println("After Each");
    }
    @Test
    public void testAdd(){
        Calculator calculator = new Calculator();
        int x =  5;
        int y = 3;
        int result = calculator.add(x, y);
        assertEquals(8,result, "Result should be 8");
    }
    @Test
    public void testSubtract(){
        Calculator calculator = new Calculator();
        int x =  5;
        int y = 3;
        int result = calculator.sub(x, y);
        assertEquals(2,result, "Result should be 2");
    }
    @Test
    public void testMultiply(){
        Calculator calculator = new Calculator();
        int x =  5;
        int y = 3;
        int result = calculator.mul(x, y);
        assertEquals(15,result, "Result should be 15");
    }
    @Test
    public void testDivide(){
        Calculator calculator = new Calculator();
        int x =  15;
        int y = 3;
        int z = 0;
        int result = calculator.div(x, y);
        assertEquals(5,result, "Result should be 5");
        assertThrows(IllegalArgumentException.class, () -> calculator.div(x, z), "Division by 0");
    }

    @Test
    public void testPositive(){
        Calculator calculator = new Calculator();
        int x =  5;
        int y = 0;
        int z = -10;

        assertTrue(calculator.isPositive(x),"Result should be true");
        assertTrue(calculator.isPositive(y),"Result should be true");
        assertFalse(calculator.isPositive(z),"Result should be false");

    }
}
