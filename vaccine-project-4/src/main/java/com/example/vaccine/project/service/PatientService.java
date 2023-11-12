package com.example.vaccine.project.service;

import com.example.vaccine.project.entity.Patient;
import com.example.vaccine.project.repository.PatientRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@AllArgsConstructor
@Transactional
public class PatientService {
    @Autowired
    private PatientRepository repository;

    public Patient savePatient(Patient patient){
        return repository.save(patient);
    }

    public List<Patient> savePatients(List<Patient> patients){
        return repository.saveAll(patients);
    }

    //get methods
    public List<Patient> getPatients(){
        return repository.findAll();
    }
    public Patient getPatientById(int id){return repository.findById(id).orElse(null);}
    public Patient getPatientAge(int age){return repository.findByAge(age);}

    public String deletePatient(int id){
        repository.deleteById(id);
        return "patient removed"+id;
    }
    public void upd(Patient patient){

        repository.updatePatientisMarriedAndVaccinated(patient.isMarried(), patient.isVaccinated(), patient.getId());
    }
}
