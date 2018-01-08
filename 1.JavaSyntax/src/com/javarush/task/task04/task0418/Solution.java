package com.javarush.task.task04.task0418;

/* 
Минимум двух чисел
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

        if( a<b) System.out.print(a);
        else if (b<a) System.out.print(b);
        else System.out.print(a);
    }
}