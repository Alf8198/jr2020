package com.javarush.task.task04.task0424;

/* 
Три числа
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int s = Integer.parseInt(reader.readLine());
        int d = Integer.parseInt(reader.readLine());

        if(d!=a&&d!=s&&a!=s){
            System.out.println();
        }else if(s!=a&&s!=d){
            System.out.println(2);
        }else if(d!=a&&d!=s){
            System.out.println(3);
        }else if(a!=s&&a!=d){
            System.out.println(1);
        }
        //if (a == b && a == c){
        //} else if (a == b) {
          // System.out.println(3);
        //} else if (b == c) {
          //  System.out.println(1);
        //} else if (a == c) {
          //  System.out.println(2);
        }
    }

