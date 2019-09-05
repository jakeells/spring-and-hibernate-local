package com.training.udemy.demo;

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

    public String getDailyWorkout() {
        return workout;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getTeam() {
        return team;
    }

    public String getFavoriteStatement() {
        return statement;
    }
}
