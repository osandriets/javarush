package com.javarush.task.task04.task0443;


/* 
Как назвали, так назвали
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        String sNumber1 = reader.readLine();
        int y = Integer.parseInt(sNumber1);
        String sNumber2 = reader.readLine();
        int m = Integer.parseInt(sNumber2);
        String sNumber3 = reader.readLine();
        int d = Integer.parseInt(sNumber3);

        System.out.println("Меня зовут " + name +".");
        System.out.println("Я родился " + d +"." + m +"." + y );

    }
}