package com.javarush.task.task04.task0427;

/* 
Описываем числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код


        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sNumber1 = reader.readLine();
        int a = Integer.parseInt(sNumber1);

        if(a>0 && a<1000){

            if(a%2==0) System.out.print("четное ");
            else System.out.print("нечетное ");

            if(a<10) System.out.print("однозначное ");
            else if(a<100) System.out.print("двузначное ");
            else if(a<1000) System.out.print("трехзначное ");
            System.out.print("число");
        }
    }
}
