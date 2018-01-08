package com.javarush.task.task04.task0429;

/* 
Положительные и отрицательные числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sNumber1 = reader.readLine();
        int a = Integer.parseInt(sNumber1);
        String sNumberB = reader.readLine();
        int b = Integer.parseInt(sNumberB);
        String sNumberC = reader.readLine();
        int c = Integer.parseInt(sNumberC);

        int rezP = 0;
        int rezO = 0;

        if(a>0) rezP++;
        else if (a<0) rezO++;

        if(b>0) rezP++;
        else if (b<0) rezO++;

        if(c>0) rezP++;
        else if (c<0) rezO++;

        System.out.println("количество отрицательных чисел: " + rezO);
        System.out.println("количество положительных чисел: " + rezP);

    }
}
