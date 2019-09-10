package com.training.udemy.data;

import com.training.udemy.interfaces.FortuneService;

public class SadFortuneService implements FortuneService {

    @Override
    public String getFortune() {
        return "Today could be a dark and ominous day, keep a look out for possible conflict.";
    }
}
