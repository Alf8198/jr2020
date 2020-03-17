package com.javarush.task.task03.task0309;

/* 
Сумма 5 чисел
*/

public class Solution {
    public static void main(String[] args) {
        int x = 1;
        System.out.println(x);
        for (int i = 2; i < 6; i++ ) {
            int a = x+i;
            x =a;
            System.out.println(a);//напишите тут ваш код
        }
    }
}
