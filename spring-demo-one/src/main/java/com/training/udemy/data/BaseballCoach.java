package com.training.udemy.data;

import com.training.udemy.interfaces.Coach;
import com.training.udemy.interfaces.FortuneService;
//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;

@Scope(value=ConfigurableBeanFactory.SCOPE_SINGLETON)
public class BaseballCoach implements Coach {
    
    //define a private field for the dependency
    private FortuneService fortuneService;

    public BaseballCoach() {
        fortuneService = new HappyFortuneService();
    }
    //define a constructor for dependency injection

    public BaseballCoach(FortuneService theFortuneService) {
        this.fortuneService = theFortuneService;
    }

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
        System.out.println("Fortune: " + this.getDailyFortune());
        System.out.println("----------------");
    }

    @Override
    public String getDailyFortune() {
        //use my fortuneService to get a fortune
        return fortuneService.getFortune();
    }

    public void doMyStartUpStuff() {
        System.out.println("Baseball Coach - inside the doMySTARTUPStuff method");
    }

    public void doMyEndingStuff() {
        System.out.println("Baseball Coach - inside the doMyENDINGStuff method");
    }

}
