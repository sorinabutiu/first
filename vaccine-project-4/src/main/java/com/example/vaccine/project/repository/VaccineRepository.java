package com.example.vaccine.project.repository;

import com.example.vaccine.project.entity.Vaccine;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface VaccineRepository extends JpaRepository<Vaccine,Integer>{

    Vaccine findByVaccineType(String vaccineType);

    @Modifying
    @Query("Update Vaccine v SET v.vaccineNumber = :vaccineNumber, v.isFreezed = :isFreezed WHERE v.id = :id")
    void updateVaccineNrAndFreeze(int vaccineNumber, boolean isFreezed, int id);
}
