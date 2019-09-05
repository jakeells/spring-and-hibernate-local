package com.training.udemy.demo;

public class BaseballCoach implements Coach {

    @Override
    public String getDailyWorkout() {
        return "Spend 30 minutes on batting practice";
    }

    @Override
    public String getFirstName() {
        return "Jake";
    }

    @Override
    public String getLastName() {
        return "Ellsworth";
    }

    @Override
    public  String getTeam() {
        return "Colorado Rockies";
    }

    //not yet implemented, will get to it in epic 3
    @Override
    public String getFavoriteStatement() {
        return "";
    }

}
