package com.springsampleapp.service;

import com.springsampleapp.model.Speaker;
import com.springsampleapp.repository.SpeakerRepository;
import com.springsampleapp.repository.SpeakerRepositoryImpl;

import java.util.List;

public class SpeakerServiceImpl implements SpeakerService {
    private SpeakerRepository speakerRepository;
    @Override
    public List<Speaker> getAll()
    {
        return this.speakerRepository.getAllSpeaker();
    }

    public void setSpeakerRepository(SpeakerRepository speakerRepository)
    {
        this.speakerRepository = speakerRepository;
    }
}
