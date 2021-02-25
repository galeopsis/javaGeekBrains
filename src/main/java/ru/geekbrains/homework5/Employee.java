package ru.geekbrains.homework5;

public class Employee {
    private String name;
    private String post;
    private String email;
    private String phoneNumber;
    private int salary;
    private int age;

    public Employee (String name, String post, String email, String phoneNumber, int salary, int age) {
        this.name = name;
        this.post = post;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    void empInfo() {
        System.out.println("Информация о сотруднике: " + " ФИО: " + name + "; Должность: " + post + "; Электронная почта: "
                + email + "; Номер телефона: " + phoneNumber + "; Заработная плата: " + salary + "; Возраст: " + age + ".");
    }

    public int getAge() {
        return age;
    }

}

