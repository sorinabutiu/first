package com.example.vaccine.project.service;

import com.example.vaccine.project.entity.Vaccine;
import com.example.vaccine.project.repository.VaccineRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
@Service
@AllArgsConstructor
@Transactional
public class VaccineService {
    @Autowired
    private VaccineRepository repository;

    public Vaccine saveVaccine(Vaccine vaccine){
        return repository.save(vaccine);
    }

    public List<Vaccine> saveVacinnes(List<Vaccine> vaccines){
        return repository.saveAll(vaccines);
    }

    //get methods
    public List<Vaccine> getVaccines(){
        return repository.findAll();
    }
    public Vaccine getVaccineById(int id){return repository.findById(id).orElse(null);}
    public Vaccine getVaccineByVaccineType(String vaccineType) {return repository.findByVaccineType(vaccineType);}

    public String deleteVaccine(int id){
        repository.deleteById(id);
        return "vaccine removed"+id;
    }
    public void upd(Vaccine vaccine){

        repository.updateVaccineNrAndFreeze(vaccine.getVaccineNumber(), vaccine.isFreezed(), vaccine.getId());
    }
}
