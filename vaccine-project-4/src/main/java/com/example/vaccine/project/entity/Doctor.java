package com.example.vaccine.project.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.*;

import static javax.persistence.EnumType.STRING;
import static javax.persistence.GenerationType.SEQUENCE;

@Entity
@Table(schema = "vaccine", name = "doctor")
@Data
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})

public class Doctor {
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
    @Enumerated(STRING)
    @Column(name = "type")
    private DoctorType type;
}