package com.udemy.springdemoannotations.source;

import com.udemy.springdemoannotations.interfaces.Coach;
import com.udemy.springdemoannotations.interfaces.FortuneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

    private FortuneService fortuneService;

    @Autowired
    public TennisCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() { return "Practice your backhand volley";}

    @Override
    public String getDailyFortune() {
        return this.fortuneService.getFortune();
    }
}
