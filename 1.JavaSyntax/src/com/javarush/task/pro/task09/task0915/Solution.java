package com.javarush.task.pro.task09.task0915;

import java.util.Arrays;
import java.util.StringTokenizer;

/* 
StringTokenizer
*/

public class Solution {
    public static void main(String[] args) {
        String packagePath = "java.util.stream";
        String[] tokens = getTokens(packagePath, "\\.");
        System.out.println(Arrays.toString(tokens));
    }

    public static String[] getTokens(String query, String delimiter) {
        //напишите тут ваш код
        String[] tokens = new String[6];
        StringTokenizer tokenizer = new StringTokenizer(query, delimiter);
        int i = 0;
            while (tokenizer.hasMoreTokens())
            {
                String a = tokenizer.nextToken();
                tokens[i] = a;
                i++;
            }


            return tokens;
    }
}
