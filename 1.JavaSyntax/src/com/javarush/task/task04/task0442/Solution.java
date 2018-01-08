package com.javarush.task.task04.task0442;


/* 
Суммирование
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int sh = 0;
        boolean rez = true;
        while (rez){
            String sNumber1 = reader.readLine();
            int n = Integer.parseInt(sNumber1);
            sh += n;
            if(n == -1){
                rez = false;
            }
        }
        System.out.println(sh);
    }
}
