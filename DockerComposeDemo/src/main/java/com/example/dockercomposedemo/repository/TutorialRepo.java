package com.example.dockercomposedemo.repository;

import com.example.dockercomposedemo.model.Tutorial;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TutorialRepo extends JpaRepository<Tutorial, Integer> {
}
