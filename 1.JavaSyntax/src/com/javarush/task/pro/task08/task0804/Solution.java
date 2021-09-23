package com.javarush.task.pro.task08.task0804;

/* 
Randomizer
*/

public class Solution {

    public static void main(String[] args) {
        for (int i = 0; i < 99;i++)
            System.out.println(generateNumber());
    }
    public static int generateNumber() {
        //напишите тут ваш код
        return  (int) (Math.random() * 6);
    }
}
