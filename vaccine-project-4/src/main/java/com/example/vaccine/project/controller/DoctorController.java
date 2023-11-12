package com.example.vaccine.project.controller;

import com.example.vaccine.project.entity.Doctor;
import com.example.vaccine.project.entity.Patient;
import com.example.vaccine.project.entity.Vaccine;
import com.example.vaccine.project.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/doc")
public class DoctorController {

    @Autowired
    private DoctorService doctorService;

    @PostMapping("/addDoctor")
    public Doctor addDoctor(@RequestBody Doctor doctor) {
        return doctorService.saveDoctor(doctor);
    }

    @PostMapping("/addDoctors")
    public List<Doctor> addDoctors(@RequestBody List<Doctor> doctors) {
        return doctorService.saveDoctors(doctors);
    }

    @PutMapping("/upd")
    public void upd(@RequestBody Doctor doctor){
        doctorService.upd(doctor);
    }

    @GetMapping("/listAll")
    public List<Doctor> doctorsList(){
        return doctorService.getDoctors();
    }

    @GetMapping("/doctorById/{id}")
    public Doctor findDoctorById(@PathVariable int id) {
        return doctorService.getDoctorById(id);
    }

    @GetMapping("/doctor/{lastName}")
    public Doctor findDoctorByLastName(@PathVariable String lastName) {
        return doctorService.getDoctorByLastName(lastName);
    }

    @DeleteMapping("/doctor/delete/{id}")
    public String deleteDoctor(@PathVariable int id) {
        return doctorService.deleteDoctor(id);
    }
}