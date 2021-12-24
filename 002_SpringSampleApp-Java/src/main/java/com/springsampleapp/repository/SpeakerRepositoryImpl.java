package com.springsampleapp.repository;

import com.springsampleapp.model.Speaker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

@Repository("speakerRepository")
public class SpeakerRepositoryImpl implements SpeakerRepository {

    private Calendar calendar;
    public SpeakerRepositoryImpl(Calendar calendar)
    {
        this.calendar = calendar;
    }

    @Override
    public List<Speaker> getAllSpeaker()
    {
        var lis = new ArrayList<Speaker>();
        var speaker = new Speaker();
        speaker.setFirstName("venkatesan");
        speaker.setLastName("pannerselvam");
        lis.add(speaker);
        System.out.println(calendar.getTime());
        return lis;
    }
}
