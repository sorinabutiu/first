package com.example.vaccine.project.controller;

import com.example.vaccine.project.entity.Patient;
import com.example.vaccine.project.entity.Vaccine;
import com.example.vaccine.project.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/pat")
public class PatientController {

    @Autowired
    private PatientService patientService;

    @PostMapping("/addPatient")
    public Patient addPatient(@RequestBody Patient patient) {
        return patientService.savePatient(patient);
    }

    @PostMapping("/addPatients")
    public List<Patient> addPatients(@RequestBody List<Patient> patients) {
        return patientService.savePatients(patients);
    }

    @PutMapping("/upd")
    public void upd(@RequestBody Patient patient){
        patientService.upd(patient);
    }

    @GetMapping("/listAll")
    public List<Patient> patientsList(){
        return patientService.getPatients();
    }

    @GetMapping("/patientById/{id}")
    public Patient findPatientById(@PathVariable int id) {
        return patientService.getPatientById(id);
    }

    @GetMapping("/patient/{age}")
    public Patient findPatientByAge(@PathVariable Integer age) {
        return patientService.getPatientAge(age);
    }

    @DeleteMapping("/patient/delete/{id}")
    public String deletePatient(@PathVariable int id) {
        return patientService.deletePatient(id);
    }
}
