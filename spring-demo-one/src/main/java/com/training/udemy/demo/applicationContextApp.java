package com.training.udemy.demo;

import com.training.udemy.data.BaseballCoach;
import com.training.udemy.data.FootballCoach;
import com.training.udemy.data.HockeyCoach;
import com.training.udemy.interfaces.Coach;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class applicationContextApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext factory = new ClassPathXmlApplicationContext("applicationcontext.xml");
        //GenericXmlApplicationContext factory = new GenericXmlApplicationContext("classpath:applicationContext.xml");
        //factory.load("classpath:applicationContext.xml");
        //factory.refresh();

        Coach myCoach = factory.getBean("myBaseballCoach", BaseballCoach.class);
        myCoach.printAttributes();

        myCoach = factory.getBean("myFootballCoach", FootballCoach.class);
        myCoach.printAttributes();

        myCoach = factory.getBean("myHockeyCoach", HockeyCoach.class);
        myCoach.printAttributes();

        factory.close();
    }
}
