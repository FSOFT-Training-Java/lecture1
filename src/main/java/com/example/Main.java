package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        System.out.println("Running...");
        ApplicationContext context = new ClassPathXmlApplicationContext("employee.xml");
        Employee e1 = (Employee) context.getBean("emp1");
        System.out.println(e1.getName());
    }
}