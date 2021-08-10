package com.javarush.task.pro.task05.task0511;

import java.util.Scanner;

/* 
Создаем двумерный массив
*/

public class Solution {
    public static int[][] multiArray;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        multiArray = new int[x][];

        for (int i = 0; i < multiArray.length; i++)
        {
            int y = scanner.nextInt();
            multiArray[i] = new int[y];
        }
        for (x = 0; x < multiArray.length; x++)
        {
            for (int y = 0; y < multiArray[x].length; y++)
            {
                System.out.print(multiArray[x][y] + " ");
            }
            System.out.println();
        }


    }
}
