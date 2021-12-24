package com.springsampleapp;

import com.springsampleapp.repository.SpeakerRepository;
import com.springsampleapp.repository.SpeakerRepositoryImpl;
import com.springsampleapp.service.SpeakerService;
import com.springsampleapp.service.SpeakerServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Calendar;

@Configuration
@ComponentScan({"com.springsampleapp"})
public class AppConfig {
    @Bean("calendarFactory")
    public CalenderFactory getCalenderFactory()
    {
        var calenderFactory = new CalenderFactory();
        calenderFactory.AddDays(2);
        return calenderFactory;
    }

    @Bean("calendar")
    public Calendar getCalendar() throws Exception
    {
        return getCalenderFactory().getObject();
    }
    /*
    @Bean(name = "speakerService")
    public SpeakerService getSpeakerService()
    {
        //var speakerService =  new SpeakerServiceImpl(getSpeakerRepository());

        //using the parameterless constructor will throw nullpointer exception
        // to fix this:
        // 1. we need to add @Autowired annotation in the setter function (or)
        // 2. we need to add @Autowired annotation in the private property
        var speakerService =  new SpeakerServiceImpl();

        // it is an example for setter injection
        //speakerService.setSpeakerRepository(getSpeakerRepository());
        return speakerService;
    }
    @Bean(name = "speakerRepository")
    public SpeakerRepository getSpeakerRepository()
    {
        return new SpeakerRepositoryImpl();
    }
    */
}
