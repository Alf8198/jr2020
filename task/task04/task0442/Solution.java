package com.javarush.task.task04.task0442;

/* 
Суммирование
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;
        while (true){
            int a = Integer.parseInt(reader.readLine());
            if(a==-1){
                sum = sum+a;
                System.out.println(sum);
                break;//напишите тут ваш код
            }else sum = sum+a;

        }

    }
}
