/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.haile.mathutil.main;

import com.haile.mathutil.core.MathUtil;

/**
 *
 * @author lehai
 */

public class Main {
    public static void main(String[] args) {
        
        /////////////////
        // TEST CASE 1 //
        /////////////////
        /*
            check if getFactorial() runs well with n=0
            given n = 0
                invoke getFactorial(0)
                
                Expected result: 1; 0! = 1??
        */
        long Expected = 1; // hi vong tra ve ket qua la
        int n = 0; // input value
        long actual = MathUtil.getFactorial(n);
        
        //in ra va tu ket luan co giong ky vong hay ko
        System.out.println(n + "! | expected = " + Expected +
                         " | actual = " + actual);//
        /////////////////
        // TEST CASE 2 //
        /////////////////
        /*
            Check if getFactorial runs well with n = 1
            Expected result: 1
            1! = 1
        */
        System.out.println(n+1 + "! | expected = " + Expected +
                         " | actual = " + actual);
        
    }
}
