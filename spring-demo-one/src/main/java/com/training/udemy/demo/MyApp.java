package com.training.udemy.demo;

import com.training.udemy.data.BaseballCoach;
import com.training.udemy.data.FootballCoach;
import com.training.udemy.interfaces.Coach;

public class MyApp {

    public static void main(String[] args) {

        Coach theCoach = new BaseballCoach();
        theCoach.printAttributes();

        theCoach = new FootballCoach();
        theCoach.printAttributes();

        theCoach = new FootballCoach("Run 3 times around the field", "Dude", "Greatness", "49ers", "Better hit them harder than they hit you!");
        theCoach.printAttributes();

    }
}

