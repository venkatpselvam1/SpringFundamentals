package com.springsampleapp.service;

import com.springsampleapp.model.Speaker;
import com.springsampleapp.repository.SpeakerRepository;
import com.springsampleapp.repository.SpeakerRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.wiring.BeanConfigurerSupport;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;

@Service("speakerService")
@Profile("dev")
//@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class SpeakerServiceImpl implements SpeakerService {
    private SpeakerRepository speakerRepository;
    public SpeakerServiceImpl(SpeakerRepository speakerRepository)
    {
        System.out.println("This is the parameterised constructor - SpeakerServiceImpl");
        this.speakerRepository = speakerRepository;
    }

    @PostConstruct
    private void PostProcessor()
    {
        System.out.println("After creating the bean");
    }

    @Override
    public List<Speaker> getAll()
    {
        return this.speakerRepository.getAllSpeaker();
    }

    //@Autowired
    public void setSpeakerRepository(SpeakerRepository speakerRepository)
    {
        System.out.println("This is the setSpeakerRepository method - SpeakerServiceImpl");
        this.speakerRepository = speakerRepository;
    }
}
