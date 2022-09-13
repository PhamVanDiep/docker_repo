package com.example.dockercomposedemo.service;

import com.example.dockercomposedemo.model.Tutorial;
import com.example.dockercomposedemo.repository.TutorialRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TutorialService {
    @Autowired
    private TutorialRepo tutorialRepo;

    public List<Tutorial> getAllTutorials() {
        return tutorialRepo.findAll();
    }
}
