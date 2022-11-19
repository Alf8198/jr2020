package com.javarush.task.task04.task0428;

/* 
Положительное число
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Integer[] list = new Integer[3];
        for (int i = 0; i < list.length ; i++) {
            list[i] = Integer.parseInt(reader.readLine());
        }//напишите тут ваш код

        int count = 0;
        for (int i = 0; i < list.length; i++) {
            if (list[i]>0){count++;}
        }
        System.out.println(count);

    }
}
