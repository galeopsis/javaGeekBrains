package lessons;

import java.util.Locale;

public class Cat {

    protected String name;
    protected String color;
    private int age;
    private static int catsCount;

    public Cat(String name, String color, int age) {
        this.name = name.toUpperCase();
        this.color = color;
        this.age = age;

        catsCount++;
        System.out.printf("Я родился! Меня зовут: %s, всего котов: %d%n", name, catsCount);
    }

    public static int getCatsCount() {
        return catsCount;
    }

    public Cat(String name, String color) {
        this(name, color, 0);

    }


    public Cat(String name) {
        this(name, null);
    }


    void printInfo() {
        System.out.println(this);

    }

    @Override
    public String toString() {
        return " name " + name + " color " + color + " age " + age;
    }

    void run() {
        System.out.println("cat is running");
    }

    public void incAge() {
        age++;
    }

    public void setAge(int age) {
        if (age >= 0 && age < 30) {

            this.age = age;
        } else {
            System.err.println("incorrect age");
        }


    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

}




