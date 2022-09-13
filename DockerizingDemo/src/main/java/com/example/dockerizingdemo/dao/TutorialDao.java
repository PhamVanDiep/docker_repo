package com.example.dockerizingdemo.dao;

import com.example.dockerizingdemo.model.Tutorial;

import java.util.List;

public interface TutorialDao {
    List<Tutorial> getAllTutorials();
    void REPLACETutorial(Tutorial tutorial);
}
