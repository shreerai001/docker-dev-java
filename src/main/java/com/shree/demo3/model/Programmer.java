package com.shree.demo3.model;

import javax.persistence.*;

@Entity
@Table(name = "programmer")
public class Programmer {

    public Programmer(Long id, String fullName, String programmingLanguage) {
        this.id = id;
        this.fullName = fullName;
        this.programmingLanguage = programmingLanguage;
    }

    public Programmer() {
    }

    public Programmer(String fullName, String programmingLanguage) {
        this.fullName = fullName;
        this.programmingLanguage = programmingLanguage;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;


    private String fullName;

    private String programmingLanguage;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage) {
        this.programmingLanguage = programmingLanguage;
    }
}
