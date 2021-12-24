package com.springsampleapp.service;

import com.springsampleapp.model.Speaker;
import com.springsampleapp.repository.SpeakerRepository;
import com.springsampleapp.repository.SpeakerRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class SpeakerServiceImpl implements SpeakerService {
    @Autowired
    private SpeakerRepository speakerRepository;
    public SpeakerServiceImpl()
    {
        System.out.println("This is the default parameterless constructor - SpeakerServiceImpl");
    }
    public SpeakerServiceImpl(SpeakerRepository speakerRepository)
    {
        System.out.println("This is the parameterised constructor - SpeakerServiceImpl");
        this.speakerRepository = speakerRepository;
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
