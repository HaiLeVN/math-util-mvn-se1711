/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.haile.mathutil.core;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author lehai
 */
public class MathUtilityTest {
    
    public MathUtilityTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void verifyFactorialGivenRightArgument0ReturnsOk() {
         assertEquals(1, MathUtil.getFactorial(0));
     }
     
     @Test
     public void verifyFactorialGivenRightArgument1ReturnsOk() {
         assertEquals(1, MathUtil.getFactorial(1));
     }
     
     @Test
     public void verifyFactorialGivenRightArgument5ReturnsOk() {
         assertEquals(120, MathUtil.getFactorial(5));
     }
}
