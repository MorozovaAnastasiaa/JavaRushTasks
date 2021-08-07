package com.javarush.task.pro.task05.task0509;

/* 
Таблица умножения
*/

public class Solution {

    public static int[][] MULTIPLICATION_TABLE;

    public static void main(String[] args) {
        //напишите тут ваш код
        MULTIPLICATION_TABLE = new int [10][10];
        String str;
        for (int x = 1; x <= 10; x++)
        {
            for (int y = 1; y <= 10; y++)
            {
                MULTIPLICATION_TABLE[x - 1][y - 1] = (x * y);
            }
        }

        for (int x = 0; x < 10; x++)
        {
            str = "";
            for (int y = 0; y < 10; y++)
                str = str + MULTIPLICATION_TABLE[x][y] + " ";
            System.out.println(str);
        }

    }
}
