package com.company;

public class Cat {

    public String getName() {
        counter++;
        return name;
    }

    public void setName(String name) {counter++;
        this.name = name;
    }

    public int getAge() {counter++;
        return age;
    }

    public void setAge(int age) {counter++;
        this.age = age;
    }
    public static void makeVoice() {
        System.out.println("Myau");
    }

    private String name;
    private int age;
    public static int counter;
}


