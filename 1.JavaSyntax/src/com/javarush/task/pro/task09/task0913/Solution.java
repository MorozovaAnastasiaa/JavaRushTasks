package com.javarush.task.pro.task09.task0913;

/* 
Поиск в строке
*/

public class Solution {
    public static void main(String[] args) {
        String string = "Чтобы стать программистом, нужно писать код. Чтобы писать код, нужно учиться. Чтобы учиться, нужно желание.";
        String word = "код";
        int indexFromFirstWord = getIndexFromFirstWord(string, word);
        int indexFromLastWord = getIndexFromLastWord(string, word);
        System.out.println("Индекс первого символа первого слова \"" + word + "\" равен - " + indexFromFirstWord);
        System.out.println("Индекс первого символа последнего слова \"" + word + "\" равен - " + indexFromLastWord);
    }

    public static int getIndexFromFirstWord(String string, String word) {
        //напишите тут ваш код
        String line = string;
        String letter = word;
        int number = line.indexOf(word);
        return number;
    }

    public static int getIndexFromLastWord(String string, String word) {
        //напишите тут ваш код
        String line1 = string;
        String letter1 = word;
        int number1 = line1.lastIndexOf(word);
        return number1;
    }
}
