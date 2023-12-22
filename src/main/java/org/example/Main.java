package org.example;

import org.example.beanusingxml.School;
import org.example.beanusingxmlannotations.AnotherSchool;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        School school = context.getBean("school", School.class);
        school.print();
        ((ClassPathXmlApplicationContext)context).close();

        ApplicationContext context1 = new ClassPathXmlApplicationContext("beanswithxmlannotation.xml");
        AnotherSchool school1 = context1.getBean("anotherSchool", AnotherSchool.class);
        school1.print();
        ((ClassPathXmlApplicationContext)context1).close();
    }
}