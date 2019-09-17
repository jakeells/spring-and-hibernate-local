package com.udemy.springdemoannotations.source;

import com.udemy.springdemoannotations.interfaces.FortuneService;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class RandomFortuneService implements FortuneService {

    private String[] data = {"Beware of the wolf in sheep's clothing",
                             "Diligence is the mother of good luck",
                             "The journey is the reward"};

    private Random myRandom = new Random();

    @Override
    public String getFortune() {
        int index = myRandom.nextInt(data.length);
        return data[index];
    }
}
