package com.Pentagon;

import java.util.List;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {

    public static void main(String[] args) {

        ConfigurableApplicationContext app =
                new ClassPathXmlApplicationContext("config.xml");

        Student s = (Student) app.getBean("student");

        System.out.println(s.getId());
        System.out.println(s.getName());

        List<Subject> l = s.getSub();

        for (Subject s1 : l) {
            System.out.println(s1.getId());
            System.out.println(s1.getName());
        }

        app.close();
    }
}
