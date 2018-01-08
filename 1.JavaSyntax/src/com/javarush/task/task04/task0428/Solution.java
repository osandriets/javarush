package com.javarush.task.task04.task0428;

/* 
Положительное число
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sNumber1 = reader.readLine();
        int a = Integer.parseInt(sNumber1);
        String sNumber2 = reader.readLine();
        int b = Integer.parseInt(sNumber2);
        String sNumber3 = reader.readLine();
        int c = Integer.parseInt(sNumber3);

        int rez = 0;

        if(a>0) rez++;
        if(b>0) rez++;
        if(c>0) rez++;

        System.out.println(rez);


    }
}
