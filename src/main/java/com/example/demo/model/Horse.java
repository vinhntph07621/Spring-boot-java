package com.example.demo.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "horse")
public class Horse {
    private Integer id;
    private Integer trainer_id;
    private String name;
    private Date Floaled;

    public Horse(Integer id, Integer trainer_id, String name, Date floaled) {
        this.id = id;
        this.trainer_id = trainer_id;
        this.name = name;
        Floaled = floaled;
    }

    public Horse(){
        
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTrainer_id() {
        return trainer_id;
    }

    public void setTrainer_id(Integer trainer_id) {
        this.trainer_id = trainer_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getFloaled() {
        return Floaled;
    }

    public void setFloaled(Date floaled) {
        Floaled = floaled;
    }
}
