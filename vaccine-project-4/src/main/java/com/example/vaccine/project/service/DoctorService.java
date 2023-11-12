package com.example.vaccine.project.service;

import com.example.vaccine.project.entity.Doctor;
import com.example.vaccine.project.entity.Vaccine;
import com.example.vaccine.project.repository.DoctorRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@AllArgsConstructor
@Transactional
public class DoctorService {
    @Autowired
    private DoctorRepository repository;

    //post methods
    public Doctor saveDoctor(Doctor doctor){
        return repository.save(doctor);
    }
    public List<Doctor> saveDoctors(List<Doctor> doctors){
        return repository.saveAll(doctors);
    }

    //get methods
    public List<Doctor> getDoctors(){
        return repository.findAll();
    }
    public Doctor getDoctorById(int id){
        return repository.findById(id).orElse(null);
    }
    public Doctor getDoctorByLastName(String lastName){
        return repository.findByLastName(lastName);
    }

    public String deleteDoctor(int id){
        repository.deleteById(id);
        return "doctor removed"+id;
    }
    public void upd(Doctor doctor){

        repository.updateDoctorType(doctor.getEMail(), doctor.getId());
    }
}
