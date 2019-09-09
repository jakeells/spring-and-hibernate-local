package com.training.udemy.data;

import com.training.udemy.interfaces.Coach;

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

    @Override
    public void printAttributes() {
        System.out.println("Coach's Name: " + this.getFirstName() + " " + this.getLastName());
        System.out.println("Team Playing for: " + this.getTeam());
        System.out.println("Today's Goals: " + this.getDailyWorkout());
        System.out.println("Favorite Statement: " + this.getFavoriteStatement());
        System.out.println("----------------");
    }

}
