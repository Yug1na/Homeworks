package ru.gb.lesson2;

public class Employee {
    private String name;
    private String position;
    private String email;
    private String tel;
    private double wage;
    int age;

    Employee (String name, int age, String position, String email, String tel, double wage ){
        this.name=name;
        this.position=position;
        this.email=email;
        this.tel=tel;
        this.wage=wage;
        this.age=age;
    }
    void print(){
        System.out.printf("%s, %s, %s, %s, %s, %s\n", name, age, position, email, tel, wage);
    }

}
