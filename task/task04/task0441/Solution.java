package com.javarush.task.task04.task0441;

/* 
Как-то средненько
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int y = Integer.parseInt(reader.readLine());
        int m = Integer.parseInt(reader.readLine());
        int d = Integer.parseInt(reader.readLine());

        int max = Math.max(Math.max(y,m),d);
        int min = Math.min(Math.min(y,m),d);
        int med  = (y+m+d)-(max+min);
        System.out.println(med);



    }
}
