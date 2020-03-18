package com.javarush.task.task04.task0429;

/* 
Положительные и отрицательные числа
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Integer[] list = new Integer[3];
        for (int i = 0; i < list.length ; i++) {
            list[i] = Integer.parseInt(reader.readLine());
        }//напишите тут ваш код

        int countP = 0;
        int countM = 0;
        for (int i = 0; i < list.length; i++) {
            if (list[i]>0){countP++;}
            else if(list[i]<0){countM++;}
        }
        System.out.println("количество положительных чисел: "+countP);
        System.out.println("количество отрицательных чисел: "+countM);

    }
}
