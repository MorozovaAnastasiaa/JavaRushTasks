package com.javarush.task.pro.task13.task1309;

import java.util.HashMap;

/* 
Успеваемость студентов
*/

public class Solution {
    public static HashMap<String, Double> grades = new HashMap<>();

    public static void main(String[] args) {
        addStudents();
        System.out.println(grades);
    }

    public static void addStudents() {
        //напишите тут ваш код
        grades.put("Иванов", 3.56);
        grades.put("Грачев", 2.00);
        grades.put("Трушин", 2.74);
        grades.put("Кузнецова", 4.96);
        grades.put("Морозова", 4.82);
    }
}
