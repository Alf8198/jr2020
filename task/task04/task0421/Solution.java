package com.javarush.task.task04.task0421;

/* 
Настя или Настя?
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name1 = reader.readLine();
        String name2 = reader.readLine();//напишите тут ваш код
        System.out.println(name1.equalsIgnoreCase(name2)?"Имена идентичны":name1.length()==name2.length()?"Длины имен равны":"");

        if (name1.equalsIgnoreCase(name2)){
            System.out.println("Имена идентичны");}
        else if (name1.length()==name2.length()){
            System.out.println("Длины имен равны");
        }else;

    }
}
