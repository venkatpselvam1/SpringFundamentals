package com.springsampleapp.repository;

import com.springsampleapp.model.Speaker;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.List;

@Repository("speakerRepository")
public class SpeakerRepositoryImpl implements SpeakerRepository {
    @Override
    public List<Speaker> getAllSpeaker()
    {
        var lis = new ArrayList<Speaker>();
        var speaker = new Speaker();
        speaker.setFirstName("venkatesan");
        speaker.setLastName("pannerselvam");
        lis.add(speaker);
        return lis;
    }
}
