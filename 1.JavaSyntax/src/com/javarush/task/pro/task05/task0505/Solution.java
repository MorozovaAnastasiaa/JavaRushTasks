package com.javarush.task.pro.task05.task0505;

import java.util.Scanner;

/* 
Reverse
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        int[] array;
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        array = new int[n];

        for (int i = 0; i < array.length; i++)
            array[i] = scanner.nextInt();

        if (n % 2 == 1)
        {
            for (int i = 0; i < array.length; i++)
                System.out.println(array[i]);
        }
        else
        {
            for (int i = array.length - 1; i >= 0; i--)
                System.out.println(array[i]);
        }










    }
}
