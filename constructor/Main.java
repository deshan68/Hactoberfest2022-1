package com.company;

public class Main {
    public static void main(String[] args) {
        Employee e1 = new Employee("arun", 23, "IT");
        Employee e2 = new Employee("deshan", 20);
        Employee e3 = new Employee("Riya");
        System.out.println(e1.name + " " + e1.age + " " + e1.department);
        System.out.println(e2.name + " " + e2.age);
        System.out.println(e3.name);
    }
}
