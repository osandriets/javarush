package com.javarush.task.task04.task0415;

/* 
Правило треугольника
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sNumberA = reader.readLine();
        int a = Integer.parseInt(sNumberA);
        String sNumberB = reader.readLine();
        int b = Integer.parseInt(sNumberB);
        String sNumberC = reader.readLine();
        int c = Integer.parseInt(sNumberC);

        if( (a+b)>c && (a+c)>b && (b+c)>a ) System.out.println("Треугольник существует.");
        else System.out.println("Треугольник не существует.");
    }
}