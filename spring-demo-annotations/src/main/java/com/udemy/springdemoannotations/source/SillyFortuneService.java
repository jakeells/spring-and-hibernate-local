package com.udemy.springdemoannotations.source;

import com.udemy.springdemoannotations.interfaces.FortuneService;
import org.springframework.stereotype.Component;

@Component
public class SillyFortuneService implements FortuneService {
    @Override
    public String getFortune() {
        return "When things get going, you should say STOP";
    }
}
