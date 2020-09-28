package com.example.demo.model;


import javax.persistence.*;

@Entity
@Table(name = "trainer")
public class Trainer {
    private Integer id;
    private String name;
    private Integer accountId;

    public Trainer(Integer id, String name, Integer accountId) {
        this.id = id;
        this.name = name;
        this.accountId = accountId;
    }

    public Trainer() {

    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAccountId() {
        return accountId;
    }

    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }
}

