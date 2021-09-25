package com.javarush.task.task05.task0507;

/* 
Среднее арифметическое
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double sum = 0;
        double count = 0;
        while (true){
            int a = Integer.parseInt(reader.readLine());
            if (a == -1) break;
            else {
                sum = sum + a;
                count++;
            }
            //напишите тут ваш код
        }
        double res = sum/count;
        System.out.println(res);

    }

}

