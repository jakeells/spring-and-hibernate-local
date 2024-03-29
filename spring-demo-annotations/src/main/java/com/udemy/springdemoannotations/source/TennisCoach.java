package com.udemy.springdemoannotations.source;

import com.udemy.springdemoannotations.interfaces.Coach;
import com.udemy.springdemoannotations.interfaces.FortuneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class TennisCoach implements Coach {

    //@Autowired
    //@Qualifier("happyFortuneService")
    private FortuneService fortuneService;

    @Value("${foo.email}")
    private String email;

    @Value("${foo.team}")
    private String team;

    @Value("#{'${foo.players}'.split('/')}")
    private String[] players;

    @Autowired
    public TennisCoach(@Qualifier("randomFortuneService") FortuneService fortuneService) {
        this.fortuneService = fortuneService;
        //System.out.println("Tennis Coach : AUTOWIRED constructor");
    }

    @Override
    public String getDailyWorkout() { return "Practice your backhand volley";}

    @Override
    public String getDailyFortune() { return this.fortuneService.getFortune();}

    @Override
    public String getEmail() { return this.email;}

    @Override
    public String getTeam() {
        String teamPlayers = "\nPlayers:";
        int index = 0;
        for (String player : players) {
            index += 1;
            teamPlayers += " " + index + "." + player;
        }
        return (this.team + teamPlayers);
    }

/*
    @Autowired
    public void setFortuneService(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
        System.out.println("TennisCoach : Inside AUTOWIRED setter");
    }
*/
}
