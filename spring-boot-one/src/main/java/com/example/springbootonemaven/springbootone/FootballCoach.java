package com.example.springbootonemaven.springbootone;

import com.example.springbootonemaven.springbootone.Coach;

public class FootballCoach implements Coach {

    private String workout;
    private String firstName;
    private String lastName;
    private String team;
    private String statement;

    public FootballCoach(){
        this.workout = "No Workout Available";
        this.firstName = "No First Name";
        this.lastName = "No Last Name";
        this.team = "No team";
        this.statement = "No statement at this time! :)";
    }

    public FootballCoach(String workout, String firstName, String lastName, String team, String statement) {
        this.workout = workout;
        this.firstName = firstName;
        this.lastName = lastName;
        this.team = team;
        this.statement = statement;
    }

    @Override
    public String getDailyWorkout() {
        return workout;
    }

    @Override
    public String getFirstName() {
        return firstName;
    }

    @Override
    public String getLastName() {
        return lastName;
    }

    @Override
    public String getTeam() {
        return team;
    }

    @Override
    public String getFavoriteStatement() {
        return statement;
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
