package com.example.vaccine.project.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.*;

import static javax.persistence.GenerationType.SEQUENCE;

@Entity
@Table(schema = "vaccine", name = "patient")
@Data
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Patient {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = SEQUENCE, generator = "id_sequence")
    private int id;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "email")
    private String eMail;
    @Column(name = "age")
    private int age;
    @Column(name = "married")
    private boolean isMarried;
    @Column(name = "assurance")
    private boolean hasAssurance;
    @Column(name = "vaccinated")
    private boolean isVaccinated;
}