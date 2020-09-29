package com.example.demo.controller;

import com.example.demo.Exception.ResourceNotFoundException;
import com.example.demo.model.Horse;
import com.example.demo.model.Trainer;
import com.example.demo.repository.HorseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/horse")
public class HorseController {
    @Autowired
    HorseRepository horseRepository;

    @GetMapping("/all")
    public List<Horse> getAllHorse(){
        return horseRepository.findAll();
    }

    @GetMapping
    public List<Horse> filterHorse(@RequestParam(value = "trainer_id") Integer trainer_id){

        return null;
    }

    @PostMapping
    public Horse createHorse(@RequestBody Horse horse){
        return horseRepository.save(horse);
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<?> deleteHorse(@PathVariable(value = "id") Integer id){
        Horse horse = horseRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Horse","id",id));
        horseRepository.delete(horse);
    return ResponseEntity.ok().build();
    }
}
