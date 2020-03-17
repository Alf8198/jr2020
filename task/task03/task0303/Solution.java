package com.javarush.task.task03.task0303;

/* 
Обмен валют
*/

public class Solution {

    public static void main(String[] args) {
        int a = 7;
        int b = 25;
        double course = 72.15;
        System.out.println(convertEurToUsd(a,course));
        System.out.println(convertEurToUsd(b,course));//напишите тут ваш код

    }

    public static double convertEurToUsd(int eur, double course) {
        return eur*course;//напишите тут ваш код

    }
}
