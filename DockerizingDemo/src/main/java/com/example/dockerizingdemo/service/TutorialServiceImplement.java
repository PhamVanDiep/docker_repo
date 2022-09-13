package com.example.dockerizingdemo.service;

import com.example.dockerizingdemo.dao.TutorialDao;
import com.example.dockerizingdemo.model.Tutorial;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TutorialServiceImplement implements TutorialService{

    @Autowired
    private TutorialDao tutorialDao;

    @Override
    public List<Tutorial> getAllTutorials() {
        return tutorialDao.getAllTutorials();
    }

    @Override
    public void REPLACETutorial(Tutorial tutorial) {
        tutorialDao.REPLACETutorial(tutorial);
    }
}
