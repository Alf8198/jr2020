package com.javarush.task.task04.task0414;

/* 
Количество дней в году
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));//напишите тут ваш код
        int year = Integer.parseInt(reader.readLine());
        if (year%400==0){
            System.out.println("количество дней в году: 366");}
        else if (year%100==0){
                System.out.println("количество дней в году: 365");}
        else if (year%4==0) {System.out.println("количество дней в году: 366");}
        else System.out.println("количество дней в году: 365");
        //"количество дней в году: 366" "количество дней в году: 365"
    }

}