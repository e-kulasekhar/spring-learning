package com.Pentagon;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {

    public static void main(String[] args) {

        ConfigurableApplicationContext app =
                new ClassPathXmlApplicationContext("Config.xml");

        Student s = (Student) app.getBean("stu");

        System.out.println(s.getId() + " | " + s.getName() + " | " + s.getRollno());

        app.close();
    }
}
