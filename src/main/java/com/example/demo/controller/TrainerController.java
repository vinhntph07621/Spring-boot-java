package com.example.demo.controller;


import com.example.demo.model.Trainer;
import com.example.demo.repository.TrainerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "trainer", method = RequestMethod.GET)
public class TrainerController {
    @Autowired
    TrainerRepository trainerRepository;
    @GetMapping("/all")
    public List<Trainer> getAllTrainer() {
        return trainerRepository.findAll();
    }
}
