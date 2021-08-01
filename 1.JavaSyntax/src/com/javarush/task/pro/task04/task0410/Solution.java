package com.javarush.task.pro.task04.task0410;

import java.util.Scanner;

/* 
Второе минимальное число из введенных
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;
        int n;

        while (scanner.hasNextInt())
        {
            n = scanner.nextInt();
            if (min1 > n) {
                min2 = min1;
                min1 = n;
            }

            if(min2 > n && n > min1)
                min2 = n;
        }
        System.out.println(min2);
    }
}