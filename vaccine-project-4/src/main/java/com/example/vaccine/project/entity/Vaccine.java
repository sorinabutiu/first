package com.example.vaccine.project.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.*;

import static javax.persistence.GenerationType.SEQUENCE;

@Entity
@Table(schema = "vaccine", name = "vaccin")
@Data
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Vaccine {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = SEQUENCE, generator = "id_sequence")
    private int id;
    @Column(name = "serie_vaccine")
    private Long serieVaccine;
    @Column(name = "vaccine_type")
    private String vaccineType;
    @Column(name = "vaccine_quantity")
    private int vaccineQuantity;
    @Column(name = "vaccine_number")
    private int vaccineNumber;
    @Column(name = "is_freezed")
    private boolean isFreezed;
}


