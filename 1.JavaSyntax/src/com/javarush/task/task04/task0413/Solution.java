package com.javarush.task.task04.task0413;

/* 
День недели
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sNumber = reader.readLine();
        int nNumber = Integer.parseInt(sNumber);

        if(nNumber==1) System.out.println("понедельник");
        else if(nNumber==2) System.out.println("вторник");
        else if(nNumber==3) System.out.println("среда");
        else if(nNumber==4) System.out.println("четверг");
        else if(nNumber==5) System.out.println("пятница");
        else if(nNumber==6) System.out.println("суббота");
        else if(nNumber==7) System.out.println("воскресенье");
        else System.out.println("такого дня недели не существует");
    }
}