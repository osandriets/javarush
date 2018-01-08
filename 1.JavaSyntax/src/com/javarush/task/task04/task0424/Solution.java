package com.javarush.task.task04.task0424;

/* 
Три числа
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

        if (a==b || b==c || a==c){
            if(a==b)  System.out.println("3");
            else if(b==c)  System.out.println("1");
            else if(a==c)  System.out.println("2");
        }
    }
}
