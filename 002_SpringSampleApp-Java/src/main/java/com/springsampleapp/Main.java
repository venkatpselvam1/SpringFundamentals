package com.springsampleapp;

import com.springsampleapp.service.SpeakerService;
import com.springsampleapp.service.SpeakerServiceImpl;

public class Main {
    public static void main(String[] args)
    {
        var speakerService = new SpeakerServiceImpl();
        var speakers = speakerService.getAll();
        for (var speaker: speakers)
        {
            System.out.println(speaker);
        }
    }
}
