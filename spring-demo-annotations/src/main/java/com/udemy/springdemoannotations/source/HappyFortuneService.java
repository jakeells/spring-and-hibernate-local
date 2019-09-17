package com.udemy.springdemoannotations.source;

import com.udemy.springdemoannotations.interfaces.FortuneService;
import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneService {

    @Override
    public String getFortune() {
        return "Today is your lucky day";
    }
}
