package com.javarush.task.pro.task09.task0914;

/* 
Обновление пути
*/

public class Solution {
    public static void main(String[] args) {
        String path = "/usr/java/jdk1.8/bin";

        String jdk13 = "jdk-13";
        System.out.println(changePath(path, jdk13));
    }

    public static String changePath(String path, String jdk) {
        //напишите тут ваш код
        int a = path.indexOf("jdk");
        int b = path.indexOf("/", a);
        String line = path.substring(a,b);
        String change = path.replace(line, jdk);
        return change;
    }
}