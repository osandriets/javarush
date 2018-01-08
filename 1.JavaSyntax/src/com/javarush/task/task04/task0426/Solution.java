package com.javarush.task.task04.task0426;

/* 
Ярлыки и числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sNumber1 = reader.readLine();
        int a = Integer.parseInt(sNumber1);

        if (a == 0) {
            System.out.print("ноль");
        }
        else {
            if(a>0) System.out.print("положительное ");
            else System.out.print("отрицательное ");
            if(a%2==0) System.out.print("четное число");
            else System.out.print("нечетное число ");
        }

    }
}
