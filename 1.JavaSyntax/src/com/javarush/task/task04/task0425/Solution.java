package com.javarush.task.task04.task0425;

/* 
Цель установлена!
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

        if(a>0 && b>0) System.out.println("1");
        else if(a<0 && b>0) System.out.println("2");
        else if(a<0 && b<0) System.out.println("3");
        else if(a>0 && b<0) System.out.println("4");
    }
}
