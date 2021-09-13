package com.javarush.task.pro.task06.task0612;

/* 
У всего есть корень
*/

public class Solution {
    public static void main(String[] args) {
        int[] array = {15,64,9,51,42};
        printSqrt(array);
    }

    public static void printSqrt(int[] a) {
        String elementSqrt = "Корень квадратный для числа ";
        for (int i = 0; i < a.length; i++) {
            int element = a[i];
            double elementSqrt2 = Math.sqrt(element);
            System.out.println(elementSqrt + element + " равен " + elementSqrt2);
        }
    }
}
