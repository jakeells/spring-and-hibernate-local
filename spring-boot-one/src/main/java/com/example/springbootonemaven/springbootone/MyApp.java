package com.example.springbootonemaven.springbootone;

import com.example.springbootonemaven.springbootone.BaseballCoach;
import com.example.springbootonemaven.springbootone.FootballCoach;
import com.example.springbootonemaven.springbootone.Coach;

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

