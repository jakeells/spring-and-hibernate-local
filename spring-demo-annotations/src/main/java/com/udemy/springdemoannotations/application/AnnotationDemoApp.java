package com.udemy.springdemoannotations.application;

import com.udemy.springdemoannotations.interfaces.Coach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {
    public static void main(String[] args) {
        //read spring config file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        //get the bean from spring container
        Coach theCoach = context.getBean("tennisCoach", Coach.class);

        //call a method on the bean
        System.out.println("Daily workout: " + theCoach.getDailyWorkout());

        //call method to get the daily fortune
        System.out.println("Daily fortune: " + theCoach.getDailyFortune());
        System.out.println("Coach email: " + theCoach.getEmail() + " \nTeam: " + theCoach.getTeam());

        //close the context
        context.close();

    }
}
