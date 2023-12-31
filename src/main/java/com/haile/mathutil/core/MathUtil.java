/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.haile.mathutil.core;

/**
 *
 * @author lehai
 */
public class MathUtil {
    
    public static final double PI = 3.1415;
    public static long getFactorial(int n) {

        if( n == 0 || n == 1) {
            return 1;
        }
        
        if( n < 0 || n > 20) {
            throw new IllegalArgumentException("Invalid n, n must be between 0 and 20");
        }
        
        return n * getFactorial(n-1);
    }
}
