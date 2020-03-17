package com.javarush.task.task01.task0132;

/* 
Сумма цифр трехзначного числа
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(sumDigitsInNumber(546));
    }

    public static int sumDigitsInNumber(int number) {
        int n100 = number/100;
        int n10 = (number - n100*100)/10;
        int n1 = (number - n100*100) - n10*10;

        return n1+n10+n100;
        //напишите тут ваш код
    }
}