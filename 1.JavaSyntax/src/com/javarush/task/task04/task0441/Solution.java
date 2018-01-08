package com.javarush.task.task04.task0441;


/* 
Как-то средненько
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

        if ((a > b && a < c) || (a < b && a > c)) System.out.println(a);
        else if ((b > a && b < c) || (b < a && b > c)) System.out.println(b);
        else if ((c > a && c < b) || (c < a && c > b)) System.out.println(c);
        else if (a == b || b == c || a == c) {
            if (a == b || a == c) System.out.println(a);
            else System.out.println(b);
        }
    }
}
