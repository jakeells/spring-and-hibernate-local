package com.training.udemy.demo;

import com.training.udemy.data.*;
import com.training.udemy.interfaces.Coach;
import com.training.udemy.data.HockeyCoach;
import com.training.udemy.data.SadFortuneService;

public class MyApp {

    public static void main(String[] args) {

        Coach theCoach;
        Coach myCoach;
/*
        theCoach = new BaseballCoach(new HappyFortuneService());
        theCoach.printAttributes();

        theCoach = new BaseballCoach(new SadFortuneService());
        theCoach.printAttributes();

        theCoach = new FootballCoach(new SadFortuneService());
        theCoach.printAttributes();

        theCoach = new FootballCoach();
        theCoach.printAttributes();

        theCoach = new FootballCoach("Run 3 times around the field", "Dude", "Greatness", "49ers", "Better hit them harder than they hit you!", new SadFortuneService());
        theCoach.printAttributes();
*/
        theCoach = new BaseballCoach(new HappyFortuneService());
        //theCoach = new BaseballCoach(new HappyFortuneService());
        //((HockeyCoach)theCoach).setFortuneService(new SadFortuneService());
        //theCoach.printAttributes();

        myCoach = theCoach;
        boolean result = (theCoach == myCoach);

        System.out.println("\n Pointing to the same object: " + result);
        System.out.println("\n Memory location for theCoach: " + theCoach);
        System.out.println("\n Memory location for myCoach: " + myCoach);
        //assert result;
    }
}

