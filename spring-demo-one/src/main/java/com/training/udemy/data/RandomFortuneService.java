package com.training.udemy.data;

import com.training.udemy.interfaces.FortuneService;

import java.util.Random;

public class RandomFortuneService implements FortuneService {

    private String[] manyFortunes = {"You will win big", "You will gain a lot of weight", "You look amazing", "This is a great shirt"};
    private Random myRandom = new Random();

    public RandomFortuneService() {

    }

    public RandomFortuneService(String[] manyFortunes) {
        this.manyFortunes = manyFortunes;
    }
    @Override
    public String getFortune() {
        int index = myRandom.nextInt(manyFortunes.length);
        return manyFortunes[index];
    }

    public void setManyFortunes(String[] manyFortunes) {
        this.manyFortunes = manyFortunes;
    }
}
