package com.javarush.task.task04.task0416;

/* 
Переходим дорогу вслепую
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sNumber = reader.readLine();
        double nNumber = Double.parseDouble(sNumber);

        if(nNumber%5<=3) System.out.println("зелёный");
        else if(nNumber%5>3 && nNumber%5<=4) System.out.println("жёлтый");
        else System.out.println("красный");

    }
}