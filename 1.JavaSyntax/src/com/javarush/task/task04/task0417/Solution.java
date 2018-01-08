package com.javarush.task.task04.task0417;

/* 
Существует ли пара?
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

        if( a==b){
            System.out.print(a + " " + b );
            if( a==c) System.out.println(" " + c);
        }
        else if( b==c) System.out.print(b + " " + c);
        else if( a==c) System.out.print(a + " " + c);

    }
}