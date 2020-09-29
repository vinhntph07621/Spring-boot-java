package com.example.demo.repository;

import com.example.demo.model.Trainer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface TrainerRepository extends JpaRepository<Trainer, Integer> {
    @Query("SELECT u FROM Trainer u WHERE u.accountId IS NULL")
    List<Trainer> findListNoAccount();
}
