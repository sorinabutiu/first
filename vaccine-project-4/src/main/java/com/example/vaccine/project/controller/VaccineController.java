package com.example.vaccine.project.controller;

import com.example.vaccine.project.entity.Vaccine;
import com.example.vaccine.project.service.VaccineService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/vacc")
@AllArgsConstructor
public class VaccineController {
    private final VaccineService vaccineService;

    @PostMapping("/addVaccine")
    public Vaccine addVaccine(@RequestBody Vaccine vaccine){
        return vaccineService.saveVaccine(vaccine);
    }
    @PostMapping("/addVaccines")
    public List<Vaccine> addVaccines(@RequestBody List<Vaccine> vaccines){
        return vaccineService.saveVacinnes(vaccines);
    }

    @PutMapping("/upd")
    public void upd(@RequestBody Vaccine vaccine){
        vaccineService.upd(vaccine);
    }

    @GetMapping("/listAll")
    public List<Vaccine> vaccineList(){
        return vaccineService.getVaccines();
    }
    @GetMapping("/vaccineById/{id}")
    public Vaccine findVaccineById(@PathVariable int id){
        return vaccineService.getVaccineById(id);
    }
    @GetMapping("/vaccineByVaccineType/{type}")
    public Vaccine findVaccineByVaccineType(@PathVariable String vaccineType){
        return vaccineService.getVaccineByVaccineType(vaccineType);
    }

    @DeleteMapping("/vaccine/delete/{id}")
    public String deleteVaccine(@PathVariable int id){
        return vaccineService.deleteVaccine(id);
    }
}

