package com.Pentagon;

import java.util.Map;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {

    public static void main(String[] args) {

        ConfigurableApplicationContext app =
                new ClassPathXmlApplicationContext("config.xml");

        Student p = (Student) app.getBean("Per");

        System.out.println(p.getId());
        System.out.println(p.getName());

        Map<String, Integer> m = p.getItem();

        for (Map.Entry<String, Integer> e : m.entrySet()) {
            System.out.println(e.getKey() + " | " + e.getValue());
            System.out.println("---------------");
        }

        app.close();
    }
}
