package com.example.dockercomposedemo.controller;

import com.example.dockercomposedemo.model.Tutorial;
import com.example.dockercomposedemo.service.TutorialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1/tutorials")
public class TutorialController {
    @Autowired
    private TutorialService tutorialService;

    @GetMapping("/")
    public ResponseEntity<List<Tutorial>> getAllTutorials() {
        List<Tutorial> result = new ArrayList<>();
        tutorialService.getAllTutorials().forEach(result::add);
        if (result.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(result, HttpStatus.OK);
    }
}
