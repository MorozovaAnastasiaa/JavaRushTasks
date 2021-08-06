package com.javarush.task.pro.task05.task0508;

import java.util.Scanner;

/* 
Удаляем одинаковые строки
*/

public class Solution {
    public static String[] strings;

    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        strings = new String[6];
        for (int i = 0; i < 6; i++)
            strings[i] = scanner.nextLine();
        String str;
        for (int x = 0; x < 6; x++)
        {
            str = strings[x];
            for (int y = 0; y < 6; y++)
            {
                if (strings[y] != null)
                {
                    if (strings[y].equals(str) && x != y)
                    {
                        strings[y] = null;
                        strings[x] = null;
                    }
                }

            }
        }
        for (int i = 0; i < 6; i++)
            System.out.print(strings[i] + ", ");

    }
}
