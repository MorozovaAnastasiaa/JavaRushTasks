package com.javarush.task.pro.task10.task1005;

/* 
Многосерийный предприниматель
*/

public class Building {
    private String type;

    //напишите тут ваш код
    public void initialize(String type)
    {
        this.type = type;
    }

    public void main(String[] args) {
        initialize("Барбершоп");
    }
}
