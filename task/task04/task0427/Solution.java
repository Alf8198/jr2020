package com.javarush.task.task04.task0427;

/* 
Описываем числа
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a  = Integer.parseInt(reader.readLine());
        if (a>=1 && a<=999){

            if (a<10&&a>=1){
                System.out.println(a%2==0 ? "четное однозначное число" :"нечетное однозначное число" );//напишите тут ваш код
            }
            else if (a>=10&&a<100){
                System.out.println(a%2==0 ? "четное двузначное число"  :"нечетное двузначное число");//напишите тут ваш код
            }
            else if(a>=100&&a<1000){
                System.out.println(a%2==0 ? "четное трехзначное число" :"нечетное трехзначное число");//напишите тут ваш код
            }


        }

    }
}
