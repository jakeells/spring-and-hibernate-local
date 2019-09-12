package com.training.udemy.demo;

import com.training.udemy.interfaces.Coach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleDemoApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext factory = new ClassPathXmlApplicationContext("beanLifeCycle-applicationContext.xml");

        Coach myCoach = factory.getBean("myBaseballCoach", Coach.class);
        Coach theCoach = factory.getBean("myBaseballCoach", Coach.class);

        System.out.println("\nThey are referencing the same bean: " + (myCoach == theCoach));

        System.out.println("myCoach memory location: " + myCoach);
        System.out.println("theCoach memory location: " + theCoach + "\n\n");

        factory.close();
    }

}
