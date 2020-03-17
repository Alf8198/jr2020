package com.javarush.task.task04.task0420;

/* 
Сортировка трех чисел
*/


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;


public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Integer[] list = new Integer[3];
        for (int i = 0; i < 3; i++) {
            list[i] = Integer.parseInt(reader.readLine());
        }
        Arrays.sort(list,Collections.reverseOrder());

        for (int i:list) {
            System.out.print(i + " ");
        }
        
    }
}
