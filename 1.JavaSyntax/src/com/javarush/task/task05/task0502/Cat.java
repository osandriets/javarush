package com.javarush.task.task05.task0502;

/* 
Реализовать метод fight
*/

public class Cat {
    public String name;
    public int age;
    public int weight;
    public int strength;

    public Cat() {
    }

    public boolean fight(Cat anotherCat) {
        //напишите тут ваш код
        return this.strength*this.weight*this.age >= anotherCat.strength*anotherCat.weight*anotherCat.age;
    }

    public static void main(String[] args) {

    }
}
