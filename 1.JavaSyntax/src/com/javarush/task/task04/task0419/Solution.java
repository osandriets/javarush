package com.javarush.task.task04.task0419;

/* 
Максимум четырех чисел
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
        String sNumberD = reader.readLine();
        int d = Integer.parseInt(sNumberD);

        if (a>b && a>c && a>d) System.out.println(a);
        else if (b>a && b>c && b>d) System.out.println(b);
        else if (c>a && c>b && c>d) System.out.println(c);
        else if (d>a && d>b && d>c) System.out.println(d);
        else System.out.println(a);
    }
}
