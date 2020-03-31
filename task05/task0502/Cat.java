package com.javarush.task.task05.task0502;

/* 
Реализовать метод fight
*/

public class Cat {
    public int age;
    public int weight;
    public int strength;
    String name;

    public Cat() {

    }

    public boolean fight(Cat anotherCat) {
        int cat1count =0;
        int cat2count =0;
        if (this.age > anotherCat.age){cat1count++;}
        else if (this.age<anotherCat.age){cat2count++;};

        if (this.weight > anotherCat.weight){cat1count++;}
        else if (this.weight<anotherCat.weight){cat2count++;};

        if (this.strength > anotherCat.strength){cat1count++;}
        else if (this.strength<anotherCat.strength){cat2count++;};

        return cat1count > cat2count;//напишите тут ваш код
    }

    public static void main(String[] args) {
        Cat vaska = new Cat();

        vaska.age = 8;
        vaska.weight = 4;
        vaska.strength = 9;
        vaska.name = "vaska";

        Cat maska = new Cat();
        maska.age = 6;
        maska.weight = 6;
        maska.strength = 10;
        maska.name = "maska";


        System.out.println(maska.fight(vaska));
    }
}
