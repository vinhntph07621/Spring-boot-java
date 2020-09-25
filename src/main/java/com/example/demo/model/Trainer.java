package com.example.demo.model;


import javax.persistence.*;

@Entity
@Table(name = "trainer")
public class Trainer {
    private Integer id;
    private String name;
    private int account_id;

    public Trainer(Integer id, String name, int account_id) {
        this.id = id;
        this.name = name;
        this.account_id = account_id;
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

    public int getAccount_id() {
        return account_id;
    }

    public void setAccount_id(int account_id) {
        this.account_id = account_id;
    }
}
