package com.javarush.task.task03.task0318;

/* 
План по захвату мира
*/

import org.w3c.dom.ls.LSOutput;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //System.out.println("Введите имя");
        String sage = reader.readLine();
        int age = Integer.parseInt(sage);
        String name = reader.readLine();
        //System.out.println("Введите возраст");

        System.out.println(name+" захватит мир через "+age+" лет. Му-ха-ха!");//напишите тут ваш код

    }
}
