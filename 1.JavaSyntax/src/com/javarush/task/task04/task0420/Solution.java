package com.javarush.task.task04.task0420;

/* 
Сортировка трех чисел
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

        if(a>b && a>c){
            System.out.print(a + " ");
            if(b>c) System.out.print(b + " " + c);
            else System.out.print(c + " " + b);
        }
        else  if(b>a && b>c){
            System.out.print(b + " ");
            if(a>c) System.out.print(a + " " + c);
            else System.out.print(c + " " + a);
        }
        else  if(c>a && c>b) {
            System.out.print(c + " ");
            if(a>b) System.out.print(a + " " + b);
            else System.out.print(b + " " + a);
        }


    }
}
