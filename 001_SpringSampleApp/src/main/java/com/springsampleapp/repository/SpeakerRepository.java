package com.springsampleapp.repository;

import com.springsampleapp.model.Speaker;

import java.util.List;

public interface SpeakerRepository {
    List<Speaker> getAllSpeaker();
}
