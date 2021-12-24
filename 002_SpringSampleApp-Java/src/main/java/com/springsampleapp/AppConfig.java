package com.springsampleapp;

import com.springsampleapp.repository.SpeakerRepository;
import com.springsampleapp.repository.SpeakerRepositoryImpl;
import com.springsampleapp.service.SpeakerService;
import com.springsampleapp.service.SpeakerServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean(name = "speakerService")
    public SpeakerService getSpeakerService()
    {
        var speakerService =  new SpeakerServiceImpl();
        speakerService.setSpeakerRepository(getSpeakerRepository());
        return speakerService;
    }

    @Bean(name = "speakerRepository")
    public SpeakerRepository getSpeakerRepository()
    {
        return new SpeakerRepositoryImpl();
    }

}
