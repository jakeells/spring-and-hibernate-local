package com.training.udemy.data;

import com.training.udemy.interfaces.Coach;
import com.training.udemy.interfaces.FortuneService;
import org.springframework.beans.factory.annotation.Autowired;

public class FootballCoach implements Coach {

    private FortuneService fortuneService;

    private String workout;
    private String firstName;
    private String lastName;
    private String team;
    private String statement;

    //@Autowired
    public FootballCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    public FootballCoach(){
        this.workout = "No Workout Available";
        this.firstName = "No First Name";
        this.lastName = "No Last Name";
        this.team = "No team";
        this.statement = "No statement at this time! :)";
        this.fortuneService = new HappyFortuneService();
    }

    public FootballCoach(String workout, String firstName, String lastName, String team, String statement, FortuneService fortuneService) {
        this.workout = workout;
        this.firstName = firstName;
        this.lastName = lastName;
        this.team = team;
        this.statement = statement;
        this.fortuneService = fortuneService;
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
        System.out.println("Fortune: " + this.getDailyFortune());
        System.out.println("----------------");
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

}
