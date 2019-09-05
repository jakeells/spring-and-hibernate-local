package com.training.udemy.demo;

public class MyApp {

    public static void main(String[] args) {
        //create the object
        Coach theCoach = new BaseballCoach();

        //use the object
        System.out.println("Coach's Name: " + theCoach.getFirstName() + " " + theCoach.getLastName());
        System.out.println("Team Playing for: " + theCoach.getTeam());
        System.out.println("Today's Goals: " + theCoach.getDailyWorkout());
        System.out.println("Favorite Statement: " + theCoach.getFavoriteStatement());
        System.out.println("----------------");

        theCoach = new FootballCoach();
        System.out.println("Coach's Name: " + theCoach.getFirstName() + " " + theCoach.getLastName());
        System.out.println("Team Playing for: " + theCoach.getTeam());
        System.out.println("Today's Goals: " + theCoach.getDailyWorkout());
        System.out.println("Favorite Statement: " + theCoach.getFavoriteStatement());
        System.out.println("----------------");

        theCoach = new FootballCoach("Run 3 times around the field", "Dude", "Greatness", "49ers", "Better hit them harder than they hit you!");
        System.out.println("Coach's Name: " + theCoach.getFirstName() + " " + theCoach.getLastName());
        System.out.println("Team Playing for: " + theCoach.getTeam());
        System.out.println("Today's Goals: " + theCoach.getDailyWorkout());
        System.out.println("Favorite Statement: " + theCoach.getFavoriteStatement());
        System.out.println("----------------");
    }
}

