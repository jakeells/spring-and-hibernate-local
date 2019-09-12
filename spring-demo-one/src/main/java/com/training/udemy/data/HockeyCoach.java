package com.training.udemy.data;

import com.training.udemy.interfaces.Coach;
import com.training.udemy.interfaces.FortuneService;
import org.springframework.beans.factory.annotation.Autowired;

public class HockeyCoach implements Coach {

    private String workout;
    private String firstName;
    private String lastName;
    private String team;
    private String statement;
    private String fortune;

    private FortuneService fortuneService;

    @Autowired
    public HockeyCoach() {
        this.workout = "Practice checking";
        this.firstName = "Smile";
        this.lastName = "Toothless";
        this.team = "Incredibles";
        this.statement = "winners always win";
        this.fortune = "Hit them hard and you will win!";
        this.fortuneService = new HappyFortuneService();
        System.out.println("default constructor - fortune service: " + this.fortuneService.getFortune());
    }

    public void setFortuneService(FortuneService fortuneService) {
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

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

}
