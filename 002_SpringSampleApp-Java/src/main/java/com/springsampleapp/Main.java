package com.springsampleapp;

import com.springsampleapp.service.SpeakerService;
import com.springsampleapp.service.SpeakerServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args)
    {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        var speakerService = applicationContext.getBean("speakerService", SpeakerService.class);
        var speakers = speakerService.getAll();
        for (var speaker: speakers)
        {
            System.out.println(speaker);
        }
    }
}
