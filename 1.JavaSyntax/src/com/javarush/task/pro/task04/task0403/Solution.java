package com.javarush.task.pro.task04.task0403;

import java.util.Scanner;

/* 
Суммирование
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        while (scanner.hasNextInt())
        {
            int n = scanner.nextInt();
            sum = sum + n;
        }
        System.out.println(sum);



    }
}