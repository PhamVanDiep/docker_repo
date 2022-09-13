package com.example.dockerizingdemo.service;

import com.example.dockerizingdemo.model.Tutorial;

import java.util.List;

public interface TutorialService {
    List<Tutorial> getAllTutorials();
    void REPLACETutorial(Tutorial tutorial);
}
