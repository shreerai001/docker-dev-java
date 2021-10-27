package com.shree.tech.model;

import javax.persistence.*;

@Entity
public class Stack {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    private String name;

    private String sector;

    public Stack(Long id, String name, String sector) {
        this.id = id;
        this.name = name;
        this.sector = sector;
    }

    public Stack(String name, String sector) {
        this.name = name;
        this.sector = sector;
    }

    public Stack() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }
}
