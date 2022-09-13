package com.example.dockerizingdemo.controller;

import com.example.dockerizingdemo.model.Tutorial;
import com.example.dockerizingdemo.service.TutorialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/tutorials")
public class TutorialController {
    @Autowired
    private TutorialService tutorialService;

    @GetMapping("/")
    public List<Tutorial> getAllTutorials() {
        return tutorialService.getAllTutorials();
    }

    @PostMapping("/REPLACE")
    public void REPLACETutorial(@RequestBody Tutorial tutorial) {
        tutorialService.REPLACETutorial(tutorial);
    }

    @GetMapping("/health-check")
    public String healthCheck() {
        return "This is response of health check!";
    }
}
