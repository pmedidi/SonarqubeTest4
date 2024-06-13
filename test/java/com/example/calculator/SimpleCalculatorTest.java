package com.example.calculator; 
import static org.junit.jupiter.api.Assertions.*; 
import org.junit.jupiter.api.Test; 
public class SimpleCalculatorTest { 
@Test public void testAdd() { assertEquals(5, SimpleCalculator.add(2, 3)); } 
@Test public void testSubtract() { assertEquals(1, SimpleCalculator.subtract(3, 2)); } 
@Test public void testMultiply() { assertEquals(6, SimpleCalculator.multiply(2, 3)); } 
@Test public void testDivide() { assertEquals(2, SimpleCalculator.divide(6, 3)); } 
@Test public void testDivideByZero() { assertEquals(0, SimpleCalculator.divide(6, 0)); } 
} 
