package com.javarush.task.task03.task0313;

/* 
Мама мыла раму
*/

public class Solution {
    public static void printString(String s) {
        System.out.println(s);
    }
    public static void main(String[] args) {
        //напишите тут ваш код
        String a ="Мама";
        String b ="Мыла";
        String c ="Раму";
        printString(a+b+c);
        printString(a+c+b);
        printString(b+c+a);
        printString(b+a+c);
        printString(c+a+b);
        printString(c+b+a);
    }
}
