package com.springsampleapp.repository;

import com.springsampleapp.model.Speaker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

@Repository("speakerRepository")
@Profile("dev")
public class SpeakerRepositoryImpl implements SpeakerRepository {

    private Calendar calendar;

    @Value("#{ T(java.lang.Math).random() * 10}")
    private int speakerCount;
    public SpeakerRepositoryImpl(Calendar calendar)
    {
        this.calendar = calendar;
    }

    @Override
    public List<Speaker> getAllSpeaker()
    {
        var lis = new ArrayList<Speaker>();
        for (int i=0; i < speakerCount; i++)
        {
            var speaker = new Speaker();
            speaker.setFirstName("venkatesan"+i);
            speaker.setLastName("pannerselvam"+i);
            lis.add(speaker);
        }

        System.out.println(calendar.getTime());
        return lis;
    }
}
