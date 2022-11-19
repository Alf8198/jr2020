package com.javarush.task.task04.task0426;

/* 
Ярлыки и числа
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());

            System.out.println(a > 0 && a % 2 == 0 ? "положительное четное число" : a < 0 && a % 2 == 0 ? "отрицательное четное число" : a > 0 && a % 2 != 0 ? "положительное нечетное число" : a < 0 && a % 2 != 0 ? "отрицательное нечетное число" : "ноль");//напишите тут ваш код
        }
    }

