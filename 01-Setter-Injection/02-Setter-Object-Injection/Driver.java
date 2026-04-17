package com.Pentagon;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {

    public static void main(String[] args) {

        ConfigurableApplicationContext app =
                new ClassPathXmlApplicationContext("config.xml");

        Student s = (Student) app.getBean("stu");

        System.out.println(s.getM().getId());
        System.out.println(s.getM().getName());
        System.out.println(s.getId());
        System.out.println(s.getName());

        app.close();
    }
}
