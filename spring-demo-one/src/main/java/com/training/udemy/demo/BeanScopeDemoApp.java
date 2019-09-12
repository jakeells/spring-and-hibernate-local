package com.training.udemy.demo;

import com.training.udemy.data.BaseballCoach;
import com.training.udemy.interfaces.Coach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext factory = new ClassPathXmlApplicationContext("beanScope-applicationProperties.xml");

        Coach myCoach = factory.getBean("myBaseballCoach", Coach.class);
        myCoach.printAttributes();

        Coach theCoach = factory.getBean("myBaseballCoach", Coach.class);

        boolean result = (myCoach == theCoach);

        System.out.println("\nPointing to the same object: " + result);
        System.out.println("\nMemory location for myCoach: " + myCoach);
        System.out.println("Memory location for theCoach: " + theCoach + "\n\n");

        factory.close();
    }

}
