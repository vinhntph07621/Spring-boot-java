package com.example.demo.controller;

import com.example.demo.Exception.ResourceNotFoundException;
import com.example.demo.model.Trainer;
import com.example.demo.repository.TrainerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "trainer")
public class TrainerController {
    @Autowired
    TrainerRepository trainerRepository;

    @GetMapping(value = "/all")
    public List<Trainer> getAllTrainer() {
        return trainerRepository.findAll();
    }

    @PutMapping(value = "/{id}")
    public Trainer updateTrainer(@PathVariable(value = "id") Integer id,
                                 @RequestBody Trainer trainerDetails) {
        Trainer trainer = trainerRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Trainer", "id", id));
        trainer.setName(trainerDetails.getName());
        trainer.setAccountId(trainerDetails.getAccountId());
        return trainerRepository.save(trainer);
    }

    @PostMapping
    public Trainer createTrainer(@RequestBody Trainer trainer) {
        return trainerRepository.save(trainer);
    }

    @GetMapping
    public List<Trainer> getHasNoAccount(@RequestParam(value = "no_account", required = false) Boolean accountId) {
        if (accountId) {
            return trainerRepository.findListNoAccount();
        } else {
            return new ArrayList<>();
        }
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<?> deleteTraner(@PathVariable(value = "id") Integer id){
        Trainer trainer = trainerRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Trainer","id",id));
        trainerRepository.delete(trainer);
        return ResponseEntity.ok().build();
    }


//    @GetMapping(value = "b")
//    public String getFoos(@RequestParam(defaultValue = "test", required = false) String id) {
//        return "ID: " + id;
//    }

    @GetMapping(value = "/{id}")
    public Optional<Trainer> getTrainerById(@PathVariable Integer id) {
        return trainerRepository.findById(id);
    }
}
