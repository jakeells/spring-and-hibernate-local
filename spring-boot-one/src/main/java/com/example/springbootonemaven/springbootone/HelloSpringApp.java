package com.example.springbootonemaven.springbootone;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloSpringApp {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootOneApplication.class, args);

        //load the spring configuration file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("src/applicationContext.xml");

        //retrieve bean from spring container
        Coach theCoach = context.getBean("myCoach", Coach.class);

        //call methods on the bean
        theCoach.printAttributes();

        theCoach = context.getBean("teamCoach", Coach.class);
        theCoach.printAttributes();
        //close the context
        context.close();
    }
}
