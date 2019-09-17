package com.udemy.springdemoannotations.source;

import com.udemy.springdemoannotations.interfaces.Coach;
import org.springframework.stereotype.Component;

@Component("thatSillyCoach")
public class TennisCoach implements Coach {

    @Override
    public String getDailyWorkout() { return "Practice your backhand volley";}
}
