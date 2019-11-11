package com.company;

public class Main {

    public static void main(String[] args) {
	Cat c = new Cat();
	Cat c2 = new Cat();
        System.out.println(Cat.counter);
        c.setAge(2);
        c2.setName("Murka");
        System.out.println(Cat.counter);
        Cat.makeVoice();
    }
}
