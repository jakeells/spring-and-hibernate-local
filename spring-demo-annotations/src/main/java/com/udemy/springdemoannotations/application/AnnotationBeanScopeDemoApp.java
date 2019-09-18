package com.udemy.springdemoannotations.application;

import com.udemy.springdemoannotations.interfaces.Coach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Coach theCoach = context.getBean("tennisCoach", Coach.class);

        Coach myCoach = context.getBean("tennisCoach", Coach.class);

        System.out.println("\nPointing to the same object: " + (theCoach == myCoach));
        System.out.println("Memory location for theCoach: " + theCoach);
        System.out.println("Memory location for myCoach: " + myCoach + "\n");

        context.close();
    }
}
